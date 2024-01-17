package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@ApiModel("操作日志记录列表")
@Data
public class DxSysOperateLogResp {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "主键")
  private Long id;

  @ApiModelProperty(value = "模块编码")
  private Integer moduleCode;

  @ApiModelProperty(value = "模块名称")
  private String moduleName;

  @ApiModelProperty(value = "操作页面编码")
  private Integer operatePageCode;

  @ApiModelProperty(value = "操作页面名称")
  private String operatePage;

  @ApiModelProperty(value = "操作功能")
  private String operateFunction;

  @ApiModelProperty(value = "操作类型枚举SysOperateTypeEnum（1其它 2新增 3编辑 4删除）")
  private Integer operateType;

  @ApiModelProperty(value = "请求url")
  private String requestUrl;

  @ApiModelProperty(value = "请求方法")
  private String method;

  @ApiModelProperty(value = "请求ip")
  private String requestIp;

  @ApiModelProperty(value = "请求参数")
  private String requestParams;

  @ApiModelProperty(value = "操作前参数")
  private String operateBeforeParam;

  @ApiModelProperty(value = "操作后参数")
  private String operateAfterParam;

  @ApiModelProperty(value = "操作状态（0正常 1异常)")
  private Integer status;

  @ApiModelProperty(value = "异常信息")
  private String exceptionMsg;

  @ApiModelProperty(value = "操作时间")
  private LocalDateTime operateTime;

  @ApiModelProperty(value = "耗时时间")
  private Long costTime;

  @ApiModelProperty(value = "操作用户ID")
  private Long operateUserId;

  @ApiModelProperty(value = "操作用户账号")
  private String operateUserName;

  @ApiModelProperty(value = "操作用户类型（1总控超管 2总控管理员 3总控职员 4商户超管 5商户管理员 6商户职员）")
  private Integer accountType;

  @ApiModelProperty(value = "备注")
  private String remark;

  @ApiModelProperty(value = "所属商户Id")
  private Long merchantId;

  @ApiModelProperty(value = "所属商户名称")
  private String merchantName;

  @ApiModelProperty(value = "操作对象(商户名称)")
  private String operateObject;

  @ApiModelProperty(value = "创建时间")
  private LocalDateTime createdAt;

  @ApiModelProperty(value = "修改时间")
  private LocalDateTime updatedAt;
}
