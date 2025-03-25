
package com.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.model.StudentModel;
import com.repository.StudentDAO;
import com.service.StudentService;

@Controller
public class RegistrationController {

	@Autowired
	StudentService studentService;
	@RequestMapping("/home")
	String index() {
		return "home";
	}
		
	@PostMapping("/save")
	String save(@ModelAttribute StudentModel studentModel,Model model) {
		
		System.out.println(studentModel);
		System.out.println(studentModel.getId());
		boolean check=studentService.check(studentModel);
		if(!check) {
			model.addAttribute("message","Failed..");
			model.addAttribute("reasone", "Email is already in use.!");
			return "success";
		}
		boolean bool=studentService.saveStudent(studentModel);
		if(bool && studentModel.getId()!=0) {
			System.out.println("edit");
			model.addAttribute("message","Detail Updated Successfull..");
		}
		else if(bool) {
			System.out.println("save");
			model.addAttribute("message","Registration Successfull..");
		} else {
			model.addAttribute("message","Failed..");
		}
		return "success";
	}
	    
	@RequestMapping("/delete/{id}")
	String delete(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		return "redirect:/admin";
	}
	
	@RequestMapping("/admin")
	String getStudentDetails(Model model) {
		List<StudentModel>st= studentService.getStudentDetails();
//		System.out.println(st.get(0).getBase64Image()+"\n"+"hiie");
		model.addAttribute("students",st);
		return "adminpage";
	}
	
	@RequestMapping("/registrationform")
	String save() {
		
		return "registrationForm";
	}
	@RequestMapping("/edit/{id}")
	String edit(@PathVariable("id") int id,Model model)
	{
		StudentModel student =studentService.getSingleStudentDetails(id);
		model.addAttribute("student",student);
		
		return "editForm";
	}
	
//	@RequestMapping(value="/view",method = RequestMethod.POST)
//	String view(@RequestParam("profile") MultipartFile file,HttpSession s ,Model m) {
//		
//		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
//		System.out.println(path);
//		 m.addAttribute("img",file.getOriginalFilename());
//		try {
//			byte []data=file.getBytes();
//			FileOutputStream fl=new FileOutputStream(path);
//			fl.write(data);
//			fl.close();
//			System.out.println("Success");
//			} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "view";
//	}
	
}
