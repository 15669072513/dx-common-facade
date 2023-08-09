package com.dx.facade.common.utils;

import com.github.javafaker.Faker;
import org.springframework.context.i18n.LocaleContextHolder;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Dealer
 * @description:
 * @date 2023/08/05
 * @copyright
 */
public class DataFakeUtil {

    public static Faker faker = new Faker(LocaleContextHolder.getLocale());

    public static <T> T fillWithProperties(T t) {
        try {
            List<Method> methods = Arrays.stream(t.getClass().getMethods())
                    .filter(m -> (m.getName().startsWith("set")
                            && m.getParameterTypes().length == 1))
                    .collect(Collectors.toList());

            for (Method method : methods) {
                method.invoke(t, randomT(method.getParameterTypes()[0]));
            }

            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T randomT(Class<T> t) {
        if (t == BigDecimal.class) {
            return (T) (new BigDecimal(faker.number().randomDouble(10000, 1, 10000)).setScale(4, RoundingMode.HALF_UP));

        } else if (t == Integer.class) {
            return (T) (Integer.valueOf(faker.random().nextInt(1, 10000)));

        } else if (t == Long.class) {
            return (T) Long.valueOf(faker.random().nextLong(10000L));

        } else if (t == String.class) {
            return (T) faker.name().fullName();
        }
        return null;
    }

}
