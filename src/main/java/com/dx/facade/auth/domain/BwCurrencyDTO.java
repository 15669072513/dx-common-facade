package com.dx.facade.auth.domain;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;

import lombok.Data;

/**
 * 包网货币DTO
 */
@Data
public class BwCurrencyDTO {

    private String code;
    private String desc;
    private String symbol;

    public BwCurrencyDTO(String code, String desc, String symbol) {
        this.code = code;
        this.desc = desc;
        this.symbol = symbol;
    }

	
	public static String getDesc(List<BwCurrencyDTO> list, String code) {
		BwCurrencyDTO anEnum = getType(list,code);
		return Objects.nonNull(anEnum) ? anEnum.desc : "";
	}
	
	public static String getSymbol(List<BwCurrencyDTO> list, String code) {
		BwCurrencyDTO anEnum = getType(list,code);
		return Objects.nonNull(anEnum) ? anEnum.symbol : "";
	}
	
	public static String getCode(List<BwCurrencyDTO> list, String code) {
		BwCurrencyDTO anEnum = getType(list,code);
		return Objects.nonNull(anEnum) ? anEnum.code : "";
	}
	
	public static BwCurrencyDTO getType(List<BwCurrencyDTO> list,  String code) {
		for (BwCurrencyDTO bwCurrencyDTO : list) {
			if(code.equals(bwCurrencyDTO.getCode())) {
				return bwCurrencyDTO;
			}
		}
		return null;
	}
	
	public static String getSymbolAmount(List<BwCurrencyDTO> list, String str, BigDecimal decimal) {
  
		BwCurrencyDTO anEnum = getType(list,str);
		String symbol = Objects.nonNull(anEnum) ? anEnum.symbol : "";
		String res;
		switch (symbol){
			case "¥":
				res = format("¥ ###,###.##",decimal);
				break;
			case "₫":
				res = format("₫ ###,###.##K",decimal.divide(BigDecimal.valueOf(1000)));
				break;
			case "฿":
				res = format("฿ ###,###.##",decimal);
				break;
			case "$":
				res = format("$ ###,###.##",decimal);
				break;
			default:
				res = "";
				break;
		}
		return res;
	}
	
	private static String format(String pattern, BigDecimal decimal){
		DecimalFormat df = new DecimalFormat(pattern);
		return df.format(decimal);
	}
}
