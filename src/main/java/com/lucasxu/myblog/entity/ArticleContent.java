package com.lucasxu.myblog.entity;

import java.util.Date;

public class ArticleContent {
    private Long id;

    private Long article_id;

    private Date create_by;

    private Date modifield_by;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
    }

    public Date getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Date create_by) {
        this.create_by = create_by;
    }

    public Date getModifield_by() {
        return modifield_by;
    }

    public void setModifield_by(Date modifield_by) {
        this.modifield_by = modifield_by;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}