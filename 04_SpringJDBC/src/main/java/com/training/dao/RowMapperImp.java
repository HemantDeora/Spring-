package com.training.dao;

import org.springframework.jdbc.core.RowMapper;

import com.training.Student;

public class RowMapperImp  implements RowMapper<Student>{

	@Override
	public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}

}
