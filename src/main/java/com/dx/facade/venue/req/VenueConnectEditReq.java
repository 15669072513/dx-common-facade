package com.dx.facade.venue.req;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
public class VenueConnectEditReq {
    @ApiModelProperty("场馆id")
    @NotNull
    private Long venueId;

    @ApiModelProperty("场馆类型(选'全部'时不要传这个字段),如by,cp,qkl,见BwVenueTypeEnum枚举")
    @NotBlank
    private String venueType;

    @ApiModelProperty("场馆名称")
    @Length(min = 1, max = 20, message = "场馆名称最大为20个字符")
    private String venueName;

    @ApiModelProperty("场馆英文名")
    private String venueEnName;

    @ApiModelProperty("场馆泰文名")
    private String venueThName;

    @ApiModelProperty("场馆越南名")
    private String venueVnName;

    @ApiModelProperty("币种,如CNY,THB(见BwCurrencyEnum)")
    @NotEmpty
    private List<String> currencyTypes = new ArrayList<>();

    @ApiModelProperty("支持语言,如zh_CN,en_US,th_TH(见BwCurrencyEnum)")
    @NotEmpty
    private List<String> languageTypes = new ArrayList<>();

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty(value = "当前登录用户", hidden = true)
    private String currentUser;
}
