package com.dx.facade.auth.domain;

/**
 * PRC入参时候的分页信息
 *
 * @author deft
 */
public class PageDTO {

    /**
     * 当前页
     */
    private Integer currPage;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 一页显示的条数
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Long TotalSize;

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalSize() {
        return TotalSize;
    }

    public void setTotalSize(Long totalSize) {
        TotalSize = totalSize;
    }

}
