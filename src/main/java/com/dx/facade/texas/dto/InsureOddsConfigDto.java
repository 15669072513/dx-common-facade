package com.dx.facade.texas.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel("保险赔率配置信息实体")
@Data
public class InsureOddsConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;
  @ApiModelProperty("id主键")
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  private Long id;
  @ApiModelProperty("游戏类型 2001-德州 2002-短牌")
  private Integer gameType;
  @ApiModelProperty("赔率类型 1-2人allin赔率 2-3人allin赔率 3-4人allin赔率 4-5人allin赔率 5-6人allin赔率 6-7人allin赔率 7-8人allin赔率 8-9人allin赔率")
  private Integer oddsType;
  @ApiModelProperty("outs")
  private Integer outs;
  @ApiModelProperty("赔率")
  private BigDecimal odds;
  @ApiModelProperty("创建时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private LocalDateTime createAt;
  @ApiModelProperty("修改时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private LocalDateTime updateAt;
  @ApiModelProperty("创建者")
  private String createBy;
  @ApiModelProperty("修改者")
  private String updateBy;
}
