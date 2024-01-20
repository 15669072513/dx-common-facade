package com.dx.facade.enums;

import java.util.Optional;

public enum QueryReqEnums {
    ZK_LIST_PAGE(1, 1, true, "中控列表查询"),
    ZK_LIST_EXPORT(2, 1, false, "中控导出查询"),
    DL_LIST_PAGE(1, 2, true, "代理列表查询"),
    DL_LIST_EXPORT(2, 2, false, "代理导出查询"),
    APP_LIST_PAGE(1, 3, false, "APP列表查询");

    private Integer queryType;
    private Integer querySource;
    private boolean needSummary;
    private String desc;

    QueryReqEnums(Integer queryType, Integer querySource, boolean needSummary, String desc) {
        this.querySource = querySource;
        this.queryType = queryType;
        this.desc = desc;
        this.needSummary = needSummary;
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

    public boolean isNeedSummary() {
        return needSummary;
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
