package lovo.j135_2.netctoss.usermag.beans;

import java.io.Serializable;

import lovo.j135_2.netctoss.paymag.beans.Pay;

public class Business implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7392409259437254963L;
	
	private int id;//业务id编号
	private String business_name;//业务账号
	private String password;//业务账号密码
	private AcconutUser fk_accountuser_id;//账务对象
	private Pay pay;//支付方式
	private Lab lab;//实验室
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Business(String business_name, String password, AcconutUser fk_accountuser_id, Pay pay, Lab lab) {
		super();
		this.business_name = business_name;
		this.password = password;
		this.fk_accountuser_id = fk_accountuser_id;
		this.pay = pay;
		this.lab = lab;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBusiness_name() {
		return business_name;
	}
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AcconutUser getFk_accountuser_id() {
		return fk_accountuser_id;
	}
	public void setFk_accountuser_id(AcconutUser fk_accountuser_id) {
		this.fk_accountuser_id = fk_accountuser_id;
	}
	public Pay getPay() {
		return pay;
	}
	public void setPay(Pay pay) {
		this.pay = pay;
	}
	public Lab getLab() {
		return lab;
	}
	public void setLab(Lab lab) {
		this.lab = lab;
	}
}
