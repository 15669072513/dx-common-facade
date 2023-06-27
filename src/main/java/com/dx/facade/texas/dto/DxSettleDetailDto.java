package com.dx.facade.texas.dto;

import com.dx.facade.texas.resp.DxSettleDetailResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxSettleDetailDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<DxSettleDetailResp> settleDetailList;
}
