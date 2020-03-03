package com.student.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;
import com.student.service.StudentService;

@Service("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student save(Student student) {
		student.setStudentId(UUID.randomUUID().toString());
		return studentDao.save(student);
	}

	@Override
	public Student findStudent(String studentId) {
		
		return studentDao.findStudent(studentId);
	}

}
