package com.dx.facade.auth.domain;

import lombok.Data;

import java.util.List;

@Data
public class QueryOperationLogReqDTO {
    private String endDate;

    private String startDate;

    private Long agentId;

    private String operationType;

    private String userName;

    private String ip;

    private Integer type;

    private Long bizId;


    /**
     * 节点id（比如当前用户以及当前用户的子孙用户id）
     */
    private List<Long> nodeId;
}
