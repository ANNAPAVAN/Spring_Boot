package com.pavan.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pavan.dao.StudentDao;
import com.pavan.entity.Student;

@Service            //In this service layer we can provide validations or transactions ect.. part also
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public String addStudent(Student student) {
		String status = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		Student student = studentDao.search(sid);
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		String status = studentDao.update(student);
		return status;
	}

	@Override
	public String deleteStudent(String sid) {
		String status = studentDao.delete(sid);
		return status;
	}

}
