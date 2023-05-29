package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author fitz
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLevelConfRespDTO {
	
	/**
	 * 代理层级
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	/**
	 * 层级名称
	 */
	private String levelName;
	
}
