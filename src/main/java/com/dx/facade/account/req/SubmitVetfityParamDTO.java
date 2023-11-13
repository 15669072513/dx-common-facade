package com.dx.facade.account.req;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.ProxyInfoRespDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitVetfityParamDTO {

    @ApiModelProperty("订单编号")
    private String eventId;
    @ApiModelProperty("支付通道id")
    private Long paymentChannelId;
    @ApiModelProperty("凭证列表")
    private List<MultipartFile> files;

}
