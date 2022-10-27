package com.example.demo.controller;

import com.example.demo.service.TodoService;
import com.example.demo.dto.TestRequestBodyDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping
	public String testController() {
		return "Hello World";
	}
	
	@GetMapping("/path")
	public String testControllerPath() {
		return "Hello World path";
	}
	
	@GetMapping("/{id}")
	public String testControllerPathVariables(@PathVariable(required = false) int id)
	{
		return "Hello World ID" + id;
	}
		
	@GetMapping("/requestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO)
	{
		return "Hello" + testRequestBodyDTO.getId() + "Msg" + testRequestBodyDTO.getMessage();
	}
		
}

