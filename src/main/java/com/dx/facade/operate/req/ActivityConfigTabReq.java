package com.dx.facade.operate.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: AC
 * @Description: TODO
 * @Date: 2022/09/29 14:36
 */
@Data
@ApiModel(value = "商户优惠活动页签入参", description = "商户活动页签入参")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityConfigTabReq implements Serializable {

    @NotNull(message = "商户ID不能为空")
    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("活动类型[1:优惠,2:VIP,3:赞助]")
    @Range(min = 1, max = 3, message = "活动类型错误")
    private Integer activityType;

}
