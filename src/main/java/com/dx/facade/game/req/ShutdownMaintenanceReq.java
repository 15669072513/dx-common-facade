package com.dx.facade.game.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author admin
 */
@Data
public class ShutdownMaintenanceReq extends PageRequest {

    @ApiModelProperty("创建人")
    @TableField("created_by")
    private String createdBy;

    @ApiModelProperty("修改人")
    @TableField("updated_by")
    private String updatedBy;
}
