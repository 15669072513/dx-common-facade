package com.dx.facade.account.resp;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

import com.dx.facade.member.resp.MemberInfoRespDTO;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BonusAuditRespDTO {

    @ApiModelProperty(value = "红利审核结果列表")
    private List<ActivityBonusAuditRespDTO> updPOS;

    @ApiModelProperty(value = "列表对应的用户信息")
    private Map<Long, MemberInfoRespDTO> memberMap;
}
