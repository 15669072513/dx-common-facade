package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @version 1.0.0
 * @auther: sid
 * @Date: 2021/5/21
 * @Description: 意见反馈请求参数
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedBackListRpcReq {
    @ApiModelProperty(value = "当前页数")
    @NotNull(message = "当前页数不能为空")
    private Long pageNum;

    @ApiModelProperty(value = "每页大小")
    @NotNull(message = "每页大小不能为空")
    private Long pageSize;

//    @ApiModelProperty(value = "商户ID")
//    @NotNull(message = "商户ID不能为空")
//    private Long merchantId;

    @ApiModelProperty(value = "商户ID集合",hidden = true)
    private List<Long> merchantIds;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "用户userId")
    private Long userId;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "问题类型(0:存款问题,1-取款问题,2-游戏问题,3-优惠问题,4-网站/app登录,5-修改资料,6-流水问题,7-其他)", example = "0")
    private Integer problemType;

    @ApiModelProperty(value = "开始时间")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    private String endTime;

//    @ApiModelProperty(value = "排序方式：desc-降序 asc-升序", example = "asc")
//    private String orderType;

}
