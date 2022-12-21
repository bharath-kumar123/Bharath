package com.bharath.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.constant.AppConstant;
import com.bharath.spring.dto.RegisterDto;
import com.bharath.spring.service.RegisterService;

@Controller
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class RegisterController {
	@Autowired
	private RegisterService registerService;
	public RegisterController()
	{
		System.out.println(this.getClass().getSimpleName()+"class object created");
	}
	@RequestMapping(value=AppConstant.SAVE_REGISTER_DETAILS)
	public ModelAndView saveRegisterdetails(RegisterDto registerDto)
	{
		System.out.println(registerDto);
		registerService.processRegisterDetails(registerDto);
		return new ModelAndView("index.jsp");
	}
}
