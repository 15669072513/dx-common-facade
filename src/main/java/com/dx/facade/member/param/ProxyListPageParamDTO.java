package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 代理列表分页 查询请求参数封装
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyListPageParamDTO {

    @ApiModelProperty(value = "商户id列表")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIdLs;

    @ApiModelProperty(value = "时间类型：1-注册时间 2-最好登录时间")
    private Integer timeType;

    @ApiModelProperty(value = "开始时间")
    private String timeStart;

    @ApiModelProperty(value = "截止时间")
    private String timeEnd;

    /** 账号类型：1-代理账号 2-总代账号 */
    @ApiModelProperty(value = "账号类型：1-代理账号 2-总代账号")
    private Integer nameType;

    @ApiModelProperty(value = "代理账号/总代账号")
    private String name;

    /** 是否全部下级：false-直属下级 true-全部下级 */
    @ApiModelProperty(value = "是否全部下级：false-直属下级 true-全部下级")
    private Boolean isAllSub;
    
	@ApiModelProperty(value = "是否查询自身：false-不查自身 true-查自身")
	private Boolean isSelf;
    
    @ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）")
    private List<String> accountType;
    
    @ApiModelProperty(value = "账号状态（1正常，2登录锁定，3充提锁定）")
    private Integer accountStatus;

    @ApiModelProperty("信用等级")
    private Integer creditLevel;

    @ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer registerDeviceType;

    @ApiModelProperty(value = "入口权限（0-关闭 1-开启）")
    private String entryAuthority;

    @ApiModelProperty("契约模式 0-无契约 1-无返点 2-无佣金")
    private Integer contractModel;

    @ApiModelProperty(value = "待签约代理账号")
    private List<String> signingUserName;

    @ApiModelProperty("排序列 1：注册时间 默认注册时间")
    private Integer orderKey;

    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;
    
    @ApiModelProperty("合营码")
    private String joinCode;

    @ApiModelProperty("佣金模式 1：返点模式 2：返佣模式")
    private Integer commissionMode;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

}
