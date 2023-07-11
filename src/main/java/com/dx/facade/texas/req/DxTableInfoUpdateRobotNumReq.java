package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;


/**
 * <p>
 *
 * </p>
 *
 * @author dereck
 * @since 2022-10-13
 */
@Data
public class DxTableInfoUpdateRobotNumReq implements BaseParmDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("机器人数量")
    private Integer robotNum;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(robotNum, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("robotNum"));
    }
}
