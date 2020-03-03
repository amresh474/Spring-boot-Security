package com.student.dao;

import com.student.model.Student;

public interface StudentDao {

	public Student save(Student student);

	public Student findStudent(String studentId);

}
