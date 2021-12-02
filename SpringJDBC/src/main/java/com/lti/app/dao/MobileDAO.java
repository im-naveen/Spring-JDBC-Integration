package com.lti.app.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lti.app.pojo.Mobile;

public class MobileDAO
{
	private DataSource myDataSrc;
	private JdbcTemplate myjdbc;
	
	
	public void setMyDataSrc(DataSource myDataSrc) {
		this.myDataSrc = myDataSrc;
		this.myjdbc = new JdbcTemplate(myDataSrc);
	}
	
	public void saveMobile(Mobile mobile)
	{
		String qry ="insert into Mobile values(?,?,?,?)";
		myjdbc.update(qry, mobile.getImeNo(),mobile.getModelName(),mobile.getManufac(),mobile.getPrice());
		System.out.println("Mobile added");
	}
	
	public void updateMobile(Mobile mobile)
	{
		String qry ="update Mobile set modelname = ?,manufacturer=?,price=? where imeno=?";
		int count = myjdbc.update(qry, mobile.getModelName(),mobile.getManufac(),mobile.getPrice(),mobile.getImeNo());
		if(count>0)
			System.out.println("Updated");
		else
			System.out.print("Invalid IME");
	}
	public void deleteMobile(String imeno)
	{
		String qry ="delete from Mobile where IMENO=?";
		int count = myjdbc.update(qry, imeno);
		if(count>0)
			System.out.println("Mobile deleted");
		else
			System.out.println("Invalid IME");
	}
	
	public List<Mobile> getAllMobiles()
	{
		String qry = "select * from Mobile";
		List<Mobile> mobiles = myjdbc.query(qry, new MobileRowMapper());
		return mobiles;
	}

	@Override
	public String toString() {
		return "MobileDAO [getAllMobiles()=" + getAllMobiles() + "]";
	}

	
	
	

}
