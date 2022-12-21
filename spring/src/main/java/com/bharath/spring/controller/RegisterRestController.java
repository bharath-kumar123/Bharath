package com.bharath.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.spring.constant.AppConstant;
import com.bharath.spring.dto.RegisterDto;
import com.bharath.spring.entity.Register;
import com.bharath.spring.service.RegisterService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class RegisterRestController {
	@Autowired
	private RegisterService registerService;
	@GetMapping(value=AppConstant.GET_ALL_REGISTER_DETAILS)
	public @ResponseBody List<Register> getAllRegisterDetails()
	{
		List<Register> registerList=registerService.findAll();
		return registerList;
	}
	@PostMapping(value= AppConstant.SAVE_REGISTER)
	public void saveRegisterDetails(@RequestBody RegisterDto registerDto)
	{
		registerService.processRegisterDetails(registerDto);
	}
	@GetMapping(value= AppConstant.FIND_BY_NAME)
	public @ResponseBody Register findByName(@PathVariable("username") String name)
	{
		System.out.println(name);
		return registerService.findByName(name);
	}
	@GetMapping(value= AppConstant.GET_BY_NAME)
	public @ResponseBody Register getByName(@RequestHeader("name") String name)
	{
		System.out.println(name);
		return registerService.findByName(name);
	}
}
