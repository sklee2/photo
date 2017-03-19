package com.hyulib.domain;


public class StUserPhoto {

	String userId;
	String fileSize;
	Byte[] photo;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public Byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(Object bs) {
		this.photo = (Byte[]) bs;
	}
	
	
    
}
