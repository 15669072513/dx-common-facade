package com.dx.facade.game.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author admin
 */
@Data
public class DeleteRecommendGameReq{

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
}
