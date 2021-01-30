package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/courses")
	public String getCourses() {
		return "courses";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomerForm() {
		 return "courseForm";
	}
	
	@RequestMapping("/showDetail")
	public String customerDetailForm() {
		 return "viewCustomer";
	}
	
	@PostMapping("/savecustomer")
	public String saveCustomer(CourseCustomer cc) {
		repo.save(cc);
		return "courseForm";
	}
	
	@PostMapping("/details")
	public ModelAndView viewDetails(@RequestParam("cid") String cid) {
		System.out.println(cid);
		ModelAndView mv = new ModelAndView("viewCustomer");
		CourseCustomer cc = repo.findById(cid).orElse(null);
		mv.addObject("customer", cc);	
		return mv;
	}
	
	@RequestMapping("/customer/{cid}")
	@ResponseBody
	public Optional<CourseCustomer> getCustomerByCid(@PathVariable("cid") String cid){
		return repo.findById(cid);
	}
	
	@RequestMapping("/customers")
	@ResponseBody
	public List<CourseCustomer> getCustomerByCid(){
		return repo.findAll();
	}
}
