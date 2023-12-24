package com.pavan.mapper;

import com.pavan.entity.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		Student std = new Student();
		std.setSid(rs.getString("sid"));
		std.setSname(rs.getString("sname"));
		std.setSaddr(rs.getString("saddr"));
		return std;
	}

}
