package com.dx.facade.texas.dto;

import com.dx.facade.texas.resp.DxTableInfoListResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author dereck
 * @since 2022-10-13
 */
@Data
public class DxTableLimitDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Long> tableIds;
}
