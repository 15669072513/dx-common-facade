package com.dx.facade.report.req.report;

import com.dx.facade.report.resp.agent.ProxyCommissionListPayDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * @author 代理后台，代理中心使用
 * @description 佣金发放-
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = " 佣金发放", description = "佣金发放")
public class DxProxyIssueCommissionReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 支付密码
     */
    @ApiModelProperty("代理支付密码")
    private String proxyPayPassword;

    /**
     * 当前发放得代理id
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private Long proxyId;

    /**
     * 发放集合
     */
    @ApiModelProperty("发放集合")
    private   List<ProxyCommissionListPayDTO> proxyCommissionListPayDTOS;




}