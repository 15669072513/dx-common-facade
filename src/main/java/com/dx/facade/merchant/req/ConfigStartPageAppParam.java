package com.dx.facade.merchant.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 启动页/loading配置 分页入参
 * </p>
 *
 * @author neko
 * @since 2021-06-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ObConfigStartPagePageReq对象APP", description="ObConfigStartPagePageReq对象APP")
public class ConfigStartPageAppParam extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    //@NotNull(message = "商户ID不能为空")
    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantClientId;

//    @ApiModelProperty(value = "商户id", hidden = true)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private List<Long> merchantIds;

    @ApiModelProperty(value = "显示终端[0:APP端,1:H5端,2:PC端]")
    private Integer clientType;

//    @ApiModelProperty(value = "启动页(场馆)名称")
//    @Size(max = 20,message = "启动页长度在0-20")
//    private String pageName;

//    @ApiModelProperty(value = "是否预加载[0:否,1:是]")
//    private Integer loadStatus;
//
//    @ApiModelProperty(value = "状态[0:已禁用,1:开启中]")
//    private Integer pageStatus;
//
//    @Size(max = 15,message = "创建人长度在0-15")
//    @ApiModelProperty(value = "创建人")
//    private String createdBy;
//
//    @Size(max = 15,message = "修改人长度在0-15")
//    @ApiModelProperty(value = "修改人")
//    private String updatedBy;

    //@NotNull(message = "配置类型错误[0:场馆图配置,1:闪屏页配置]")
    @Max(value = 1,message = "配置类型错误[0:场馆图配置,1:闪屏页配置]]")
    @Min(value = 0,message = "配置类型错误[0:场馆图配置,1:闪屏页配置]")
    @ApiModelProperty(value = "配置类型[0:场馆图配置,1:闪屏页配置]")
    private Integer configType;

//    @ApiModelProperty(value = "降序字段[created_at,updated_at]")
//    private String orderDesc;
//
//    @ApiModelProperty(value = "升序字段[created_at,updated_at]")
//    private String orderAsc;
//
//    /**
//     * created_at,updated_at
//     */
//    @ApiModelProperty(value = "排序列:0-创建时间 1-最近操作时间")
//    private Integer orderKey;
//
//    @ApiModelProperty(value = "排序方式:desc-降序 asc-升序")
//    private String orderType;

}
