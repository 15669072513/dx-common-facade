package com.dx.facade.game.convert;

import com.dx.facade.annotation.ValueRenderer;
import com.dx.facade.enums.InsureOddsTypeEnum;

import java.util.Objects;

/**
 * 保险倍率类型解析
 */
public class InsuranceOddsRender implements ValueRenderer {

    @Override
    public Object render(Object value) {
        if (Objects.equals(value, InsureOddsTypeEnum.TWO_ALLIN.code())) {
            return InsureOddsTypeEnum.TWO_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.THREE_ALLIN.code())) {
            return InsureOddsTypeEnum.THREE_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.FOUR_ALLIN.code())) {
            return InsureOddsTypeEnum.FOUR_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.FIVE_ALLIN.code())) {
            return InsureOddsTypeEnum.FIVE_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.SIX_ALLIN.code())) {
            return InsureOddsTypeEnum.SIX_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.SEVEN_ALLIN.code())) {
            return InsureOddsTypeEnum.SEVEN_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.EIGHT_ALLIN.code())) {
            return InsureOddsTypeEnum.EIGHT_ALLIN.description();
        }

        if (Objects.equals(value, InsureOddsTypeEnum.NINE_ALLIN.code())) {
            return InsureOddsTypeEnum.NINE_ALLIN.description();
        }

        return value;
    }
}
