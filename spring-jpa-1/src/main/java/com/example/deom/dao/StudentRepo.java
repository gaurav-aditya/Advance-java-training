package com.example.deom.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>{

}
