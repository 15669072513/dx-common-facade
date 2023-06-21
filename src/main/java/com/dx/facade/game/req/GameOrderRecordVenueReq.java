package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * 注单查询对象
 */
@ApiModel("注单查询对象")
@Data
public class GameOrderRecordVenueReq extends BaseRequest {

    @ApiModelProperty("所属商户")
    private Long merchantId;
    @ApiModelProperty("注单状态")
    private Integer status;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty("注单号")
    private Long id;
    @ApiModelProperty("玩家账号")
    private String userName;
    @ApiModelProperty("终端类型")
    private Integer deviceType;
    @ApiModelProperty("ip地址")
    private String ipAddr;
    @ApiModelProperty("投注金额")
    private String minBetChip;
    @ApiModelProperty("投注金额")
    private String maxBetChip;
    @ApiModelProperty("会员输赢")
    private String minNetChip;
    @ApiModelProperty("会员输赢")
    private String maxNetChip;


}
