package com.dx.facade.account.req;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Dealer
 * @description:
 * @date 2024/01/04
 * @copyright
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WalletDetailBatchQueryItemDTO implements Serializable {

    private Integer walletType;

    private Integer changeType;

    private String eventId;

    public boolean isParamValid(){
        return Objects.nonNull(walletType) && Objects.nonNull(changeType) && StringUtils.isNotEmpty(eventId);
    }
}
