package com.mobiloitte.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobiloitte.com.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
