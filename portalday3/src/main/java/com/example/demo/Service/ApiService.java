package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.*;
import com.example.demo.Repositories.*;


@Service
public class ApiService {

	@Autowired
	EmployeeRepo repository;
		public Optional<Employee> gettaskdetail(int id){
			return repository.findById(id);
		}

		
}