package com.dx.facade.venue.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.venue.resp.DxSettleDetailResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
