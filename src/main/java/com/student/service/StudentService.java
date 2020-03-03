package com.student.service;

import com.student.model.Student;

public interface StudentService {

	public Student save(Student student);

	public Student findStudent(String studentId);

}
