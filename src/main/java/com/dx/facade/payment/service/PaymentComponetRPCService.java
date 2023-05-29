package com.dx.facade.payment.service;

import com.dx.exception.BizException;
import com.dx.facade.auth.enums.ConfigKeyEnum;
import com.dx.facade.payment.req.PaymentComponetDTO;

import java.math.BigDecimal;

/**
 * @author agan
 */
public interface PaymentComponetRPCService {
	
	
	/**
	 * 额度转账，额度代存，佣金代存，佣金转帐，佣金转中心钱包字典配置校验
	 * @param configKeyEnum  字典类型
	 * @param proxyId 代理Id
	 * @param amount 本次金额
	 * @return  当日剩余额度
	 * @throws BizException
	 */
	BigDecimal remainder(ConfigKeyEnum configKeyEnum, Long proxyId, BigDecimal amount) throws BizException;


	/**
     * 代理取款配置校验
     * @param merchantId 商户id
     * @param proxyId 代理id
     * @param amount 本次取款金额
     * @param withdrawType  1:银行卡   2:虚拟币
     * @return
     * @throws BizException
     */
	PaymentComponetDTO remainder(Long merchantId, Long proxyId, BigDecimal amount, Integer withdrawType) throws BizException;


	/**
	 * 会员取款配置校验
	 * @param merchantId
	 * @param memberId
	 * @param vipNum
	 * @param amount
	 * @param withdrawType
	 * @return
	 * @throws BizException
	 */
	PaymentComponetDTO remainder(Long merchantId, Long memberId, Integer vipNum, BigDecimal amount, Integer withdrawType) throws BizException;
	/**
	 * 查询会员或者代理存款待处理剩余笔数
	 * @param userId
	 * @param userType
	 * @return
	 * @throws BizException
	 */
	 //public  Integer remainder(Long userId, Integer userType) throws BizException;
}
