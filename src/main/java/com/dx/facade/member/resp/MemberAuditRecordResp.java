package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberAuditRecordResp {

    @ApiModelProperty(value="id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value="审核单号")
    private String eventId;

    @ApiModelProperty(value="申请人")
    private String applyName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="申请时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value="申请备注")
    private String applyRemark;

    @ApiModelProperty(value="审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("审核操作（0-结单查看 1-审核）")
    private Integer stepCode;

//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @ApiModelProperty(value="一审审批时间")
//    private LocalDateTime auditTime;

    @ApiModelProperty(value="商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value="会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value="会员账号")
    private String memberName;
    
    @ApiModelProperty(value="昵称")
    private String nickName;

    @ApiModelProperty(value="账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value="审核人")
    private String auditName;

    @ApiModelProperty(value="锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="锁单时间")
    private LocalDateTime lockDatetime;

    @ApiModelProperty(value ="锁单人id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long lockAccountId;

    @ApiModelProperty("锁单人")
    private String lockName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value="审核完成时间")
    private LocalDateTime auditDatetime;



//    @ApiModelProperty(value="审核环节（0-已结束 1-一审审核 2-二审审核）")
//    private Integer auditStep;

}
