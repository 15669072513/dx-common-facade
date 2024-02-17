package com.dx.facade.venue.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString
public class BatchBettingRecordReq extends PageRequest {

    @ApiModelProperty(value = "会员ID列表", required = true)
    //@NotNull(message = "会员ID不能为空")
    private List<Long> memberIdList;

    /**
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    /**
     * 会员账号
     */
    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty(value = "场馆类型,zr:真人,ty:体育,cp:彩票,qp:棋牌,dj:电竞", required = true)
    //@NotBlank(message = "场馆类型不能为空")
    private String venueType;

    @ApiModelProperty(value = "注单状态3-全部，1-已结算，0-未结算, 2-已取消/不结算", required = true)
    @Range(min = 0, max = 3, message = "注单状态错误,只能0-3")
    private Integer betStatus;

    @ApiModelProperty(value = "开始时间，单位时间戳", required = true)
    @NotNull(message = "开始时间不能为空")
    private Long beginTime;

    @ApiModelProperty(value = "结束时间，单位时间戳", required = true)
    @NotNull(message = "结束时间不能为空")
    private Long endTime;
}
