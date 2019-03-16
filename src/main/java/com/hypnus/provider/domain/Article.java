package com.hypnus.provider.domain;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String url;

    /**
     * 爬取状态 1 未爬取 2 已爬取
     */
    @Column(name = "craw_status")
    private Byte crawStatus;

    /**
     * 流程状态 1爬取中 2 失败 3成功
     */
    @Column(name = "proc_status")
    private String procStatus;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取爬取状态 1 未爬取 2 已爬取
     *
     * @return craw_status - 爬取状态 1 未爬取 2 已爬取
     */
    public Byte getCrawStatus() {
        return crawStatus;
    }

    /**
     * 设置爬取状态 1 未爬取 2 已爬取
     *
     * @param crawStatus 爬取状态 1 未爬取 2 已爬取
     */
    public void setCrawStatus(Byte crawStatus) {
        this.crawStatus = crawStatus;
    }

    /**
     * 获取流程状态 1爬取中 2 失败 3成功
     *
     * @return proc_status - 流程状态 1爬取中 2 失败 3成功
     */
    public String getProcStatus() {
        return procStatus;
    }

    /**
     * 设置流程状态 1爬取中 2 失败 3成功
     *
     * @param procStatus 流程状态 1爬取中 2 失败 3成功
     */
    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}