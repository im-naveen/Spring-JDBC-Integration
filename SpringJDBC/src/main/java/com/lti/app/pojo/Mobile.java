package com.lti.app.pojo;

public class Mobile {
	
	private String imeNo;
	private String modelName;
	private String manufac;
	private double price;	
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	
	public Mobile(String imeNo, String modelName, String manufac, double price) {
		super();
		this.imeNo = imeNo;
		this.modelName = modelName;
		this.manufac = manufac;
		this.price = price;
	}


	public String getImeNo() {
		return imeNo;
	}
	public void setImeNo(String imeNo) {
		this.imeNo = imeNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufac() {
		return manufac;
	}
	public void setManufac(String manufac) {
		this.manufac = manufac;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [imeNo=" + imeNo + ", modelName=" + modelName + ", manufac=" + manufac + ", price=" + price
				+ "]";
	}
	
	

}
