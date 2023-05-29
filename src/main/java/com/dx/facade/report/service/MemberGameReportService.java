package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.membergamereport.GameMemberTopReqDTO;
import com.dx.facade.report.resp.membergamereport.GameMemberTopRespDTO;

import java.util.List;

/**
 * 会员游戏日报表操作
 *
 * @author focus
 * @version 1.0.0
 * @date 2022/02/08 19:47
 */
public interface MemberGameReportService {


    /**
     * 会员详情-获取场馆会员TOP3
     *
     * @param param 场馆会员参数
     * @return 场馆会员top3返回对象
     * @throws BizException 业务异常
     */
    CommonResp<List<GameMemberTopRespDTO>> getGameMemberTop3(GameMemberTopReqDTO param);


    /**
     * 会员详情-获取场馆会员TOP3
     *
     * @param param 场馆会员参数
     * @return 场馆会员top3返回对象
     * @throws BizException 业务异常
     */
    CommonResp<List<GameMemberTopRespDTO>> getSubGameMemberTop3(GameMemberTopReqDTO param);



}
