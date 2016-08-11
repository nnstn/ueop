package com.ueop.dao.pojo;

public class Cats {
    private Long id;

    private String name;

    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

	@Override
	public String toString() {
		return "Cats [id=" + id + ", name=" + name + ", num=" + num + "]";
	}
    
}