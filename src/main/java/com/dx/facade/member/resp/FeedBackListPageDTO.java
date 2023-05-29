package com.dx.facade.member.resp;

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
public class FeedBackListPageDTO {
    @ApiModelProperty(value = "会员账号", example = "zhang")
    private String userName;

    @ApiModelProperty(value = "用户头像", example = "http://aliyun/header")
    private String headerUrl;

    @ApiModelProperty(value = "问题类型(0:存款问题,1-取款问题,2-游戏问题,3-优惠问题,4-网站/app登录,5-修改资料,6-流水问题,7-其他)", example = "0")
    private Integer problemType;



    @ApiModelProperty(value = "问题描述", example = "zhang")
    private String problemDescribe;

    @ApiModelProperty(value = "附件url", example = "http://aliyun/url")
    private String url;

    @ApiModelProperty(value = "创建时间", example = "2021-04-28 14:34:52")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createDt;
}
