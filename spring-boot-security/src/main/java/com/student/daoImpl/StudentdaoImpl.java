package com.student.daoImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.student.dao.StudentDao;
import com.student.model.Student;


@Repository("StudentdaoImpl")
public class StudentdaoImpl implements StudentDao{
	private static final Logger LOGGER = LogManager.getLogger(StudentdaoImpl.class);
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Student save(Student student) {
		Student students=mongoTemplate.save(student);
		return students;
	}

	@Override
	public Student findStudent(String studentId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("studentId").is(studentId));		
		return (Student) mongoTemplate.find(query, Student.class);
		
	}

}
