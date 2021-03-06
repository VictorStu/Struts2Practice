package com.s1.entity;

public class User {
	private int id;
	private String name;
	private String psd;
	private String gender;
	private String email;
	private String birthDate;
//	private String mysql_str_to_date(String str) {
//		return "str_to_date("+str+", '%Y-%m-%d')";
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		if(birthDate==null||birthDate.isBlank()) birthDate="0000-00-00";
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
//		if(birthDate==null||birthDate.isBlank()) birthDate="0000-00-00";
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
