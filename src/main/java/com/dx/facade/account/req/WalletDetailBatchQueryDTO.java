package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.List;

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
public class WalletDetailBatchQueryDTO implements Serializable {

    private List<WalletDetailBatchQueryItemDTO> param;

    public boolean isParamValid(){
        if (CollectionUtils.isEmpty(param)) {
            return false;
        }

        for (WalletDetailBatchQueryItemDTO itemDTO : param) {
            if (!itemDTO.isParamValid()) {
                return false;
            }
        }
        return true;
    }
}
