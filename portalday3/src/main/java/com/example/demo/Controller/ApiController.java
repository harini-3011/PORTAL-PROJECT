package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.*;
import com.example.demo.Service.*;
import com.example.demo.Repositories.*;

@RestController
public class ApiController {

	@Autowired
	  EmployeeRepo serviceRepository;
	@Autowired
	   ApiService service;
	 
	 @GetMapping("/getvalues")
	   List<Employee> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/post")
	  public Employee create(@RequestBody Employee t) {
		 return serviceRepository.save(t);
	 }
	 
	 @GetMapping("/getvalues/{id}")
	 public Optional<Employee> getbyid(@PathVariable int id){
		
		return service.gettaskdetail(id);
	 }
	 
	 
	 
}