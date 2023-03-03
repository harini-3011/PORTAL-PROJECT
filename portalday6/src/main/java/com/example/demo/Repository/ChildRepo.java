package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.*;

public interface ChildRepo extends JpaRepository<Child,Integer>{

}