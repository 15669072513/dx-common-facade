package com.dx.facade.windcontrol.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WindControlRecordSave {
    @ApiModelProperty(value = "商户id")
    private  Long merchantId;

    @ApiModelProperty(value = "编辑信息")
    private  String objectInfo;

    @ApiModelProperty(value = "操作人")
    private  String applyName;

    @ApiModelProperty(value = "风控备注")
    private  String windReason;

    @ApiModelProperty(value = "变更前风控层级id")
    private Long beforeWindControlLevelId;

    @ApiModelProperty(value = "变更前风控层级name")
    private String beforeWindControlName;

    @ApiModelProperty(value = "变更后风控层级id")
    private Long afterWindControlLevelId;

    @ApiModelProperty(value = "变更后风控层级name")
    private String afterWindControlName;

    @ApiModelProperty(value = "风控类型")
    private Integer windControlType;
}
