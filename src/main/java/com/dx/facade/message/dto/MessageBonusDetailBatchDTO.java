package com.dx.facade.message.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@ApiModel(value="批量红利消息")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageBonusDetailBatchDTO {

    @ApiModelProperty(value = "批量红利消息ID")
    private Long messageId;

    @ApiModelProperty(value = "红利消息列表")
    private List<MessageBonusDetailDTO> list;

}
