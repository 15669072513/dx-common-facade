package com.dx.facade.member.param;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "com-bw-pojo-req-member-MemberInfoEditParam", description = "批量修改会员信息编辑 BatchMemberInfoEditParam")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BatchMemberInfoEditParam implements Serializable {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> userIdList;


    @ApiModelProperty(value = "商户编码")
    private String merchantCode;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "申请人")
    private String applyName;

    @ApiModelProperty(value = "账号状态 修改后内容")
    private MemberInfoRpcEditAccountStatus accountStatusAfter;

    @ApiModelProperty(value = "信用等级 修改后内容")
    private MemberInfoRpcEditCreditLevel creditLevelAfter;


}
