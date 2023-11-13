package com.dx.facade.windcontrol.service;

import com.dx.entity.CommonResp;
import com.dx.facade.merchant.dto.ListWindControlLevelRespDTO;
import com.dx.facade.merchant.dto.WindControlLevelIdReqDTO;
import com.dx.facade.merchant.dto.WindControlUserRpcDTO;
import com.dx.facade.windcontrol.req.WindControlRecordSave;
import com.dx.facade.windcontrol.resp.WindControlLevelResp;

import java.util.List;

public interface WindControlRecordRPCService {
    CommonResp<String> selectLevelNameByObjectInfo(Long merchantId, String objectInfo);

    CommonResp<Boolean> saveWindControlRecord(WindControlRecordSave windControlRecord);

    CommonResp<String>  getWindControlType(Long windControlId);
    CommonResp<WindControlLevelResp>  selectControlLvelName(String windControlId);
    CommonResp<List<ListWindControlLevelRespDTO>> selectWindControlLive(WindControlLevelIdReqDTO windDto);

    CommonResp<List<WindControlUserRpcDTO>> selectByWindControlIds(List<Long> merchantIds,List<String> windControlId);
}
