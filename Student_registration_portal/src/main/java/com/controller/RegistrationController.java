
package com.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.service.StudentServiceImpls;
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

    private final StudentServiceImpls studentServiceImpls;

	@Autowired
	StudentService studentService;

    RegistrationController(StudentServiceImpls studentServiceImpls) {
        this.studentServiceImpls = studentServiceImpls;
    }
	@RequestMapping("/home")
	String index() {
		return "home";
	}
		
	@PostMapping("/save")
	String save(@ModelAttribute StudentModel studentModel,Model model,HttpServletRequest request) {
		
		System.out.println(studentModel);
		System.out.println(studentModel.getId());
		boolean check=studentService.checkPresent(studentModel);
		if(check) {
			model.addAttribute("message","Registration Failed..");
			model.addAttribute("reasone", "Email is already in use.!");
			return "success";
		}
		boolean bool=studentService.saveStudent(studentModel);
		if(bool && studentModel.getId()!=0) {
//			System.out.println("edit");
			model.addAttribute("url","admin");
			model.addAttribute("message","Detail Updated Successfull..");
		}
		else if(bool) {
//			System.out.println("save");
			model.addAttribute("message","Registration Successfull..");
		} else {
			model.addAttribute("message","Failed..");
		}
		
//		String arr[]=request.getHeader("Referer").split("/");
//		if(arr[arr.length-2]=="edit")
//			model.addAttribute("url",request.getHeader("Referer"));
//		else model.addAttribute("url",null);
//		System.out.println(arr[arr.length-2]);
		return "success";
	}
	    
	@RequestMapping("/delete/{id}")
	String delete(@PathVariable("id") int id,HttpSession session) {
		
		if(session.getAttribute("adminEmail")!=null) {
			studentService.deleteStudent(id);
			return "redirect:/adminValidate";
			}else {
				return "redirect:/adminLogin";
			}
		
	}
	
	@RequestMapping("/adminLogin")
	String getStudentDetails(Model model) {
		
		return "adminLogin";
	}
	
	@RequestMapping("/adminPage")
	String AdminPage(Model model,@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session) {
//		System.out.println(email);
//		System.out.println(email.equals("admin@gmail.com"));
//		System.out.println(password);
//		System.out.println(password.equals("admin"));
//		System.out.println(request.getHeader("referer"));
		if(email.equals("admin@gmail.com") && password.equals("admin")) {
			List<StudentModel>st= studentService.getStudentDetails();
//			System.out.println(st.get(0).getBase64Image()+"\n"+"hiie");
			model.addAttribute("students",st);
			session.setMaxInactiveInterval(900);
			session.setAttribute("adminEmail",email);
			return "redirect:/adminValidate";
		}
		else {
			model.addAttribute("message","Login Failed.."); 
			model.addAttribute("reasone", "Invalid Credentials.!");
			return "success";
		}
	}
	
	@RequestMapping("/studentLogin")
	String save() {
		
		return "studentLogin";
	}
	@RequestMapping("/edit/{id}")
	String edit(@PathVariable("id") int id,Model model,HttpSession session)
	{
		if(session.getAttribute("adminEmail")!=null) {
		StudentModel student =studentService.getSingleStudentDetails(id);
		model.addAttribute("student",student);
		return "editForm";
		}else {
			return "redirect:/adminLogin";
		}
		
	}
	
	@RequestMapping("/studentRegistration")
	String register()
	{
		return "studentReistration";
	}
	
	@RequestMapping("/adminValidate")
	String adminValidate(Model model,HttpSession session)
	{
		if(session.getAttribute("adminEmail")!=null) {
		List<StudentModel>st= studentService.getStudentDetails();
		model.addAttribute("students",st);
		return "adminpage";
		}else {
			return "redirect:/adminLogin";
		}
	}
	
	@RequestMapping("/logout")
	String logout(HttpSession session)
	{	
			session.invalidate();
			return "redirect:/home";
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
