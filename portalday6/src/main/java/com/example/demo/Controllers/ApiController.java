package com.example.demo.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Repository.ChildRepo;
import com.example.demo.Service.ApiService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ApiController {
	@Autowired
	ChildRepo serviceRepository;
	@Autowired
	ApiService service;
	@GetMapping("/getvalues")
	List<Child>getList()
	{
		return serviceRepository.findAll();
	}
	@PostMapping("/post")
	  public Child create(@RequestBody Child stu)
	  {
		return serviceRepository.save(stu);
	  }
	@GetMapping("/student/{offset}/{pageSize}")
	public List<Child> studentWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	{
		return service.setPages(offset, pageSize);
	}
	
	@GetMapping("/student/{field}")
	public List<Child> studentSortList(@PathVariable String field)
	{
		return service.getSort(field);
	}
	

}