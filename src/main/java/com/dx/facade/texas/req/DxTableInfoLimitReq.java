package com.dx.facade.texas.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class DxTableInfoLimitReq extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("关联俱乐部id")
    private Long clubId;

    @ApiModelProperty("限制条数")
    private Integer limit;

}
