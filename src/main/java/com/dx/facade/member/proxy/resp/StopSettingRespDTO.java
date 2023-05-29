package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 总代开盘最新信息 返回参数
 *
 * @author Yinter
 * @version 1.0.0
 * @date 2022/6/25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StopSettingRespDTO {
    /**
     * 盘口状态 0-停盘 1-开盘
     */
    private Integer handicapStatus;
    /**
     * 生效时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime handicapLastOpenTime;
}