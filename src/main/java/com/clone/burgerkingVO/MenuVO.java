package com.clone.burgerkingVO;

//import org.springframework.web.multipart.MultipartFile;

public class MenuVO {
	private int id;
	private String type;
//	private MultipartFile photo;
	private String photo;
	private String name;
	private String des;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	public MultipartFile getPhoto() {
//		return photo;
//	}
//	public void setPhoto(MultipartFile photo) {
//		this.photo = photo;
//	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	
}
