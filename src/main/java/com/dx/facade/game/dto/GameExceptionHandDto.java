package com.dx.facade.game.dto;

import com.dx.facade.enums.BwCurrencyEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 异常手牌信息
 * </p>
 *
 * @author dereck
 * @since 2023-09-08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "GameExceptionHandDto对象", description = "异常手牌信息")
public class GameExceptionHandDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long tableId;

    private String tableCode;

    private Long handId;

    private String handCode;


}
