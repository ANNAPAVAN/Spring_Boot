package com.pavan.dao;
import java.util.*;
import com.pavan.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pavan.entity.Student;

@Repository   //Handling all the database activities
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public String add(Student student) {
		String status = "";
		Student std = search(student.getSid());
		if(std==null) {
			int rowCount = jdbcTemplate.update("insert into student values('"+student.getSid()+"','"+student.getSname()+"','"+student.getSaddr()+"')");
			if(rowCount==1) {
				status = "success";
			}else {
				status="failure";
			}
		}else {
			status = "existed";
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
	    List<Student> studentList = jdbcTemplate.query("SELECT * FROM student WHERE sid = '"+sid+"'", new StudentRowMapper());

		
		if(studentList.isEmpty()) {
			student = null;
		}else {
			student = studentList.get(0);
		}
		return student;
	}

	@Override
	public String update(Student student) {
		String status="";
		int rowCount = jdbcTemplate.update("update student set sname='"+student.getSname()+"' , saddr='"+student.getSaddr()+"' where sid = '"+student.getSid()+"'");
		if(rowCount==1) {
			status="success";
		}else {
			status="failure";
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String status="";
		int rowCount = jdbcTemplate.update("delete from student where sid = '"+sid+"'");
		if(rowCount==1) {
			status="success";
		}else {
			status="failure";
		}
		return status;
	}

}
