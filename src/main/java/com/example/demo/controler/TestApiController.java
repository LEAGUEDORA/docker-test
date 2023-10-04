package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;

@RestController
@RequestMapping("/api/testapi")

public class TestApiController {
		
	@GetMapping("/getok")
	public Patient getAll(){
		Patient patient = new Patient();
		patient.setAge(21);
		patient.setName("Nagu");
		patient.setId(1);
		return patient;
		
	}

}
