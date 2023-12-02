package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 俱乐部变更时发起mq  包括 审核成功、审核拒绝、修改
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyClubChangeMQDTO implements Serializable {
    /**
     *  修改俱乐部信息， 俱乐部新增会员时 有值
     */
    @ApiModelProperty("俱乐部ID")
    private Long clubId;

    /**
     *  俱乐部审核成功或拒绝时 有值
     */
    @ApiModelProperty("用户ID")
    private Long userId;

}
