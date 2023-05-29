package com.dx.facade.game.dto;

import com.dx.facade.enums.BwCurrencyEnum;
import com.dx.facade.enums.BwDeviceTypeEnum;
import com.dx.facade.enums.BwLanguageEnum;
import com.dx.facade.enums.BwVenueEnum;

import lombok.Data;

/**
 * 公共登陆请求参数
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 17:01
 */
@Data
public class GameLoginDto extends GameDto {
    

    /**
     * 会员ID
     */
    private Long memberId;


    /**
     * 语言 默认1
     */
    private BwLanguageEnum lang = BwLanguageEnum.ZH;

    /**
     * 设备类型 1=pc，2=h5，3=ios，4=android，5=other
     */
    private BwDeviceTypeEnum deviceType = BwDeviceTypeEnum.ANDROID;

    private BwCurrencyEnum currency = BwCurrencyEnum.CNY;

    /**
     * 返回商户地址
     * 登陆失败时，平台跳回商户的首页地址。H5页面上尤其需要直连地址方便跳转
     */
    private String backUrl;

    /**
     * 是否显示退出按钮
     * 0：默认值，不能外跳，不显示游戏选择房间界面的返回按钮
     * 1：不能外跳，显示游戏选择房间界面的返回按钮，点击返回按钮跳转到大厅
     * 2：可以外跳，显示游戏选择房间界面的返回按钮，点击返回按钮跳转到backurl
     */
    private Integer showExit;

    /**
     * 游戏ID
     */
    private Long gameId;

    /**
     * 动态域名 由商户提供
     */
    private String domain;
    
    
    private Boolean autoTransfer = true;


    public GameLoginDto() {
        super();
    }

}
