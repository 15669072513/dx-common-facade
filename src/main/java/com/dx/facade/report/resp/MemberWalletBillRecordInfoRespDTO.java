package com.dx.facade.report.resp;

import com.dx.facade.report.resp.member.MembershipBillingDetailsDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author rebuy
 * @datetime 2023-08-01 12:06
 * @desc 会员账单记录
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberWalletBillRecordInfoRespDTO implements Serializable {
    @ApiModelProperty("当前账单期")
    private MembershipBillingDetailsDTO currentBill;
    @ApiModelProperty("上一期账单")
    private MembershipBillingDetailsDTO lastBill;
}
