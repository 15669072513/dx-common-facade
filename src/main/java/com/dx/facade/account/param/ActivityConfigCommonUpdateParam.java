package com.dx.facade.account.param;

import com.dx.facade.account.resp.HandicapOdds;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author agan
 */
@Data
public class ActivityConfigCommonUpdateParam {

    @ApiModelProperty(value = "主键id")
    @NotNull(message = "主键id不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "无效赔率 [{\"handicap\":\"欧洲盘\",\"minOdds\":1.01},{\"handicap\":\"香港盘\",\"minOdds\":0.01}]")
    private List<HandicapOdds> handicapOdds;

    @ApiModelProperty(value = "最近操作人", hidden = true)
    private String operator;

}
