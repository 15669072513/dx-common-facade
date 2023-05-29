package com.dx.facade.message.req;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DeleteMessageAnnouncementReq {


    /**
     * 主键id
     */
    @NotNull
    private Long id;


}
