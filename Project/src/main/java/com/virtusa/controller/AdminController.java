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
	import com.virtusa.dao.AdminDao;

	@Controller
	public class AdminController {
		@Autowired
		AdminDao dao;
		@RequestMapping("/Adminform")
		public String showForm(Model m){
			m.addAttribute("command", new Admin());
			System.out.println("show Form");
			return "Adminform";
			
		}
		
		@RequestMapping(value="/saveeee", method=RequestMethod.POST)
		public String save(@ModelAttribute("adm")Admin adm){
			dao.insert(adm);
			return "redirect:/adminview";
		}
		@RequestMapping("/adminview")
		public String viewdea(Model m){
			List<Admin> admList= dao.getAdminDetails();
			
			m.addAttribute("admList",admList);
			return "adminview";
		}
		
		@RequestMapping(value="/editadm/{UserId}")
		public String edit(@PathVariable int UserId, Model m){
			Admin adm=dao.getadmUserId(UserId);
			m.addAttribute("command",adm);
			return "admeditformjsp";
		}
		@RequestMapping(value="/editsaveeee",method=RequestMethod.POST)
		public String editSave(@ModelAttribute("adm") Admin adm){
			dao.update(adm);
			return "redirect:/adminview";
		}
		
		@RequestMapping(value="/deleteadm/{UserId}")
		public String delete(@PathVariable int UserId){
			dao.delete(UserId);
			return "redirect:/adminview";
		}
		
	}
