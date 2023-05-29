package com.dx.facade.account.service;

import java.util.List;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.ActivityConfigByTabParam;
import com.dx.facade.account.param.ActivityConfigSortParamDTO;
import com.dx.facade.account.param.ActivityConfigTagParam;
import com.dx.facade.account.param.ActivityConfigUpdateParam;
import com.dx.facade.account.param.ActivityConfigUpdateStatusParam;
import com.dx.facade.account.param.GetScActivityBonusDTO;
import com.dx.facade.account.req.QueryActivityConfigReq;
import com.dx.facade.account.resp.ActivityConfigRespDTO;
import com.dx.facade.account.resp.ActivityConfigScRuleDTO;
import com.dx.facade.account.resp.ActivityConfigTagGroupDTO;
import com.dx.facade.account.resp.CountDto;
import com.dx.facade.account.resp.GetScActivityBonusRespDTO;
import com.dx.facade.account.resp.MemberActivityConfigRespDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * 活动列表
 */
public interface ActivityConfigService {

    /**
     * 查询明细
     * @param id
     * @return
     */
    ActivityConfigRespDTO getById(Long id) throws BizException;

    /**
     * 全量查询活动配置
     * @return
     * @throws BizException
     */
    CommonResp<List<ActivityConfigRespDTO>> selectAll(Long merchantId) throws BizException;

    /**
     * 管理后台活动列表查询
     * @param param
     * @return
     */
    @ApiModelProperty(value = "管理后台活动列表查询")
    CommonResp<PageResp<ActivityConfigRespDTO, CountDto>> selectPage(PageReq<QueryActivityConfigReq> param) throws BizException;

    /**
     * 管理后台-活动列表-前端排序
     * @param merchantId
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "管理后台-活动列表-前端排序")
    CommonResp<List<ActivityConfigTagGroupDTO>> selectGroupByTag(Long merchantId) throws BizException;

    /**
     * 管理后台-活动列表-修改排序顺序
     * @param activityConfigSortParamDTOList
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "管理后台-活动列表-修改排序顺序")
    CommonResp<Boolean> updateActivitySort(List<ActivityConfigSortParamDTO> activityConfigSortParamDTOList) throws BizException;

    /**
     * 活动列表-app 端查询 单一 活动
     * @param id
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "活动列表-app 端查询 单一 活动")
    ActivityConfigRespDTO queryById(Long id) throws BizException;

    /**
     *列表查询：启用, 停用功能
     * @param activityConfigUpdateStatusParam
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "后台列表查询：启用, 停用功能")
    boolean updateStatus(ActivityConfigUpdateStatusParam activityConfigUpdateStatusParam) throws BizException;

    /**
     * 后台列表的修改功能
     * @param activityConfigUpdateParam
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "后台列表的修改")
    boolean update(ActivityConfigUpdateParam activityConfigUpdateParam) throws BizException;

    @ApiModelProperty(value = "后台列表-删除功能")
    CommonResp<Boolean> delete(Long id) throws BizException;

    /**
     * app 优惠类型页签-查询
     * @param param
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "app 优惠类型页签-查询")
    CommonResp<List<ActivityConfigRespDTO>> selectByTab(ActivityConfigByTabParam param) throws BizException;

    /**
     * 查询校验首存记录的参数
     * @param getScActivityBonusDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "查询校验首存记录的参数")
    CommonResp<GetScActivityBonusRespDTO> getScActivityBonusAmount(GetScActivityBonusDTO getScActivityBonusDTO) throws BizException;

    /**
     * 根据id 查询纯展示页活动配置，活动详情  提供给app端
     * @param id
     * @param userId
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "根据id 查询纯展示页活动配置，活动详情  提供给app端")
    CommonResp<MemberActivityConfigRespDTO> getActivityConfigById(Long id, Long userId) throws BizException;

    /**
     * 定时任务更新活动的状态
     * @param dtoList
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value = "定时任务更新活动的状态")
    CommonResp<Boolean> updateBatchById(List<ActivityConfigRespDTO> dtoList) throws BizException;

    /**
     *
     * @param activityId
     * @return
     * @throws BizException
     */
    CommonResp<List<ActivityConfigScRuleDTO>> getScRuleByActivityId(Long activityId) throws BizException;

    /**
     * 活动页签需要查询是否关闭的活动列表
     * @param param
     * @return
     */
    List<ActivityConfigRespDTO> selectTagId(ActivityConfigTagParam param);
}
