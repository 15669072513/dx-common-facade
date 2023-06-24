package com.dx.facade.venue.dto;

import com.dx.facade.venue.req.DxHandInfoListReq;
import com.dx.facade.venue.resp.DxHandInfoListResp;
import lombok.Data;

import java.util.List;

@Data
public class DxHandPumpInfoDto {
    private static final long serialVersionUID = 1L;
    List<DxHandInfoListResp> handInfoListRespList;
}
