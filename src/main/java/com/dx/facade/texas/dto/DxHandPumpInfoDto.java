package com.dx.facade.texas.dto;

import com.dx.facade.texas.resp.DxHandInfoListResp;
import lombok.Data;

import java.util.List;

@Data
public class DxHandPumpInfoDto {
    private static final long serialVersionUID = 1L;
    List<DxHandInfoListResp> handInfoListRespList;
}
