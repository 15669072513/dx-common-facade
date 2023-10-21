package com.dx.facade.texas.req;

import com.dx.facade.texas.dto.InsureOddsConfigDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ApiModel("修改保险赔率请求实体")
@Data
public class UpdateInsureOddsListReq  implements Serializable {
  @ApiModelProperty("修改赔率数据集合")
  private List<InsureOddsConfigDto> updateList;
}
