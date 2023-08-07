package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.facade.venue.dto.ScrolOverviewDTO;

public interface ScrolOverviewService {

  /**
   * 滚动数据（场馆在线人数，桌台数量，赢钱滚动公告）
   * @param
   */
  CommonResp<ScrolOverviewDTO> overviewSummary();

}
