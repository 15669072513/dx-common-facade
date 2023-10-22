package com.dx.facade.member.resp;

import com.dx.facade.account.resp.BankCardRespDTO;
import com.dx.facade.account.resp.VirtualAccountRespDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBankCardInfoResp {

    List<BankCardRespDTO> bankCardRespDTOS;

    List<VirtualAccountRespDTO> virtualAccountRespDTOS;

}
