package com.dx.facade.member.service;


import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.member.param.*;
import com.dx.facade.member.resp.MBUserTopImageDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;
import com.dx.facade.member.resp.MemberVO;
import com.dx.facade.member.resp.MemberVipDetailResp;

import io.swagger.annotations.ApiModelProperty;

public interface MemberInfoAppRPCService {

    @ApiModelProperty(value="忘记密码--验证用户名和手机号(邮箱)是否匹配,第一步")
    CommonResp<Boolean> verifyPhoneAndEmail(MemberVerifyPwdDTO params) throws BizException;

    @ApiModelProperty(value="忘记密码-手机号(邮箱)和验证码找回密码,第二步")
    CommonResp<MemberInfoRespDTO> getPwdByPhoneOrEmail(MemberVerifyCodeDTO params) throws BizException;

    @ApiModelProperty(value="忘记密码-密码修改,第三步")
    CommonResp<Boolean> updatePwd(UpdatePwdByMemberIdDTO params) throws BizException;

    @ApiModelProperty(value="设置-密码修改(旧密码修改)")
    CommonResp<MemberVO> updatePwdByOldPwd(MemberUpdatePwdDTO memberUpdatePwdDTO) throws BizException;

    @ApiModelProperty(value="头像修改、姓名修改rpc")
    CommonResp<Boolean> updateHeadImgAndName(MemberHeadImgAndNameDTO memberHeadImgAndNameDTO) throws BizException;

    @ApiModelProperty(value="手机号码(邮箱)绑定")
    CommonResp<Boolean> bindPhoneAndEmail(MemberBindEmailDTO params) throws BizException;

    @ApiModelProperty(value="vip晋级优惠活动详情rpc")
    CommonResp<MemberVipDetailResp> queryMemberVIPDetail(MemberVIPDetailParam params) throws BizException;

    @ApiModelProperty(value="更新会员基本信息(姓名、性别、生日)")
    CommonResp<Boolean> updateBaseInfoByUserId(MemberBaseInfoUpdDTO params) throws BizException;

    @ApiModelProperty(value="会员上传头像")
    CommonResp<MBUserTopImageDTO> upload(MemberUploadDTO params) throws BizException;

    @ApiModelProperty(value="设置当前头像")
    CommonResp<Integer> setCurrentTopImages(MBUserTopImageParam userTopImageParam) throws BizException;



}
