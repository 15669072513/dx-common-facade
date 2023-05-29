package com.dx.facade.report.common;


import com.dx.exception.BizException;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public abstract class OrderReqDTO {

    @ApiModelProperty(hidden = true)
    private List<OrderKeyColumn> orderKeyToColumnList = new ArrayList<>();

    public abstract Integer getOrderKey();
    public abstract String getOrderType();

    public abstract String getDefaultOrderSql();

    public abstract void initOrderKeyToColumn(List<OrderKeyColumn> orderKeyList);

    @Data
    @AllArgsConstructor
    public class OrderKeyColumn{
        private Integer orderKey;
        private String column;
    }

    public String getOrderSql() throws BizException {
        if(Objects.isNull(getOrderKey())){
            return getDefaultOrderSql();
        }

        if(!Objects.equals(getOrderType(), "asc") && !Objects.equals(getOrderType(), "desc")){
            return "";
        }

        if(CollectionUtils.isEmpty(orderKeyToColumnList)){
            initOrderKeyToColumn(orderKeyToColumnList);
        }
        if(CollectionUtils.isEmpty(orderKeyToColumnList)){
            return "";
        }
        OrderKeyColumn orderKeyColumn = null;
        for (OrderKeyColumn keyColumn : orderKeyToColumnList) {
            if(keyColumn.getOrderKey().equals(getOrderKey())){
                orderKeyColumn = keyColumn;
                break;
            }
        }
        if(Objects.isNull(orderKeyColumn)){
            throw new BizException("排序orderKey 没有指定对应字段,key=[" + getOrderKey() +"]");
        }

        return " order by " + orderKeyColumn.getColumn() + " " + getOrderType() +" ";
    }
}
