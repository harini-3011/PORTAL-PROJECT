package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.*;
import com.example.demo.Repository.*;

@Service
public class ApiService {

	@Autowired
	newrepository repository;
		public Optional<Student> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(Student t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
}