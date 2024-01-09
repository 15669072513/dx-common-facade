package com.dx.facade.account.req;

import com.dx.facade.common.PageRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2024-01-07 23:01
 * @desc TODO
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AccountOptLogListReqDTO extends PageRequest {
    private LocalDateTime createdAtStart;
    private LocalDateTime createdAtEnd;
    /**
     * 所属商户
     */
    private Long merchantId;
    /**
     * 所属栏目，参见SectionEnum
     */
    private Integer sectionCode;
    /**
     * 操作页面，参见PageEnum
     */
    private Integer pageCode;
    /**
     * 操作人
     */
    private String optUsername;
    /**
     * 操作IP
     */
    private String optIp;

}
