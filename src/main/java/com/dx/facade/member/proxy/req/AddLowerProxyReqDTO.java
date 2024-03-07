package com.dx.facade.member.proxy.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.member.param.BaseCommissionRateParamDTO;
import com.dx.facade.member.param.RebateRateDTO;
import com.dx.facade.merchant.req.RebateContractParam;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 代理 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/5/11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddLowerProxyReqDTO {

  @ApiModelProperty(value = "id")
  private Long id;

  @ApiModelProperty(value = "商户id")
  private Long merchantId;

  @ApiModelProperty(value = "商户code")
  private String merchantCode;

  @ApiModelProperty(value = "用户名")
  private String userName;

  @ApiModelProperty(value = "加盐")
  private String salt;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "真实姓名")
  private String realName;

  @ApiModelProperty(value = "手机号码")
  private String mobile;

  @ApiModelProperty(value = "注册手机号")
  private String registerPhone;

  @ApiModelProperty(value = "代理层级ID")
  private Long proxyLevelId;

  @ApiModelProperty(value = "父级代理层级ID")
  private Long parentProxyLevelId;

  @ApiModelProperty(value = "代理层级")
  private Integer proxyLevel;

  @ApiModelProperty(value = "代理层级名称")
  private String proxyLevelName;

  @ApiModelProperty(value = "父级代理层级名称")
  private String parentProxyLevelName;

  @ApiModelProperty(value = "代理线层级上限")
  private Integer maxLevels;

  @ApiModelProperty(value = "上级代理id")
  private Long parentProxyId;

  @ApiModelProperty(value = "上级代理账号")
  private String parentProxyName;

  @ApiModelProperty(value = "上级代理路劲")
  private String parentProxyPath;

  @ApiModelProperty(value = "代理层级路径")
  private String proxyPath;

  @ApiModelProperty(value = "代理层级路径（代理账号）")
  private String proxyPathUsername;

  @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
  private Integer accountType;

  @ApiModelProperty(value = "标签id")
  private Long labelId;

  @ApiModelProperty(value = "标签名称")
  private String labelName;

  @ApiModelProperty(value = "风控层级id")
  private Long windControlId;

  @ApiModelProperty(value = "风控层级名称")
  private String windControlName;

  @ApiModelProperty(value = "邮箱")
  private String email;

  @ApiModelProperty(value = "性别 0-女，1-男")
  private Integer gender;

  @ApiModelProperty(value = "出生日期")
  private String birth;

  @ApiModelProperty(value = "qq")
  private String qq;

  @ApiModelProperty(value = "flygram")
  private String flygram;

  @ApiModelProperty(value = "支付密码")
  private String payPassword;

  @ApiModelProperty(value = "有效状态（0-有效 1-无效）")
  private Integer status;

  @ApiModelProperty(value = "最后登录ip")
  private String lastLoginIp;

  @ApiModelProperty(value = "最后登陆时间")
  private LocalDateTime lastLoginTime;

  @ApiModelProperty(value = "注册ip")
  private String registerIp;

  @ApiModelProperty(value = "ip归属地")
  private String ipAttribution;

  @ApiModelProperty(value = "注册reference(网址)")
  private String registerReference;

  @ApiModelProperty(value = "注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
  private Integer deviceType;

  @ApiModelProperty(value = "终端设备号")
  private String deviceNo;

  @ApiModelProperty(value = "合营代码")
  private String invitationCode;

  @ApiModelProperty(value = "注册时间")
  private String createDt;

  @ApiModelProperty(value = "更新时间")
  private String updateDt;

  @ApiModelProperty(value = "开启免转模式 0-手动，1-免转")
  private Integer noTransfer;

  @ApiModelProperty(value = "入口权限（0-关闭 1-开启）")
  private Integer entryAuthority;

  @ApiModelProperty(value = "强制契约生效标志 0-未生效 1-生效")
  private Integer enforceContractStatus;

  @ApiModelProperty(value = "契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
  private Integer contractModel;

  @ApiModelProperty(value = "佣金模式 1：返点模式 2：返佣模式")
  private Integer commissionMode;
  
  @ApiModelProperty(value = "返点分配模式 1：自由模式 2：模板模式")
  private Integer rebateAllotMode;

  @ApiModelProperty("佣金结算周期 1：半月结 2：月结")
  private Integer commissionSettleCycle;

  @ApiModelProperty(value = "欠款标志 0-无欠款 1-有欠款")
  private Integer debtStatus;

  @ApiModelProperty(value = "返点契约ID")
  private Long rebateContractId;

  @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
  private Integer loginLockStatus;

  @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
  private Integer accountLockStatus;

  @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-充提锁定")
  private Integer gameLockStatus;

  @ApiModelProperty(value = "下级代理人数")
  private Integer underProxyNum;

  @ApiModelProperty(value = "直属下级代理人数")
  private Integer directlyUnderProxyNum;

  @ApiModelProperty(value = "下级会员人数")
  private Integer underMemberNum;

  @ApiModelProperty(value = "直属下级会员人数")
  private Integer directlyUnderMemberNum;

  @ApiModelProperty(value = "注册方式 0-手动 1-自动")
  private Integer registerType;

  @ApiModelProperty(value = "佣金契约ID")
  private Long commissionContractId;

  @ApiModelProperty(value = "转出会员人数")
  private Integer transferOutNum;

  @ApiModelProperty(value = "转入会员人数")
  private Integer transferInNum;

  @ApiModelProperty(value = "会员头像URL")
  private String topImagesUrl;

  @ApiModelProperty(value = "分表前缀")
  private Long suffix;

  @ApiModelProperty(value = "申请信息")
  private String applyInfo;

  @ApiModelProperty(value = "申请人（操作人）")
  private String applyName;

  @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约")
  public Integer contractType;

  @ApiModelProperty(value = "签约代理ID")
  private Long signProxyId;

  @ApiModelProperty(value = "签约代理账号")
  private String signProxyName;

  @ApiModelProperty(value = "签约代理层级ID")
  private Long signProxyLevelId;

  @ApiModelProperty(value = "签约代理层级")
  private Integer signProxyLevel;

  @ApiModelProperty(value = "开始比例")
  private BigDecimal beginRate;

  @ApiModelProperty(value = "终止比例")
  private BigDecimal endRate;

  @ApiModelProperty(value = "数据来源:1-新增 2-重订")
  private Integer dataSources;

  @ApiModelProperty(value = "契约状态:0-待签约 1-已签约")
  private Integer contractStatus;

  @ApiModelProperty(value = "契约生效状态:0-未生效 1-已生效 2-已失效")
  private Integer effectStatus;

  @ApiModelProperty(value = "签约类型: 0-签约确认  1-强制签约")
  private Integer sginType;

  @ApiModelProperty(value = "契约制定账号")
  private String createAccount;

  @ApiModelProperty(value = "反点比例集合")
  public List<RebateContractParam> rebateContractList;

  @ApiModelProperty(value = "佣金比例集合")
  public List<RebateContractParam> commissionContractList;

  @ApiModelProperty(value = "备注")
  private String backNote;

  @ApiModelProperty(value = "操作人")
  private String updatedBy;

  @ApiModelProperty(value = "返点政策类型ID")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private Long rebatePolicyTypeId;

  @ApiModelProperty(value = "佣金政策类型ID")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private Long commissionPolicyTypeId;

  @ApiModelProperty("商户名称")
  private String merchantName;

  @ApiModelProperty("商户层级路径")
  private String merchantPath;

  @ApiModelProperty("父级商户ID")
  private Long parentMerchantId;

  @ApiModelProperty("父级商户层级路径")
  private String parentMerchantPath;

  @ApiModelProperty("主商户ID")
  private Long topMerchantId;

  @ApiModelProperty("主商户名称")
  private String topMerchantName;

  @ApiModelProperty("币种")
  private String currency;

  @ApiModelProperty("总代id")
  private Long topProxyId;

  @ApiModelProperty("总代名称")
  private String topProxyName;

  @ApiModelProperty(value = "上级代理层级")
  private Integer parentProxyLevel;

  @ApiModelProperty("俱乐部id")
  private Long clubId;

  @ApiModelProperty("俱乐部名称")
  private String clubName;

  @ApiModelProperty("开局权限（0-关闭 1-开启）")
  @TableField("open_lock_status")
  private Integer openLockStatus;

  @ApiModelProperty("俱乐部管理权限（0-关闭 1-开启）")
  @TableField("manage_club_lock_status")
  private Integer manageClubLockStatus;

  @ApiModelProperty("德州返点比例")
  private BigDecimal texasRebate;

  @ApiModelProperty("德州保险返点比例")
  private BigDecimal texasInsuranceRebate;

  @ApiModelProperty("真人返点比例")
  private BigDecimal actualPersonRebate;

  @ApiModelProperty("体育返点比例")
  private BigDecimal sportsRebate;

  @ApiModelProperty("彩票返点比例")
  private BigDecimal lotteryTicketRebate;

  @ApiModelProperty("棋牌返点比例")
  private BigDecimal chessRebate;

  @ApiModelProperty("电竞返点比例")
  private BigDecimal esportsRebate;

  @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
  private Integer businessModel;

  @ApiModelProperty("返点比例列表")
  private List<RebateRateDTO> rebateRateList;
  
  @ApiModelProperty("返佣比例列表")
  private List<BaseCommissionRateParamDTO> commissionRateList;
    
  @ApiModelProperty(value = "返点比率模板等级")
  private Integer rebateRateLevel;
}