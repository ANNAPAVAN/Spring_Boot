package com.pavan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pavan.entity.Student;
import com.pavan.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/welcome")
	public String showWelcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/addform")
	public String showAddPage() {
		return "addform";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@RequestParam String sid,@RequestParam String sname,@RequestParam String saddr, ModelMap map) {
		
		map.addAttribute("studentOperation", "Student Insertion");
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddr(saddr);
		
		String status = studentService.addStudent(student);
		
		return status;
	}
	
	@RequestMapping("/searchform")
	public String showSearchPage() {
		return "searchform";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam String sid, ModelMap map) {
		String status="";
		Student std = studentService.searchStudent(sid);
			
		if(std!=null) {
			map.addAttribute("student", std);
			status="display";
		}else {
			status="notexisted";
		}
		
		return status;
	}
	
	@RequestMapping("/updateform")
	public String showUpdatePage() {
		return "updateform";
	}
	
	@RequestMapping(value="/editform", method=RequestMethod.POST)
	public String getEditForm(@RequestParam String sid, ModelMap map) {
		String status="";
		Student std = studentService.searchStudent(sid);
			
		if(std!=null) {
			map.addAttribute("student", std);
			status="editform";
		}else {
			status="notexisted";
		}
		
		return status;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@RequestParam String sid,@RequestParam String sname,@RequestParam String saddr, ModelMap map) {
		
		map.addAttribute("studentOperation", "Student Updation");
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddr(saddr);
		
		String status = studentService.updateStudent(student);
		
		return status;
	}
	
	@RequestMapping("/deleteform")
	public String showDeletePage() {
		return "deleteform";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@RequestParam String sid, ModelMap map) {
		String status="";
		map.addAttribute("studentOperation", "Student Deletion");
		Student std = studentService.searchStudent(sid);
			
		if(std!=null) {
			status = studentService.deleteStudent(sid);			
		}else {
			status="notexisted";
		}
		
		return status;
	}
}
