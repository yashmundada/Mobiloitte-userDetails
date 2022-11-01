package com.mobiloitte.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobiloitte.com.dao.StudentRepository;
import com.mobiloitte.com.model.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student student) {
	studentRepository.save(student);
	return"student saved...";
	

}
}