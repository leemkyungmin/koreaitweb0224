package com.koreait.projectE.dto;

import java.sql.Date;

public class CustomerDTO {

	private int cNo;
	private String cId,cPw,cName,cNickname,cPhone,cEmail,cPhoto,cGrade,cDept,cGender;
	private Date cRegdate;
	
	
	private String cPoto;
	//cPoto getter/setter 생성 
	// 하단 Constructor String cPoto 추가 
	// this.cPoto = cPoto 추가 
	
	
	public CustomerDTO() {}


	public CustomerDTO(String cPoto,int cNo, String cId, String cPw, String cName, String cNickname, String cPhone, String cEmail,
			String cPhoto, String cGrade, String cDept, String cGender, Date cRegdate) {
		super();
		this.cPoto=cPoto;
		this.cNo = cNo;
		this.cId = cId;
		this.cPw = cPw;
		this.cName = cName;
		this.cNickname = cNickname;
		this.cPhone = cPhone;
		this.cEmail = cEmail;
		this.cPhoto = cPhoto;
		this.cGrade = cGrade;
		this.cDept = cDept;
		this.cGender = cGender;
		this.cRegdate = cRegdate;
	}


	public String getcPoto() {
		return cPoto;
	}


	public void setcPoto(String cPoto) {
		this.cPoto = cPoto;
	}


	public int getcNo() {
		return cNo;
	}


	public void setcNo(int cNo) {
		this.cNo = cNo;
	}


	public String getcId() {
		return cId;
	}


	public void setcId(String cId) {
		this.cId = cId;
	}


	public String getcPw() {
		return cPw;
	}


	public void setcPw(String cPw) {
		this.cPw = cPw;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcNickname() {
		return cNickname;
	}


	public void setcNickname(String cNickname) {
		this.cNickname = cNickname;
	}


	public String getcPhone() {
		return cPhone;
	}


	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}


	public String getcEmail() {
		return cEmail;
	}


	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}


	public String getcPhoto() {
		return cPhoto;
	}


	public void setcPhoto(String cPhoto) {
		this.cPhoto = cPhoto;
	}


	public String getcGrade() {
		return cGrade;
	}


	public void setcGrade(String cGrade) {
		this.cGrade = cGrade;
	}


	public String getcDept() {
		return cDept;
	}


	public void setcDept(String cDept) {
		this.cDept = cDept;
	}


	public String getcGender() {
		return cGender;
	}


	public void setcGender(String cGender) {
		this.cGender = cGender;
	}


	public Date getcRegdate() {
		return cRegdate;
	}


	public void setcRegdate(Date cRegdate) {
		this.cRegdate = cRegdate;
	}


	
	
	
	
}       
  