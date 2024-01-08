package com.dx.facade.account.resp;

import com.dx.facade.account.req.WalletDetailBatchQueryItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

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
public class WalletDetailBatchQueryRespDTO implements Serializable {

    private List<WalletDetailBatchQueryItemDTO> param;

}
