package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinCodeInfoRespDTO {

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("商户层级路径")
    private String merchantPath;

    @ApiModelProperty("父级商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentMerchantId;

    @ApiModelProperty("父级商户层级路径")
    private String parentMerchantPath;

    @ApiModelProperty("主商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long topMerchantId;

    @ApiModelProperty("主商户名称")
    private String topMerchantName;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

}
