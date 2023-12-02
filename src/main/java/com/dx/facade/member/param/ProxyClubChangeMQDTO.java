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

    @ApiModelProperty("俱乐部ID")
    private Long clubId;

    @ApiModelProperty("用户ID")
    private Long userId;

}
