package com.student.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/v1/student")
public class StudentController {

	private static Logger logger = LogManager.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;
	
	@PostMapping()
	public ResponseEntity<Student> createStudent(@RequestBody Student student,@RequestHeader HttpHeaders httpHeaders){
		student=studentService.save(student);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{studentId}")
	public ResponseEntity<Student> findStudent(@PathVariable String studentId,@RequestHeader HttpHeaders httpHeaders ){
		Student student=studentService.findStudent(studentId);
		return ResponseEntity.ok(student);
	}

}
