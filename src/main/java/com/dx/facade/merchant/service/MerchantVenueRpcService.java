package com.dx.facade.merchant.service;

import com.dx.entity.CommonResp;
import com.dx.facade.common.ListResp;
import com.dx.facade.merchant.resp.MerchantNameByVenueCodeRespDTO;
import com.dx.facade.merchant.resp.MerchantVenueInfoResp;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 @title 相关相关接口
 @desc 根据场馆获取配置商户,根据商户获取配置场馆,获取所有
 @path
 @author kygo
 @version 1.0.0
 @since
 */
public interface MerchantVenueRpcService {

    /**
     * 根据场馆编码获取 场馆下的商户信息
     *
     * @param venueCode 场馆编码
     * @return 商户信息
     */
    public ListResp<MerchantNameByVenueCodeRespDTO, Integer> getMerchantSumInfoByVenueCode(String venueCode);

    /**
     * 根据场馆code,获取所有开通了这个场馆的所有商户信息
     */
    CommonResp<List<MerchantVenueInfoResp>> getVenueInfo(String venueCode);

    /**
     * 根据商户id获取,配置的场馆信息
     */
    CommonResp<List<MerchantVenueInfoResp>> getVenueInfo(Long merchantId);

    /**
     * 根据商户id和场馆code获取
     * */
    CommonResp<MerchantVenueInfoResp> getVenueInfo(Long merchantId, String venueCode);

    /**
     * 查询所有
     * */
    CommonResp<List<MerchantVenueInfoResp>> getAllVenueInfo();
	
	/**
	 * 根据code 更新场馆名称
	 *
	 * @param venueCode 场馆code
	 * @param newVenueName 场馆名称
	 */
	@ApiModelProperty(value = "根据code更新场馆名称")
    void changeVenueNameByVenueCode(String venueCode,String newVenueName);
}
