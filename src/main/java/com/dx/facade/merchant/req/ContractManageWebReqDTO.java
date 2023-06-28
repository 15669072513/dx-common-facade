package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

import com.dx.facade.common.PageRequest;

@Data
@ApiModel(value = "ContractManageReqDTO", description = "契约管理传参对象")
public class ContractManageWebReqDTO extends PageRequest implements Serializable {


    @ApiModelProperty(value = "商户id")
    public Long merchantId;

    @ApiModelProperty(value = "代理id",hidden = true)
    private Long userId;

    @ApiModelProperty(value="代理账号")
    private String proxyName;

    @ApiModelProperty(value = "契约id")
    private Long contractId ;

    @ApiModelProperty(value="下级代理账号")
    private String signProxyName;

    @ApiModelProperty(value = "代理类型 1:直属代理 2非直属代理")
    private Integer type ;

    @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约")
    private Integer contractType ;

    @ApiModelProperty(value = "契约状态：0-待签约 1-已签约")
    private Integer contractStatus;

    @ApiModelProperty(value = "契约生效状态:0-未生效 1-已生效 2-已失效")
    private Integer effectStatus;

    @ApiModelProperty(value = "调用来源:1-契约查询 2-复用查询")
    private Integer callSource;

    @ApiModelProperty(value = "业务来源:1-web端 2-其他")
    private Integer businessSource;


    @ApiModelProperty(value = "是否查询下级:1-ture 不查询 2-false 查询")
    private Boolean isSearch;
    /*
    create_dt, 最小比例：begin_rate,最大比例：end_rate
     */
    @ApiModelProperty(value="排序字段[1:制定时间,2:最小比例,3:最大比例]")
    private Integer orderProperty;

    @ApiModelProperty(value="web排序字段[1:发送时间,2:签约时间]")
    private Integer orderKey;

    @ApiModelProperty(value="排序(4)[升序：asc ,降序: desc]")
    private String orderType;
    
    /** 发送开始时间 */
    @ApiModelProperty("发送开始时间")
    private String createDtStart;
    
    /** 最近登录结束时间 */
    @ApiModelProperty("最近登录结束时间")
    private String createDtEnd;

    /** 签约开始时间 */
    @ApiModelProperty("签约开始时间")
    private String signDtStart;
    
    /** 签约结束时间 */
    @ApiModelProperty("签约结束时间")
    private String signDtEnd;
    
    /** 失效开始时间 */
    @ApiModelProperty("失效开始时间")
    private String lostEffectDtStart;
    
    /** 失效结束时间 */
    @ApiModelProperty("失效结束时间")
    private String lostEffectDtEnd;
    
    /** 最近修改开始时间 */
    @ApiModelProperty("最近修改开始时间")
    private String lastModDtStart;
}
