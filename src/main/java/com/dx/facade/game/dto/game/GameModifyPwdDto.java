package com.dx.facade.game.dto.game;

import com.dx.facade.enums.BwCurrencyEnum;
import com.dx.facade.enums.BwDeviceTypeEnum;
import com.dx.facade.enums.BwLanguageEnum;
import com.dx.facade.game.dto.GameDto;
import lombok.Data;

/**
 * 公共登陆请求参数
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/23 17:01
 */
@Data
public class GameModifyPwdDto extends GameDto {


    /**
     * 会员ID
     */
    private Long memberId;

    private String password;


    public GameModifyPwdDto() {
        super();
    }

}
