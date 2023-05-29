package com.dx.facade.account.param;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * 活动列表（纯展示页、首存） 返回参数封装
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityTemplateEasyExcel {

    @ExcelProperty(value = "会员账号(代理账号)", index = 0)
    @ColumnWidth(25)
    @ApiModelProperty(value = "会员账号(代理账号)")
    @NotBlank(message = "[会员账号(代理账号)]不能为空")
    private String username;
    

}
