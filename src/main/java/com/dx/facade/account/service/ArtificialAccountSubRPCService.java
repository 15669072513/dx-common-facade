package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.req.ArtificialAccountSubRecordPageParmDTO;
import com.dx.facade.account.req.CreateArtificialAccountSubParmDTO;
import com.dx.facade.account.resp.AdjustAmountTotalRespDTO;
import com.dx.facade.account.resp.ArtificialAccountSubRespDTO;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.net.InetAddress;

/**
 * 人工[减]额记录表(会员/代理) RPC接口
 *
 * @author grayson
 * @version 1.0.0
 * @date 2022/8/19
 */
public interface ArtificialAccountSubRPCService {

	/**
	 * 会员人工减额
	 * @param dto
	 * @return
	 * @throws BizException
	 */
	@ApiModelProperty("会员人工减额")
	CommonResp<Long> createArtificialPatchAccountSub(CreateArtificialAccountSubParmDTO dto) throws BizException;

	/**
	 *  会员人工减额查询记录
	 * @param pageReq
	 * @return
	 * @throws BizException
	 */
	@ApiModelProperty("  会员人工减额查询记录-分页")
	CommonResp<PageResp<ArtificialAccountSubRespDTO, ?>> queryAccountSubPage(PageReq<ArtificialAccountSubRecordPageParmDTO> pageReq) throws BizException;

	@ApiModelProperty("会员人工加额记录总计")
	CommonResp<AdjustAmountTotalRespDTO> selectArtificialAccountSubTotal(ArtificialAccountSubRecordPageParmDTO param) throws BizException;

	CommonResp<ArtificialAccountSubRespDTO> getLastSuccessBackWithdrawInfo(Long userId, Integer userType);
}
