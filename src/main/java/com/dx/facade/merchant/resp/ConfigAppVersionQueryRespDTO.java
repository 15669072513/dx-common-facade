package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-13 06:27:53
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigAppVersionQueryRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户唯一标识", example = "111111")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long merchantId;

    @ApiModelProperty(value = "商户名称", example = "111111")
    public String merchantName;

    @ApiModelProperty(value = "版本号")
    private String version;

    @ApiModelProperty(value = "项目类型[0:OB旗舰,1:美播真人,2:JAV]")
    private Integer subType;

    @ApiModelProperty(value = "状态[0:待开启,1:开启中]")
    private Integer status;

    @ApiModelProperty(value = "终端[0:Android,1:IOS]")
    private Integer clientType;

    @ApiModelProperty(value = "版本更新方式[0:弱更新,1:强更新]")
    private Integer updateType;

    @ApiModelProperty(value = "主题信息")
    private String title;

    @ApiModelProperty(value = "更新内容")
    private String content;

    @ApiModelProperty(value = "下载地址")
    private String downloadUrl;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdAt;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;
}
