package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.facade.report.resp.MemberReportDTO;

import java.util.List;

/** The type Member report service. */
public interface MemberReportService {


    CommonResp<MemberReportDTO> selectMemberReportSumByUserId(Long userId);

    CommonResp<List<MemberReportDTO>> selectMemberReportSumByUserIdList(List<Long> userIdList);


}
