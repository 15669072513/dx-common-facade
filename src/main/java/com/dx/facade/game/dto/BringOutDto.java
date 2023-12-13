package com.dx.facade.game.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BringOutDto {
  private BigDecimal bringOut;
  private Integer count;
}
