package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 新增会员审核表
 * </p>
 *
 * @author Jackma
 * @since 2022-09-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "AddMemberAuditPO详情对象返回值", description = "AddMemberAuditPO详情对象返回值")
public class MemberAuditDetailResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("会员账号")
    private String userName;

//    @ApiModelProperty("盐")
//    private String salt;
//
    @ApiModelProperty("会员密码")
    private String password;

    @ApiModelProperty("会员手机号码")
    private String mobile;

    @ApiModelProperty("性别 男, 女")
    private String gender;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("会员真实姓名")
    private String realName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("vip等级id")
    private Long vipId;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;
    
	@ApiModelProperty(value = "注册IP", hidden = true)
	private String registerIp;
	
	@ApiModelProperty(value = "注册设备号", hidden = true)
	private String registerDeviceNo;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @ApiModelProperty("锁单时间")
    private LocalDateTime lockDatetime;

    @ApiModelProperty("锁单人")
    private String lockName;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("审核完成时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime auditDatetime;

    @ApiModelProperty("审核人")
    private String auditName;

    @ApiModelProperty("审核备注")
    private String auditRemark;

    @ApiModelProperty("单号")
    private String eventId;

    @ApiModelProperty("申请人")
    private String applyName;

    @ApiModelProperty("申请备注")
    private String applyRemark;

    @ApiModelProperty("申请时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

}
