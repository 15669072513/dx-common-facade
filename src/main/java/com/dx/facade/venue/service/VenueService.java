package com.dx.facade.venue.service;

import com.dx.entity.CommonResp;
import com.dx.facade.venue.dto.GameHallDTO;
import com.dx.facade.venue.dto.GameVenueDTO;

import java.util.List;

/**
 * @Author Rock
 * 场馆业务RPC
 **/
public interface VenueService {

    CommonResp<GameHallDTO> venueList();


    CommonResp<List<GameVenueDTO>> recommendGameList(String venueTypeCode);


    CommonResp<List<GameVenueDTO>> switchGameList();




}
