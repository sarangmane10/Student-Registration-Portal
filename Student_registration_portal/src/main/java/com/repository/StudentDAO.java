package com.repository;

import java.util.List;

import com.entity.Student;
import com.model.StudentModel;

public interface StudentDAO {

	public boolean saveStudent(Student student);

	public List<Student> getStudentDetails();

	public boolean checkPresent(StudentModel m);

	public boolean deleteStudent(int id);

	public Student getSingleStudent(int id);
}
