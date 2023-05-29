package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.FeedBackListRpcReq;
import com.dx.facade.member.resp.AddFeedBackDTO;
import com.dx.facade.member.resp.FeedBackListDTO;
import com.dx.facade.member.resp.FeedBackListPageDTO;
import com.dx.facade.member.resp.FeedBackListRpcPageDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: timas
 * @Description: TODO
 * @Date: 2022/09/27 11:37
 */
public interface FeedBackService {

    /**
     * 新增意见反馈
     *
     * @param req 请求实体
     * @return CommonResp<Integer>
     */
    @ApiModelProperty(value="新增意见反馈")
    CommonResp<Integer> addFeedBack(AddFeedBackDTO req)throws BizException;

//    /**
//     * 查询意见反馈Rpc接口
//     *
//     * @param req 请求石头
//     * @return CommonResp<PageResp < FeedBackListPageParam, ?>>
//     */
//    @ApiModelProperty(value="查询意见反馈列表")
//    CommonResp<PageResp<FeedBackListPageDTO, ?>> feedBackList(FeedBackListDTO req)throws BizException;

    /**
     * 查询意见反馈
     *
     * @param req 请求石头
     * @return CommonResp<PageResp < FeedBackListPageParam, ?>>
     */
    @ApiModelProperty(value="分页查询意见反馈列表")
    CommonResp<PageResp<FeedBackListRpcPageDTO, ?>> feedBackListPage(FeedBackListRpcReq req)throws BizException;
}
