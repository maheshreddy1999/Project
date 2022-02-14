package com.virtusa.controller;


	import java.util.List;  

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import com.virtusa.beans.*;
	import com.virtusa.controller.*;
	import com.virtusa.dao.SignupDao;

	@Controller
	public class SignupController {
		@Autowired
		SignupDao dao;
		@RequestMapping("/Signup")
		public String showForm(Model m){
			m.addAttribute("command", new Signup());
			System.out.println("show Form");
			return "Signup";
			
		}
		
		@RequestMapping(value="/saveeeee", method=RequestMethod.POST)
		public String save(@ModelAttribute("sin")Signup sin){
			dao.insert(sin);
			return "redirect:/Signup";
	
		}
		
		
	}
