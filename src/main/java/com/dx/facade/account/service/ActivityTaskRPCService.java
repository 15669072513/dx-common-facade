package com.dx.facade.account.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.account.param.*;
import com.dx.facade.account.resp.ActivityTaskDTO;

import java.util.List;

/**
 * <p>
 * 优惠活动任务表 服务类
 * </p>
 *
 * @author quentin
 * @since 2021-07-27
 */
public interface ActivityTaskRPCService {

    /**
     * 查询（activity_task）任务进度表是否参与过某活动某场馆
     * @param reqDto
     * @return
     */
    CommonResp<ActivityTask> selectActivityTask(ActivityTaskReqDto reqDto) throws BizException;

    ActivityTaskDTO getUserCompleteBillAmount(ActivityTaskParamDTO paramDTO);

    List<ActivityTaskDTO> selectActivityTaskList(SelectActivityTaskReqDTO param);

    CommonResp<List<ActivityTask>> selectTodoActivityTask(ActivityTaskReqDto reqDto);

    Boolean finishActivityTask(UpdateActivityTaskParmDTO reqDto) throws BizException;

    boolean addActivityTask(ActivityTaskDTO activityTaskDTO);

    boolean delActivityTask(long id);

    ActivityTaskDTO getActivityTaskById(long id);

    /**
     * 根据businessId 查询 优惠活动任务表
     * @param businessId
     * @return
     */
    ActivityTaskDTO getActivityTaskByBusinessId(String businessId);
}
