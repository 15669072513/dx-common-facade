package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Yinter
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMerchantRespDTO {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("支付厂商")
    private String paymentMerchantName;

    @ApiModelProperty("厂商名称code，按枚举定义的code保存")
    private Integer paymentMerchantNameCode;

    @ApiModelProperty("厂商名称描述，按枚举定义的desc保存")
    private String paymentMerchantNameDesc;

    @ApiModelProperty("厂商类型，1：入款，2：出款")
    private Integer paymentMerchantType;

    @ApiModelProperty("厂商编码")
    private String paymentMerchantCode;

    @ApiModelProperty("公钥")
    private String publicKey;

    @ApiModelProperty("私钥")
    private String privateKey;

    @ApiModelProperty("请求url")
    private String requestUrl;

    @ApiModelProperty("向第三方查询支付状态的url")
    private String resultUrl;

    @ApiModelProperty("回调url")
    private String notifyUrl;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;
}
