package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2024-01-07 21:02
 * @desc TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountOptLogListRespDTO implements Serializable {

    @ApiModelProperty("操作栏目code，参见SectionEnum")
    private Integer sectionCode;

    @ApiModelProperty("操作页面code，参见PageEnum")
    private Integer pageCode;

    @ApiModelProperty("操作类型")
    private Integer optType;

    @ApiModelProperty("操作功能")
    private String optFuncDesc;

    @ApiModelProperty("操作对象")
    private String optObj;

    @ApiModelProperty("操作人")
    private String optUsername;

    @ApiModelProperty("操作用户类型")
    private Integer optUserType;

    @ApiModelProperty("所属商户名称")
    private String merchantName;

    @ApiModelProperty("所属商户ID")
    private Long merchantId;

    @ApiModelProperty("操作IP")
    private String optIp;

    @ApiModelProperty("操作前")
    private String optBefore;

    @ApiModelProperty("操作后")
    private String optAfter;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;
}
