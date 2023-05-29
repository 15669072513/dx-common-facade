package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MemberLabelDeleteRpcReqDTO;
import com.dx.facade.member.param.MemberLabelInsertOrUpdateRpcReqDTO;
import com.dx.facade.member.param.MemberLabelPageRpcReqDto;
import com.dx.facade.member.resp.MemberLabelEsLabelRespDTO;
import com.dx.facade.member.resp.MemberLabelRpcPageRespDTO;

import io.swagger.annotations.ApiModelProperty;


/**
 * 会员标签相关接口
 *
 * @author fitz
 * @date 2021/6/2
 */
public interface UserLabelRpcService {
	/**
	 * 通过标签ID 查询标签名称
	 *
	 * @param id 标签id
	 * @return 标签名称
	 * @throws Exception 异常
	 */
	@ApiModelProperty(value="通过标签ID 查询标签名称")
    String getMemberLabelName(Long id) throws BizException;

	/**
	 * 会员标签-新增(编辑)
	 * @param param
	 * @return
	 * @throws BizException
	 */
	@ApiModelProperty(value="会员标签-新增(编辑)")
	CommonResp addOrEditMemberLabel(MemberLabelInsertOrUpdateRpcReqDTO param) throws BizException;

	@ApiModelProperty(value="会员标签-删除")
	CommonResp deleteLabel(MemberLabelDeleteRpcReqDTO param) throws BizException;

	@ApiModelProperty(value="会员标签-分页查询")
	CommonResp<PageResp<MemberLabelRpcPageRespDTO, ?>> selectMemberLabelRpcPage(PageReq<MemberLabelPageRpcReqDto> pageReq) throws BizException;

	@ApiModelProperty(value="会员标签-标签人数-会员信息")
	CommonResp<PageResp<MemberLabelEsLabelRespDTO, Long>> getMemberInfoByLabelId(PageReq<Long> pageReq) throws BizException;


}
