package com.dx.facade.game.req;

import com.dx.facade.game.dto.RecommendGameDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author admin
 */
@Data
public class BwRecommendGameSortReq  {

    List<RecommendGameDTO> recommendGameDTOList;
}
