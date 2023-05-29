package com.dx.facade.auth.domain;

import lombok.Data;

import java.util.List;

@Data
public class OperationLogRespDTO {

    private String userName;

    private String nickName;

    private String roleName;

    private String ip;

    private String operationType;

    private String operation;

    private String remark;

    private String opTime;

    private Long bizId;

    /**
     * 节点id（比如当前用户以及当前用户的子孙用户id）
     */
    private List<Long> nodeId;
}
