package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 访问统计数据-统计 请求参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/02/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityVisitDataCountReqDto {
	
    @ApiModelProperty(value = "商户id", example = "588326785867908888L",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
	
	@ApiModelProperty(value = "活动ID", example = "588326785867908888L",required = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long activityId;
    
    @ApiModelProperty(value = "访问时间-开始", example = "2022-02-22 00:55:08")
    private String visitTimeStart;
    
    @ApiModelProperty(value = "访问时间-截止", example = "2022-05-22 12:55:08")
    private String visitTimeEnd;
	
}
