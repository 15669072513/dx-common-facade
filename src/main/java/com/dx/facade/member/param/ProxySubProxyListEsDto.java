package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 信息面板-充提记录 取款记录返回前端参数VO
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/14
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxySubProxyListEsDto {
	
	@ApiModelProperty("代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("代理账号")
	private String userName;
	
	@ApiModelProperty("下级代理人数")
	private Integer underProxyNum;
	
	@ApiModelProperty("直属下级代理人数")
	private Integer directlyUnderProxyNum;
	
	@ApiModelProperty("下级会员人数")
	private Integer underMemberNum;
	
	@ApiModelProperty("直属下级会员人数")
	private Integer directlyUnderMemberNum;
	
	@ApiModelProperty(value = "累计首存人数")
	private Integer totalFirstDepositNum;

	@ApiModelProperty(value = "注册方式：0-手动 1-自动")
	private Integer registerType;
	
	@ApiModelProperty("注册时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createDt;
	
	@ApiModelProperty(value = "最后登录时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime lastLoginTime;
	
	@ApiModelProperty(value = "离线天数 近xx天未登录")
	private Integer offLineDays;
	
	@ApiModelProperty(value = "代理层级路径(代理账号)")
	private List<String> proxyPathUsername;
}