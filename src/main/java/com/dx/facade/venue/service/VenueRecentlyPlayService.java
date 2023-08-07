package com.dx.facade.venue.service;

import com.dx.facade.venue.resp.RecentlyPlayingResp;

import java.util.List;

/**
 * @Author Rock
 * 最近在玩
 **/
public interface VenueRecentlyPlayService {


    List<RecentlyPlayingResp> venueRecentlyPlayList(Long memberId);

    void venueRecentlyPlay(Long memberId, String venueMemberId, String venueCode);

}
