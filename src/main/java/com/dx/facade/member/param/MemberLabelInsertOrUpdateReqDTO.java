package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 会员标签-新增（编辑）请求封装参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/02
 */
@ApiModel(value = "会员标签-新增编辑请求封装参数", description = "会员标签-新增编辑请求封装参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberLabelInsertOrUpdateReqDTO implements Serializable {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value="商户id")
    @NotNull(message = "商户id不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
//    @NotNull(message = "商户名称不能为空")
    private String merchantName;

    @ApiModelProperty("账号类型（0-会员标签 1-代理标签）")
//    @NotNull(message = "账号类型不能为空")
    @Max(value = 1,message = "账号类型错误（0-会员标签 1-代理标签）")
    @Min(value = 0,message = "账号类型错误（0-会员标签 1-代理标签）")
    private Integer labelType;

    @ApiModelProperty("标签名称")
    @NotNull(message = "标签名称不能为空")
    @Length(min = 2, max = 20, message = "请输入2-20个字符")
    private String labelName;

    @ApiModelProperty("标签描述")
    @NotNull(message = "标签描述不能为空")
    @Length(min = 2, max = 500, message = "请输入2-500个字符")
    private String labelDesc;

    @ApiModelProperty(value = "打上这个标签的人数",hidden = true)
    private Integer labelUsedNum;

    @ApiModelProperty(value = "创建人",hidden = true)
    private String createdBy;

    @ApiModelProperty(value = "创建时间",hidden = true)
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "最后操作人",hidden = true)
    private String updatedBy;

    @ApiModelProperty(value = "最后操作时间",hidden = true)
    private LocalDateTime updatedAt;

}