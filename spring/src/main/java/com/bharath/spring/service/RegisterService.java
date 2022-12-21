package com.bharath.spring.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bharath.spring.dto.RegisterDto;
import com.bharath.spring.entity.Register;
import com.bharath.spring.repository.RegisterRepository;

@Component
public class RegisterService {
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RegisterRepository registerRepository;
	public void processRegisterDetails(RegisterDto registerDto)
	{
		Register register =modelMapper.map(registerDto, Register.class);
		registerRepository.save(register);
	}
	public List<Register> findAll()
	{
		return registerRepository.findAll();
	}
	public Register findByName(String name)
	{
		return registerRepository.findByName(name);
	}

}
