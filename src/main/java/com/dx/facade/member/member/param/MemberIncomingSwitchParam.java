package com.dx.facade.member.member.param;

import com.baomidou.mybatisplus.annotation.TableField;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author seven
 * @date 2023年06月28日 17:37
 * @description： 游戏入局开关
 */
@Setter
@Getter
public class MemberIncomingSwitchParam {
    @ApiModelProperty("会员id")
    private Long id;
    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;
    
    @ApiModelProperty("入局锁定状态 0-未锁定 1-入局锁定")
    @TableField("join_game_lock_status")
    private Integer joinGameLockStatus;
}
