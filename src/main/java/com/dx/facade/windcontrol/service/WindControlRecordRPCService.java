package com.dx.facade.windcontrol.service;

import com.dx.entity.CommonResp;
import com.dx.facade.windcontrol.req.WindControlRecordSave;

public interface WindControlRecordRPCService {
    CommonResp<String> selectLevelNameByObjectInfo(Long merchantId, String objectInfo);

    CommonResp<Boolean> saveWindControlRecord(WindControlRecordSave windControlRecord);

    CommonResp<String>  getWindControlType(Long windControlId);
}
