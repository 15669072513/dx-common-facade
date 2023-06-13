package com.dx.facade.merchant.req;

import lombok.Data;

/**
 * 商户请求参数类
 *
 * @author Nicolas
 * @version 1.0.0
 * @date 2021/4/7 20:33
 */
@Data
public class QueryMerchantParam {

    /**
     * 站点ID
     */
    private Long merchantId;
    /**
     * 站点代码
     */
    private String merchantCode;
    /**
     * 商户名称
     */
    private String merchantName;


}
