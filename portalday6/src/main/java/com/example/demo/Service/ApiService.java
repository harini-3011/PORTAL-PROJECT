package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.Models.*;
import com.example.demo.Repository.*;


@Service
public class ApiService {

	@Autowired
	ChildRepo repository;
		public Optional<Child> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(Child t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
		public List<Child> setPages(@PathVariable int offset,@PathVariable int pageSize)
		{
			Page<Child> page=repository.findAll(PageRequest.of(offset, pageSize));
			return page.getContent();
		}
		
		public List<Child> getSort(String field)
		{
			return repository.findAll(Sort.by(Sort.Direction.ASC,field));
		}
}