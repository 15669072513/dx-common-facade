package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
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
* 会员标签分页查询 返回参数
*
* @author fitz
* @version 1.0.0
* @date 2021/06/02
*/
@ApiModel(value="com-ob-member-resp-MemberLabelRpcPageRespDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelRpcPageRespDTO implements Serializable {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("账号类型 （0-会员标签 1-代理标签）")
    private Integer labelType;

    @ApiModelProperty("标签名称")
    private String labelName;

    @ApiModelProperty("标签描述")
    private String labelDesc;

    @ApiModelProperty("打上这个标签的人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer labelUsedNum;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("最后操作人")
    private String updatedBy;

    @ApiModelProperty("最后操作时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
    
//    @ApiModelProperty(value="id")
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private Long id;
//
//    /**
//     * 标签名称
//     */
//    @ApiModelProperty(value="标签名称")
//    private String memberLabelName;
//
//    /**
//     * 标签描述
//     */
//    @ApiModelProperty(value="标签描述")
//    @JsonProperty("description")
//    private String labelDesc;
//
//    @ApiModelProperty(value = "标签人数")
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private Long peopleNum;
//
//    @ApiModelProperty(value="创建人")
//    private String createdBy;
//
//    /**
//     * 创建时间
//     */
//    @ApiModelProperty(value="创建时间")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime createdAt;
//
//    @ApiModelProperty(value="最近操作时间")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime updatedAt;
//
//    @ApiModelProperty(value="最近操作人")
//    private String updatedBy;

}