package com.dx.facade.texas.req;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Arrays;


/**
 * 全局开关类配置修改req(多个val值修改)
 */
@Data
public class DxGlobalConfigValueAddedUpdateReq implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("配置主键")
    private Long id;
    @ApiModelProperty("配置的key")
    private String keyword;
    @ApiModelProperty("val-pair")
    private String vals;
    @ApiModelProperty("配置类型")
    private Integer type;
    @ApiModelProperty("配置类型")
    private Integer state;
    @ApiModelProperty(value = "创建人", hidden = true)
    private String createdBy;
    @ApiModelProperty(value = "修改人", hidden = true)
    private String updatedBy;


    public JSONObject parseVals() {
        if (StringUtils.isEmpty(this.vals)) {
            return null;
        }
        String[] items = this.vals.split(",");
        JSONObject obj = new JSONObject();
        Arrays.stream(items).forEach(itm -> {
            String[] kv = itm.split("_");
            obj.put(kv[0], kv[1]);
        });
        return obj;
    }

}
