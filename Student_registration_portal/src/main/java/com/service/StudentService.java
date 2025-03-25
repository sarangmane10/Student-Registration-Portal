package com.service;

import java.util.List;

import com.model.StudentModel;

public interface StudentService {

	public boolean saveStudent(StudentModel studentModel);

	public List<StudentModel> getStudentDetails();

	public StudentModel getSingleStudentDetails(int id);

	public boolean deleteStudent(int id);

	public boolean checkPresent(StudentModel model);
}
