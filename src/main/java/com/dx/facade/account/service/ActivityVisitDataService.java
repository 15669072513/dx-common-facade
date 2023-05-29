package com.dx.facade.account.service;

import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityVisitDataDTO;
import com.dx.facade.account.req.ActivityVisitDataCountReqDto;
import com.dx.facade.account.resp.ActivityVisitDataCountRespDto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author agan
 */
public interface ActivityVisitDataService {

    /**
     * 添加活动访问计录
     * @param activityVisitDataDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "添加活动访问计录")
    Boolean addActivityVisitData(ActivityVisitDataDTO activityVisitDataDTO) throws BizException;

    /**
     * 活动列表访问统计数据
     * @param reqDto
     * @return
     */
    ActivityVisitDataCountRespDto getActivityVisitDataCount(ActivityVisitDataCountReqDto reqDto);
}
