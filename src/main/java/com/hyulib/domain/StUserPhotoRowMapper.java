package com.hyulib.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class StUserPhotoRowMapper implements RowMapper<StUserPhoto>{
	
	
	@Override
	public StUserPhoto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		StUserPhoto userPhoto = new StUserPhoto();
		
		userPhoto.setUserId(rs.getString("USER_ID"));
		userPhoto.setFileSize(rs.getString("FILESIZE"));
		userPhoto.setPhoto(rs.getBytes("PHOTO"));
		
		
		return userPhoto;
	}

		
		
}
