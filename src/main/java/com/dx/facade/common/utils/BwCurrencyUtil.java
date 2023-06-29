package com.dx.facade.common.utils;

import com.dx.facade.enums.BwCurrencyEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class BwCurrencyUtil {
    public static final char EXCEL_NEWLINE = (char) 10;
    private static  DecimalFormat formatterVND= new DecimalFormat("#,###");
    private static  DecimalFormat formatter = new DecimalFormat("#,##0.0000");

    /**
     *
     * 	将单货币的列表对象字段，拷贝到excel对象的同名字字段中(格式化并带上货币符号)
     * 	列表对象												excel对象
     * 	BigDecimal amountB(5.0), 货币(CNY)           =>        String amountB (Y5.0000)
     * 	BigDecimal amountB(5.0), 货币(VND)           =>        String amountB (₫5)
     * @param filedNamePrefixAndAmount 字段名和对应的金额
     * @param currency 货币
     * @param targetObj 目标对象
     * @see BwCurrencyUtil#copyAmount2StringValueWithSymbol(Object, String, Object)
     */
    @Deprecated
    public static void copyAmount2StringValueWithSymbol(Map<String, BigDecimal> filedNamePrefixAndAmount, String currency, Object targetObj) {
        BwCurrencyEnum currencyEnum = getCurrency(currency);
        String currencySymbol = Optional.ofNullable(currencyEnum)
                .map(BwCurrencyEnum::getSymbol)
                .orElse("-");

        filedNamePrefixAndAmount.forEach((key, amount) -> {
            setValueByName(targetObj, getSymbolWithAmount(currencySymbol, amount), key);

        });
    }



    /**
     * 格式化对象中的货币字段
     * 	格式化之前												格式化之后
     * 	BigDecimal amountBInCNY (5.0)             =>            BigDecimal amountBInCNY (5.0000)
     * 	BigDecimal amountBInVND (17.0)                          BigDecimal amountBInVND (17)
     * @param target 待格式化目标对象
     */
    public static void formatCurrencyDecimalField(Object target) {
        if(Objects.isNull(target)){
            return ;
        }
        Field[] fields = target.getClass().getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            if(fieldName.length() <= 3 || !field.getType().isAssignableFrom(BigDecimal.class)) {
                continue;
            }
            String nameSuffix = fieldName.substring(fieldName.length() - 3);
            BwCurrencyEnum currency = getCurrency(nameSuffix);
            if(Objects.isNull(currency)){
                continue;
            }
            BigDecimal tmpValue = getBigDecimalValue(target, fieldName);
            setValueByName(target, formatDecimalBySymbol(currency.getSymbol(),tmpValue), fieldName);
        }
    }

    /**
     * 将单货币的列表对象字段，拷贝到excel对象的同名字字段中(格式化并带上货币符号)
     * 列表对象												excel对象
     * BigDecimal amountB(5.0), 货币(CNY)           =>        String amountB (Y5.0000)
     * BigDecimal amountB(5.0), 货币(VND)           =>        String amountB (₫5)
     * @param sourceObj
     * @param currency
     * @param targetObj
     */
    public static void copyAmount2StringValueWithSymbol(Object sourceObj, String currency, Object targetObj) {
        BwCurrencyEnum currencyEnum = getCurrency(currency);
        String currencySymbol = Optional.ofNullable(currencyEnum)
                .map(BwCurrencyEnum::getSymbol)
                .orElse("-");
        Field[] declaredFields = sourceObj.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Object valueByField = getValueByField(sourceObj, declaredField);
            BigDecimal decimal = value2BigDecimal(valueByField);
            if (Objects.nonNull(decimal)) {
                setValueByName(targetObj, getSymbolWithAmount(currencySymbol, decimal), declaredField.getName());
            }
        }
    }

    public static void copyAmount2StringValueWithSymbolGetter(Object sourceObj, String currency, Object targetObj) {
        BwCurrencyEnum currencyEnum = getCurrency(currency);
        String currencySymbol = Optional.ofNullable(currencyEnum)
                .map(BwCurrencyEnum::getSymbol)
                .orElse("-");

        Field[] declaredFields = targetObj.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Object valueByGetter = getValueByGetter(sourceObj, declaredField);
            BigDecimal decimal = value2BigDecimal(valueByGetter);
            if (Objects.nonNull(decimal)) {
                setValueByName(targetObj, getSymbolWithAmount(currencySymbol, decimal), declaredField.getName());
            }
        }
    }

    private static Object getValueByGetter(Object targetObj, Field targetField) {
        if (targetField != null) {
            String getMethodName = String.format("%s%s", "get", StringUtils.capitalize(targetField.getName()));
            Method method = ReflectionUtils.findMethod(targetObj.getClass(), getMethodName);
            if(method != null) {
                try {
                    Object tmpValue = method.invoke(targetObj);
                    //强制修正bigDecimal从 null为0
                    if(Objects.isNull(tmpValue) && targetField.getType().isAssignableFrom(BigDecimal.class)) {
                        tmpValue = BigDecimal.ZERO;
                    }
                    return tmpValue;
                } catch (IllegalAccessException | InvocationTargetException e) {
                    log.info("getter method filed error");
                }
            }
        }
        return null;
    }


    private static void setValueByName(Object targetObj, Object amount, String targetFieldName) {
        if (amount == null) {
            return;
        }
        Field targetField = ReflectionUtils.findField(targetObj.getClass(), targetFieldName);
        if (targetField == null) {
            return;
        }
        targetField.setAccessible(true);


        if (targetField.getType().isAssignableFrom(amount.getClass())) {
            ReflectionUtils.setField(targetField, targetObj, amount);
            return;
        }
        if (targetField.getType().isAssignableFrom(String.class)) {
            ReflectionUtils.setField(targetField, targetObj, amount.toString());
            return;
        }
    }

    private static Object getValueByName(Object targetObj, String targetFieldName) {
        Field targetField = ReflectionUtils.findField(targetObj.getClass(), targetFieldName);
        return getValueByField(targetObj, targetField);
    }

    private static Object getValueByField(Object targetObj, Field targetField) {
        if (targetField != null) {
            targetField.setAccessible(true);
            Object tmpValue = ReflectionUtils.getField(targetField, targetObj);
            //强制修正bigDecimal从 null为0
            if(Objects.isNull(tmpValue) && targetField.getType().isAssignableFrom(BigDecimal.class)) {
                tmpValue = BigDecimal.ZERO;
            }
            return tmpValue;
        }
        return null;
    }

    private static String getSymbolWithAmount(String symbol, BigDecimal amount) {
        if (StringUtils.isBlank(symbol) || Objects.isNull(amount)) {
            return "";
        }
        DecimalFormat format = formatter;
        if(BwCurrencyEnum.VND.getSymbol().equals(symbol)) {
            format = formatterVND;
        }
        BigDecimal result = formatDecimalBySymbol(symbol, amount);
        String formatStr = format.format(result);

        return String.format("%s%s", symbol, formatStr);
    }

    public static String symbolWithAmount(String symbol, BigDecimal amount) {
        return getSymbolWithAmount(symbol,amount);
    }

    private static BigDecimal formatDecimalBySymbol(String symbol, BigDecimal amount) {
        BigDecimal newAmount = amount;
        if(Objects.isNull(amount)) {
            newAmount = BigDecimal.ZERO;
        }
        if (BwCurrencyEnum.VND.getSymbol().equalsIgnoreCase(symbol)) {
            return newAmount.setScale(0, RoundingMode.DOWN);
        }

        return newAmount.setScale(4, RoundingMode.HALF_UP);
    }

    /**
     * 单货币的小计方法
     * 	列表对象											  小计对象
     * 	BigDecimal amountB(5.0), 货币(CNY)           =>       BigDecimal amountBInCNY 5.0
     * 	BigDecimal amountB(7.0), 货币(VND)                    BigDecimal amountBInVND 7.0
     * @param objs
     * @param currencyFun
     * @param sumObj
     * @param <R>
     */
    public static <R> void currencySumAndSet(List<R> objs, Function<R, String> currencyFun, Object sumObj) {
        if (CollectionUtils.isEmpty(objs)) {
            return;
        }

        final BigDecimal zero = BigDecimal.ZERO;
        List<String> sumNames = getFieldNames(sumObj);
        Map<String, Object> amountWithTargetFieldName = new HashMap<>();
        List<Field> sourceFields = getALlFields(objs.get(0).getClass());

        for (R obj : objs) {
            String currency = currencyFun.apply(obj);
            BwCurrencyEnum currencyEnum = getCurrency(currency);
            if (currencyEnum == null) {
                continue;
            }
            for (Field sourceField : sourceFields) {
                String targetName = findTargetFieldName(sourceField.getName(), currencyEnum.getCode(), sumNames);
                if (StringUtils.isBlank(targetName)) {
                    continue;
                }
                Object valueByField = getValueByGetter(obj, sourceField);
                if (sourceField.getType().isAssignableFrom(BigDecimal.class)) {
                    BigDecimal originSum = (BigDecimal) amountWithTargetFieldName.getOrDefault(targetName, zero);
                    BigDecimal newSum = BigDecimalUtil.safeAdd(originSum, value2BigDecimal(valueByField));
                    amountWithTargetFieldName.put(targetName, newSum);
                } else {
                    if (sourceField.getType().isAssignableFrom(Integer.class)) {
                        Integer originSum = (int) amountWithTargetFieldName.getOrDefault(targetName, 0);
                        Integer newSum = originSum + Optional.ofNullable(valueByField).map(x -> (int) x).orElse(0);
                        amountWithTargetFieldName.put(targetName, newSum);
                    }

                    if (sourceField.getType().isAssignableFrom(Long.class)) {
                        Long originSum = (long) amountWithTargetFieldName.getOrDefault(targetName, 0L);
                        Long newSum = originSum + Optional.ofNullable(valueByField).map(x -> (long) x).orElse(0L);
                        amountWithTargetFieldName.put(targetName, newSum);
                    }
                }
            }

        }
        amountWithTargetFieldName.forEach((tmpFieldName, tmpAmount) -> {
            setValueByName(sumObj, tmpAmount, tmpFieldName);
        });

        //fix bug 同意补全货币字段null,并格式化
        formatCurrencyDecimalField(sumObj);
    }

    /**
     * 递归获取所有属性
     * @param targetClass
     * @return
     */
    private static List<Field> getALlFields(Class<?> targetClass) {
        Class<?> searchType = targetClass;
        List<Field> allFields = new ArrayList<>();
        while (Object.class != searchType && searchType != null) {
            Field[] fields = searchType.getDeclaredFields();
           allFields.addAll(Arrays.asList(fields));
           searchType = searchType.getSuperclass();
        }
        return allFields;
    }

    private static String findTargetFieldName(String srcName, String currencyCode, List<String> targetNames) {
        if(targetNames.contains(srcName)) {
            return srcName;
        }
        final String fieldNameTemplate = "%sIn%s";

        String newNames = String.format(fieldNameTemplate, srcName, currencyCode);
        if (targetNames.contains(newNames)) {
            return newNames;
        }
        final String fieldNameTemplateTwo = "%s%s";
        newNames = String.format(fieldNameTemplateTwo, srcName, currencyCode);
        if (targetNames.contains(newNames)) {
            return newNames;
        }
        return "";
    }

    /**
     *   小计对象,无需增加货币后缀版
     * 	列表对象											  小计对象
     * 	BigDecimal amountB(5.0), 货币(CNY)           =>       BigDecimal amountBInCNY 5.0
     * 	BigDecimal amountB(7.0), 货币(VND)                    BigDecimal amountBInVND 7.0
     * @param objs
     * @param sumObj
     * @param <R>
     */
    public static <R> void currencySumAndSet(List<R> objs, Object sumObj) {
        currencySumAndSet(objs, (obj)-> "CNY", sumObj);
    }

    /**
     * 多币种的小计对象(BigDecimal)拷贝到excel对象的字段(String)，并会带上货币符号(如果有),
     * 小计对象											       excel对象
     * 	BigDecimal amountBInCNY (5.0)             =>          String amountB(Y5.0000\n₫17)
     * 	BigDecimal amountBInVND (17.0)
     * @param mCurrencyObj
     * @param targetObj
     */
    public static void multiplyCurrency2StringFiled(Object mCurrencyObj, Object targetObj) {
        multiplyCurrency2StringFiled(mCurrencyObj, targetObj, BwCurrencyEnum.values());
    }

    public static void multiplyCurrency2StringFiled(Object mCurrencyObj, Object targetObj, String currency) {
        BwCurrencyEnum currencyEnum = getCurrency(currency);
        if(Objects.isNull(currencyEnum)) {
            multiplyCurrency2StringFiled(mCurrencyObj, targetObj);
        }else{
            multiplyCurrency2StringFiled(mCurrencyObj, targetObj, currencyEnum);
        }
    }

    private static void multiplyCurrency2StringFiled(Object mCurrencyObj, Object targetObj, BwCurrencyEnum... bwCurrencyEnums) {
        Map<String, List<Pair<String, Field>>> fieldsNames = getMultiplyCurrencyField(mCurrencyObj);
        fieldsNames.forEach((fieldName, fields) -> {

            if (fields.size() == 1) {
                Field tmpField = fields.get(0).getValue();
                Object valueByField = getValueByField(mCurrencyObj, tmpField);
                setValueByName(targetObj, valueByField, fieldName);
            } else {
                StringBuilder valueBuilder = new StringBuilder();
                Map<String, Field> fieldBySymbol = fields.stream().collect(Collectors.toMap(Pair::getLeft, Pair::getValue, (v1, v2) -> v1));
                for (BwCurrencyEnum tmp : bwCurrencyEnums) {
                    BigDecimal decimalValue = null;
                    Field field = fieldBySymbol.get(tmp.getSymbol());
                    if (field != null) {
                        Object valueByField = getValueByField(mCurrencyObj, field);
                        decimalValue = value2BigDecimal(valueByField);
                    }
                    if (decimalValue == null) {
                        decimalValue = BigDecimal.ZERO;
                    }
                    valueBuilder.append(getSymbolWithAmount(tmp.getSymbol(), decimalValue)).append(EXCEL_NEWLINE);
                }
                setValueByName(targetObj, valueBuilder.toString(), fieldName);
            }
        });
    }

    private static Map<String, List<Pair<String, Field>>> getMultiplyCurrencyField(Object targetObj) {
        Map<String, List<Pair<String, Field>>> nameAndFields = new HashMap<>();
        Field[] fields = targetObj.getClass().getDeclaredFields();

        for (Field field : fields) {
            BwCurrencyEnum currency = null;
            String name = field.getName();
            int length = name.length();
            if (length >= 3) {
                String lastThreesName = name.substring(length - 3);
                currency = getCurrency(lastThreesName);
                if (currency != null) {
                    name = name.substring(0, length - 3);
                    if (name.endsWith("In")) {
                        name = name.substring(0, name.length() - 2);
                    }
                }
            }
            List<Pair<String, Field>> existsFields = nameAndFields.getOrDefault(name, new ArrayList<>());
            String symbol = Optional.ofNullable(currency).map(BwCurrencyEnum::getSymbol).orElse("");
            existsFields.add(Pair.of(symbol, field));
            nameAndFields.putIfAbsent(name, existsFields);
        }
        return nameAndFields;
    }

    private static List<String> getFieldNames(Object targetObj) {
        Field[] fields = targetObj.getClass().getDeclaredFields();
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) {
            fieldNames.add(field.getName());
        }
        return fieldNames;
    }

    private static BigDecimal getBigDecimalValue(Object targetObj, String fieldName) {
        Object fieldValue = getValueByName(targetObj, fieldName);
        return value2BigDecimal(fieldValue);
    }

    private static BigDecimal value2BigDecimal(Object fieldValue) {
        return Optional.ofNullable(fieldValue)
                .map(x -> {
                    if (x instanceof BigDecimal) {
                        return ((BigDecimal) x);
                    }
                    return null;
                })
                .orElse(null);
    }


    private static BwCurrencyEnum getCurrency(String currency) {

        for (BwCurrencyEnum tmp : BwCurrencyEnum.values()) {
            if (tmp.getCode().equalsIgnoreCase(currency)) {
                return tmp;
            }
        }
        return null;
    }
}
