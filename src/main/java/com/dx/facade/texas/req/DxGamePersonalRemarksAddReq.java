package com.dx.facade.texas.req;

import com.dx.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.Getter;

/**
 * <p>
 * 游戏个人信息备注Req
 * </p>
 *
 * @author broadway
 * @since 2024-01-27
 */
@Data
public class DxGamePersonalRemarksAddReq implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty("个人用户id")
  private Long userId;

  @ApiModelProperty("设置备注的用户id")
  private Long remarkUserId;

  @Getter
  @ApiModelProperty("备注名")
  private String userNameRemark;

  @Getter
  @ApiModelProperty("备注信息")
  private String userRemark;

  @ApiModelProperty("创建人")
  private String createdBy;

  @ApiModelProperty("修改人")
  private String updatedBy;

  public void setUserNameRemark(String userNameRemark) {
    //最多可以输入5个汉字或10个字符，超出部分不显示
    int userNameRemarkLength = StringUtil.stringLength(userNameRemark);
    if (userNameRemarkLength > 10) {
      this.userNameRemark = subTextString(userNameRemark, 10);
    } else {
      this.userNameRemark = userNameRemark;
    }
  }

  public void setUserRemark(String userRemark) {
    //最多可以输入20个汉字或40个字符，超出部分不显示
    int userRemarkLength = StringUtil.stringLength(userRemark);
    if (userRemarkLength > 40) {
      this.userRemark = subTextString(userRemark, 40);
    } else {
      this.userRemark = userRemark;
    }
  }

  //截取字符串长度(中文2个字节，半个中文显示一个)
  public String subTextString(String str, int len) {
    if (str.length() < len / 2) {
      return str;
    }
    int count = 0;
    StringBuffer sb = new StringBuffer();
    String[] ss = str.split("");
    for (int i = 1; i < ss.length; i++) {
      count += ss[i].getBytes().length > 1 ? 2 : 1;
      sb.append(ss[i]);
      if (count >= len) {
        break;
      }
    }
    //不需要显示...的可以直接return sb.toString();
    return sb.toString();
  }
}
