package com.lti.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lti.app.pojo.Mobile;

public class MobileRowMapper implements RowMapper<Mobile> {

	@Override
	public Mobile mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Mobile obj = new Mobile();
		
		obj.setImeNo(rs.getString(1));
		obj.setModelName(rs.getString(2));
		obj.setManufac(rs.getString(3));
		obj.setPrice(rs.getDouble(4));
		
		return obj;
	}

}
