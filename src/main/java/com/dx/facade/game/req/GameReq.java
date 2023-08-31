 package com.dx.facade.game.req;

 import com.dx.facade.common.PageRequest;

 import io.swagger.annotations.ApiModelProperty;
 import lombok.Data;

 @Data
 public class GameReq extends PageRequest {

     private Long merchantId;

     private Long memberId;

     @ApiModelProperty("设备类型:1PC,2h5,3ios,4android,5其它")
     private Integer deviceType;
}
