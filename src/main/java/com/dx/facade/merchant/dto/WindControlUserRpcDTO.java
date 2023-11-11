package com.dx.facade.merchant.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 风控层级参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "com-bw-merchant-dto-WindControlDTO", description = "风控层级参数封装")
public class WindControlUserRpcDTO {


    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 风控对象名称
     */
    private String userName;

    /**
     * 风控层级名称
     */
    private String windControlLevelValue;
    /**
     * 风控层级ID
     */
    private Long windControlLevel;
    /**
     * 风控类型枚举
     */
    private Integer windControlType;
    /**
     * 风控类型枚举值
     */
    private String windControlTypeValue;
    /**
     * 删除标志
     */
    private Integer delFlag;

    /**
     * 所属商户
     */
    private Long merchantId;
    /**
     *  所属商户名称
     */
    private String merchantName;

    /**
     * 风控原因
     */
    private String windControlDescription;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;

    /**
     * 修改人
     */
    private String updatedBy;
}
