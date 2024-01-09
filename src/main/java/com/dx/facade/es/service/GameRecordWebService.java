package com.dx.facade.es.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.req.GameRecordProxyWebParam;
import com.dx.facade.es.resp.GameRecordProxyWebRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * 为web提供ES相关查询
 *
 * @author fitz
 */
public interface GameRecordWebService {
	
	
	/**
	 * 代理web 获取下级会员游戏记录
	 *
	 * @param param 下级会员游戏记录 入参
	 * @return 返回下级会员游戏记录
	 * @throws BizException 业务异常
	 */
	@ApiModelProperty("代理web 获取下级会员游戏记录")
	CommonResp<PageResp<GameRecordProxyWebRespDTO, Void>> gameRecordListProxyWeb(GameRecordProxyWebParam param) throws BizException;

}
