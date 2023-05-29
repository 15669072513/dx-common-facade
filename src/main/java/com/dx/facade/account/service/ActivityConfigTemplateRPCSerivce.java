package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityConfigParam;
import com.dx.facade.account.param.ActivityTemplateEasyExcel;
import com.dx.facade.account.param.CheckSubmitActivityTemplateDTO;

import java.util.List;

/**
 * 活动模板RPC
 * @author agan
 */
public interface ActivityConfigTemplateRPCSerivce {

    /**
     * 检查活动模板excel
     * @param easyExcelList
     * @param merchantId
     * @return
     * @throws BizException
     */
    CommonResp<CheckSubmitActivityTemplateDTO> checkActivityTemplateExcel(List<ActivityTemplateEasyExcel> easyExcelList, Long merchantId) throws BizException;

    /**
     * 保存活动配置
     * @param param
     * @return
     * @throws BizException
     */
    CommonResp<String> saveActivityConfig(ActivityConfigParam param) throws BizException;

}
