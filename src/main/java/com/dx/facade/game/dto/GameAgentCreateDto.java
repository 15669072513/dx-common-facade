package com.dx.facade.game.dto;

import com.dx.facade.enums.BwDeviceTypeEnum;
import com.dx.facade.enums.BwLanguageEnum;
import lombok.Data;

/**
 * 创建账号请求参数
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 17:01
 */
@Data
public class GameAgentCreateDto extends GameDto {
    /**
     *代理名称
     */
    private String account;
    /**
     * 子代理名称
     */
    private String cid;
    /**
     * 上级代理名称
     */
    private String parentCid;


    public GameAgentCreateDto() {
        super();
    }

}
