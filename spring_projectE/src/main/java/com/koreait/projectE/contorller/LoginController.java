package com.koreait.projectE.contorller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koreait.projectE.command.CustomerSignUpCommand;
import com.koreait.projectE.command.DeptSignUpCommand;
import com.koreait.projectE.commom.Command;
import com.koreait.projectE.dao.LoginDAO;


@Controller
public class LoginController {
	
	@Autowired
	private SqlSession sqlSession;
	private Command command;
	
	
	
	@RequestMapping("loginChoicePage")
	public String loginChoicePage() {
		return "login/loginChoicePage";
	}
	
	@RequestMapping("customerLoginPage")
	public String goCustomerLoginPage() {
		return "login/customerLoginPage";
	}
	@RequestMapping("deptLoginPage")
	public String goDeptLoginPage() {
		return "login/deptLoginPage";
	}
	
	@RequestMapping("customerSignUp")
	public String goSignUpPage() {
		return "login/customerSignUpPage";
	}
	
	@RequestMapping("deptSignUpPage")
	public String godeptSingUpPage() {
		return "login/deptSignUpPage";
	}
	
	@RequestMapping(value="customerSignUp", method=RequestMethod.POST)
	public String customerSignUp(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new CustomerSignUpCommand();
		command.execute(sqlSession, model);
		return "redirect:customerLoginPage"; 
	}
	
	@RequestMapping(value="deptSignUp", method=RequestMethod.POST)
	public String deptSignUp(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new DeptSignUpCommand();
		command.execute(sqlSession, model);
		return "redirect:deptLoginPage";
	}
	
	@RequestMapping(value="idCheck", method=RequestMethod.POST, produces="text/html; charset=utf-8")
	@ResponseBody
	public String idCheck(@RequestParam("cId") String cId,
						Model model) {
		LoginDAO lDAO = sqlSession.getMapper(LoginDAO.class);
		return lDAO.idCheck(cId) + "";
	}
	
	@RequestMapping(value="NicknameCheck", method=RequestMethod.POST, produces="text/html; charset=utf-8")
	@ResponseBody
	public String NicknameCheck(@RequestParam("cNickname") String cNickname) {
		LoginDAO lDAO = sqlSession.getMapper(LoginDAO.class);
		return lDAO.NicknameCheck(cNickname) + "";
	}
}













