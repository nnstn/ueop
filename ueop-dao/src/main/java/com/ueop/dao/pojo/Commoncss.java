package com.ueop.dao.pojo;

public class Commoncss {
    private String name;

    private String clazs;

    private String cat;

    private String version;

    private String author;

    private String log;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClazs() {
        return clazs;
    }

    public void setClazs(String clazs) {
        this.clazs = clazs == null ? null : clazs.trim();
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat == null ? null : cat.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }
}