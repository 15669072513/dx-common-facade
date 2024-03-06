package com.dx.facade.member.resp;

import com.dx.facade.member.param.RebateRateDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 返点比例响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "RebateRate响应DTO对象", description = "返点比例响应DTO")
public class RebateRateDetailDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商户Id")
    private Long merchantId;

    @ApiModelProperty("用户Id")
    private Long userId;

    @ApiModelProperty("用户名称")
    private String userName;

//    @ApiModelProperty("返点分配模式 1：自由模式 2:模板模式")
//    private Integer rebateAllotMode;
//
//    @ApiModelProperty("返点比率等级")
//    private Integer rebateRateLevel;
//
//    @ApiModelProperty("返点比率模板id")
//    private Long rebateRateTemplateId;
//
//    @ApiModelProperty("返点比率模板名称")
//    private String rebateRateTemplateName;

    @ApiModelProperty("团队返点比例")
    private RebateRateDTO rebateRateDTO;

    @ApiModelProperty("团队占成比例")
    private RebateRateDTO profitRateDTO;

    @ApiModelProperty("平台默认会员返水")
    private RebateRateDTO plateformDefaultDTO;

    public  static RebateRateDTO toRebateRateDTO(RebateRateRespDTO source){
        RebateRateDTO dest =  new RebateRateDTO();
        dest.setTexasRebate(source.getTexasRebate());
        dest.setTexasInsuranceRebate(source.getTexasInsuranceRebate());
        dest.setActualPersonRebate(source.getActualPersonRebate());
        dest.setSportsRebate(source.getSportsRebate());
        dest.setEsportsRebate(source.getEsportsRebate());
        dest.setChessRebate(source.getChessRebate());
        dest.setLotteryTicketRebate(source.getLotteryTicketRebate());

        dest.setId(source.getId());
        dest.setUserType(source.getUserType());
        dest.setPlatformFlag(source.getPlatformFlag());
        dest.setZhanchengFlag(source.getZhanchengFlag());

        return  dest;
    }

}
