package com.koreait.projectE.dao;

import com.koreait.projectE.dto.CustomerDTO;
import com.koreait.projectE.dto.DepartmentDTO;
import com.koreait.projectE.dto.DepartmentLoginDTO;

public interface LoginDAO {
   
	// 일반 회원가입
	public void customerSignUp(String cId,String cPw,String cName,String cNickname,String cPhone,String cEmail, String saveFilename, String cGender);
	
	// 업체 회원가입
	public void deptSignUp(String dSaup_no, String dId, String dPw );
	
	// 일반 회원 아이디 중복체크
	public int idCheck(String cId);
	
	// 사업자 아이디 중복체크
	public int deptidCheck(String dId);
	
	// 사업자 번호 중복 체크
	public int dSaup_noCheck(String dSaup_no);
	
	// 별명 중복체크
	public int NicknameCheck(String cNickname);
	
	// 일반 회원 이메일 중복체크
	public int emailCheck(String cEmail);
	
	// 일반 회원 로그인
	public CustomerDTO customerLogin(String cId, String cPw);
	
	// 일반 회원 마이홈
	public CustomerDTO selectBycNo(int cNo);
	
	// 일반 회원 비밀번호 변경
	public int pwUpdate(String cPw, int cNo);
	
	// 일반 회원 닉네임 변경
	public int nicknameUpdate(String cNickname, int cNo );
	
	// 사업자 로그인
	public DepartmentLoginDTO departmentLogin(String dId,String dPw);
	
	// 사업자 마이홈
	public DepartmentDTO selectBydSaup_no(String dSaup_no);
	
	// 사업자 비밀번호 변경
	public int deptpwUpdate(String dPw, String dSaup_no);
	
	// 사업자 정보수정 승인요청
	public void departInsert(String dSeat,String dSaup_no,String dPhone,String dName,String dAddress, String dStart, String dEnd, String dParking, String dType, String amuguna );
	
	public void departUpdate(String dSeat,String dSaup_no,String dPhone,String dName,String dAddress, String dStart, String dEnd, String dParking, String dType, String amuguna );
	
	public int goDb(String dSaup_no);
}
