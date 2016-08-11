package com.ueop.dao.pojo;

public class Model {
    private Integer id;

    private String name;

    private Integer removeable;

    private Integer moveable;

    private Integer user;

    private String project;

    private String html;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRemoveable() {
        return removeable;
    }

    public void setRemoveable(Integer removeable) {
        this.removeable = removeable;
    }

    public Integer getMoveable() {
        return moveable;
    }

    public void setMoveable(Integer moveable) {
        this.moveable = moveable;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html == null ? null : html.trim();
    }
}