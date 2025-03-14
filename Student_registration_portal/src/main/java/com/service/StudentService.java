package com.service;

import java.util.List;

import com.model.StudentModel;

public interface StudentService {

	public boolean saveStudent(StudentModel studentModel);
	public List<StudentModel> getStudentDetails();
}
