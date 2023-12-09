package com.dx.facade.game.dto;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DxWalletDetailBringOutDto {
  private Long userId;
  private BigDecimal bringOutAmount;
  private Integer bringOutCount;
}
