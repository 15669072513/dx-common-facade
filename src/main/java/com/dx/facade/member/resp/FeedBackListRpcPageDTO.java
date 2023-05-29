package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


/**
 * @version 1.0.0
 * @auther: sid
 * @Date: 2021/5/21
 * @Description: 意见反馈响应参数
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedBackListRpcPageDTO {

    @ApiModelProperty(value = "反馈id ")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "会员账号", example = "zhang")
    private String userName;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）", example = "1")
    private Integer accountType;

    @ApiModelProperty(value = "标签名称", example = "测试")
    private String labelName;

    @ApiModelProperty(value = "会员等级id",example = "2")
    private Integer levelId;

    @ApiModelProperty(value = "问题类型(0:存款问题,1-取款问题,2-游戏问题,3-优惠问题,4-网站/app登录,5-修改资料,6-流水问题,7-其他)", example = "0")
    private Integer problemType;

    @ApiModelProperty(value = "问题描述", example = "zhang")
    private String problemDescribe;

    @ApiModelProperty(value = "附件url", example = "http://aliyun/url")
    private String url;

    @ApiModelProperty(value = "创建时间", example = "2021-04-28 14:34:52")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createDt;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;
}
