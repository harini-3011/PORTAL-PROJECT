package com.example.demo.Controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.*;
import com.example.demo.Service.*;
import com.example.demo.Repository.*;
@RestController
public class ApiController {

	@Autowired
	  newrepository serviceRepository;
	@Autowired
	   ApiService service;
	 @GetMapping("/getvalues")
	   List<Student> getList(){
		 return serviceRepository.findAll();
	 }
	 @PostMapping("/post")
	  public Student create(@RequestBody Student t) {
		 return serviceRepository.save(t);
	 }
	 
	 @GetMapping("/getvalues/{id}")
	 public Optional<Student> getbyid(@PathVariable int id){
		
		return service.gettaskdetail(id);
	 }
	 
	 
	 
	 @PutMapping("/task")
	 public String update(@RequestBody Student t) {
		 return service.updateDetails(t);
	 }
	 
	 @DeleteMapping("/task")
	 public String delete(@RequestParam int id) {
		 return service.deleteDetails(id);
	 }
	 
}