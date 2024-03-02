package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopProxyInfoRespDTO {

    @ApiModelProperty("顶级代理信息")
    private ProxyInfoRespDTO proxyInfoRespDTO;

    @ApiModelProperty("该顶级代理下辖用户id")
    private List<Long> userIds;

}
