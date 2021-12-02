package com.lti.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.lti.app.dao.MobileDAO;
import com.lti.app.pojo.Mobile;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	MobileDAO dao = (MobileDAO) context.getBean("mydao");
    	
    	//Mobile mob1 = new Mobile("IME001","Galaxy M31s","Samsung",17999);    	
    	//dao.saveMobile(mob1);
    	
    	
    	//Mobile mob2 = new Mobile("IME001","REDMI","Xiomi",17999);
    	//dao.updateMobile(mob2);
    	
    	//dao.deleteMobile("IME002");
    	
    	List<Mobile> res = dao.getAllMobiles();
    	for(Mobile b : res)
    	{
    		System.out.println(b);
    	}
    	
    	
    }
}
