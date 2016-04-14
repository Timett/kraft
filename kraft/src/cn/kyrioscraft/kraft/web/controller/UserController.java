package cn.kyrioscraft.kraft.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kyrioscraft.kraft.web.service.UserService;


@Controller
@RequestMapping(value = "/json")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/jackson.htm")
	public String getJacksonData(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		
		
		return "something interst";
		
	}
	
	
	@RequestMapping(value="/jss.htm")
	public String testJsp(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		
		
		return "test";
		
	}
	
	
}
