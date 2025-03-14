package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.model.StudentModel;
import com.repository.StudentDAO;

@Service
public class StudentServiceImpls implements StudentService {

	@Autowired
	StudentDAO studentdao;

	@Override 
	public boolean saveStudent(StudentModel studentModel) {

		Student student = new Student(studentModel.getId(),studentModel.getFirstName(), studentModel.getLastName(),
				studentModel.getBirthdayDate(), studentModel.getGender(), studentModel.getEmailAddress(),
				studentModel.getPhoneNumber(), studentModel.getCourse());
		return studentdao.saveStudent(student);

	}

	@Override
	public List<StudentModel> getStudentDetails() {
		List<Student> students = studentdao.getStudentDetails();
		List<StudentModel> studentModel = new ArrayList<StudentModel>();

		for (Student student : students) {
			studentModel.add(new StudentModel(student.getId(),student.getGender(), student.getEmailAddress(), student.getPhoneNumber(),
					student.getFirstName(), student.getLastName(), student.getBirthdayDate(), student.getCourse()));
		}
		return studentModel;
	}
}
