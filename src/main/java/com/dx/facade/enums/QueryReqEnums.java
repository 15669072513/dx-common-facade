package com.dx.facade.enums;

import java.util.Optional;

public enum QueryReqEnums {
    ZK_LIST_PAGE(1, 1, "中控列表查询"), ZK_LIST_EXPORT(2, 1, "中控导出查询"),
    DL_LIST_PAGE(1, 2, "代理列表查询"), DL_LIST_EXPORT(2, 2, "代理导出查询");

    private Integer queryType;
    private Integer querySource;
    private String desc;

    QueryReqEnums(Integer queryType, Integer querySource, String desc) {
        this.querySource = querySource;
        this.queryType = queryType;
        this.desc = desc;
    }

    public Integer getQueryType() {
        return queryType;
    }

    public Integer getQuerySource() {
        return querySource;
    }


    public String getDesc() {
        return desc;
    }

    public static Optional<QueryReqEnums> getByTypeSource(Integer queryType, Integer querySource) {
        for (QueryReqEnums enums : values()) {
            if (enums.getQueryType().equals(queryType) && enums.getQuerySource().equals(querySource)) {
                return Optional.of(enums);
            }
        }
        return Optional.empty();
    }

}
