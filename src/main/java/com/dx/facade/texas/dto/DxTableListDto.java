package com.dx.facade.texas.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.texas.resp.DxTableInfoListResp;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class DxTableListDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<DxTableInfoListResp> tableInfoListRespList;
}
