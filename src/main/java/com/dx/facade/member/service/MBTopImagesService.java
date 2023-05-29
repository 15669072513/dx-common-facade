package com.dx.facade.member.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.MBUserTopImageParam;
import com.dx.facade.member.resp.MBUserTopImageDTO;

import java.util.List;

public interface MBTopImagesService {

	
	 public CommonResp<MBUserTopImageDTO> upload(String topImagesUrl, Long userId, Long merchantId) throws BizException;
	 
	 public CommonResp<Integer> setCurrentTopImages(MBUserTopImageParam userTopImageParam) throws BizException;
	 
	 public CommonResp<Integer> deleteImages(MBUserTopImageParam userTopImageParam) throws BizException;
	 
	 public CommonResp<List<MBUserTopImageDTO>> getTopImages(MBUserTopImageParam userTopImageParam) throws BizException ;
}
