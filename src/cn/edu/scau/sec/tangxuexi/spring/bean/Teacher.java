package cn.edu.scau.sec.tangxuexi.spring.bean;

import java.io.Serializable;

public class Teacher implements Serializable{
	private String id;
	private String name;
	private String gendar;
	private static final long serialVersionUID = 1L;
	public Teacher() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	
}
