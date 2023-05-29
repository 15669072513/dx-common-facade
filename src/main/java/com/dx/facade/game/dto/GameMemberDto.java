package com.dx.facade.game.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 场馆账号表
 * </p>
 *
 * @author dereck
 * @since 2022-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwGameMemberPO对象", description = "场馆账号表")
public class GameMemberDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("统一会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberId;

    private String loginName;

    private String loginId;

    private String nickName;

    private String password;

    private String sign;

    @ApiModelProperty("包网商户id")
    private Long merchantId;

    @ApiModelProperty("商户号")
    private String agentCode;

    @ApiModelProperty("创建时间")
    private LocalDateTime createDt;

    @ApiModelProperty("修改时间")
    private LocalDateTime modifyDt;

    @ApiModelProperty("游戏code zr by")
    private String gameCode;

    @ApiModelProperty("场馆code cq9")
    private String venueCode;


}
