package com.dx.facade.member.member.resp;

import com.dx.util.DateUtil;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Objects;


/**
 * @Description: 会员 文档对象封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/4/11 16:10
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberListByWindControlInfoRespDto {
	
	@ApiModelProperty(value = "会员id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty(value = "用户名")
	private String userName;
	
	@ApiModelProperty(value = "账锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "注册时间")
	private String createDt;
	
	@ApiModelProperty(value = "最后登录时间")
	private String lastLoginTime;
	
	public static MemberListByWindControlInfoRespDto convertToMemberListByWindControlInfoRespDto(MemberInfoRespDTO item) {
		if (item == null) {
			return null;
		}
		MemberListByWindControlInfoRespDto result = new MemberListByWindControlInfoRespDto();
		result.setId(item.getId());
		result.setUserName(item.getUserName());
		result.setLoginLockStatus(item.getLoginLockStatus());
		result.setCreateDt(Objects.nonNull(item.getCreatedAt()) ? DateUtil.formatDate(item.getCreatedAt()) : null);
		result.setLastLoginTime(Objects.nonNull(item.getLastLoginDatetime()) ? DateUtil.localDateTimeFormatDate(item.getLastLoginDatetime()) : null);
		return result;
	}
}
