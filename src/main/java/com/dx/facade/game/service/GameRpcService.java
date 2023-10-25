package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.dto.*;
import com.dx.facade.game.dto.game.GameModifyPwdDto;
import com.dx.facade.game.resp.*;
import com.dx.facade.venue.resp.VeuneGameConfigListResp;

import java.util.List;

public interface GameRpcService {

    /**
     * 场馆登录游戏统一方法
     *
     * @return
     */
    public CommonResp<GameLoginResp> login(GameLoginDto loginDto);

    /**
     * 场馆登录游戏统一方法
     *
     * @return
     */
    public CommonResp<GameBaseResp> modifyPassword(GameModifyPwdDto modifyPwdDto);

    /**
     * 游戏试玩
     *
     * @param loginDto
     * @return
     */
    public CommonResp<GameLoginResp> tryPlay(GameLoginDto loginDto);

    /**
     * 创建游戏账号
     */
    public CommonResp<GameCreateResp> create(GameCreateDto createDto);


    /**
     * 场馆上分【不包含账变 不包含账变 不包含账变】
     */
    public CommonResp<GameDepositResp> deposit(GameDepositDto depositDto);

    /**
     * 提现、下分【包含账变 包含账变 包含账变】
     */
    public CommonResp<GameWithdrawResp> withdraw(GameWithdrawDto withdrawDto);

    /**
     * 一键下分
     */
    public CommonResp<GameWithdrawAllResp> withdrawAll(GameWithdrawAllDto withdrawAllDto);

    /**
     * 查询所有场馆或者单个场馆余额
     */
    public CommonResp<List<GameBalanceDto>> balances(GameQueryBalanceDto queryBalanceDto);


    public CommonResp<GameBalanceDto> balance(GameQueryBalanceDto queryBalanceDto);


    /**
     * 根据指定单号查询转账
     */
    public CommonResp<GameQueryTransferResp> queryTransfer(GameQueryTransferDto queryTransferDto);

    /**
     * 根据会员ID查询该会员在所有场馆中的账户余额（剔除德州-中心钱包）
     *
     * @param memberId
     * @param merchantId
     * @return
     */
    public CommonResp<List<VenueWalletDTO>> walletBalancesList(Long memberId, Long merchantId);

    public CommonResp<VeuneGameConfigListResp> getVenueGames();


    /**
     * 进入德州场馆下分动作+最近在玩
     * @param merchantId 商户id
     * @param memberId 用户id
     * @return
     */
    CommonResp dzLoginVenue(Long merchantId, Long memberId);



}
