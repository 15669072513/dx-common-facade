package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.*;

import java.util.List;


public interface GameMemberRPCService {


    CommonResp<GameMemberDto> add(GameMemberDto gameMemberDto);

    /**
     * 根据memberId 和 场馆code 查询会员信息 如果不存在 返回 null
     * @param merchantId 包网商户Id
     * @param venueCode 场馆code cp9
     * @param memberId c端会员id
     * @return
     */
    CommonResp<GameMemberDto> getGameMemberByMemberId(Long merchantId, String venueCode, Long memberId, String agentCode);

    /**
     * 根据memberId 和 场馆code 查询会员信息 如果不存在 返回 null
     * @param agentCode 场馆方商户code
     * @param venueCode 场馆code cp9
     * @param playerName 场馆方会员用户名
     * @return
     */
    CommonResp<GameMemberDto> getGameMemberByPlayerName(String agentCode, String venueCode, String playerName);


    /**
     * 获取商户指定memberId 所有游戏会员 如果不存在 返回 空List
     * @param merchantId 包网商户Id
     * @param memberId c端会员id
     * @return
     */
    CommonResp<List<GameMemberDto>> getGameMembers(Long merchantId, Long memberId);




}
