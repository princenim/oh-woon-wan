package com.javalot.ohwoonwan.domain;

import jakarta.persistence.*;

import java.util.Optional;


@Entity
public class Post extends TimestampEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String category;
    private String title;
    private String content;
    private Integer view;

    @ManyToOne
    @JoinColumn(name = "`created_by`", referencedColumnName = "id")
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "`updated_by`", referencedColumnName = "id")
    private User updatedBy;

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public Integer getView() {
        return view;
    }
    public void setView(Integer view) {
        this.view = view;
    }

    public User getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }
}
