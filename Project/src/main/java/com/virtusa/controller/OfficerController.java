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
import com.virtusa.dao.OfficerDao;
import com.virtusa.dao.OfficerDao;

	@Controller
	public class OfficerController {
		@Autowired
		OfficerDao dao;
		@RequestMapping("/Officerform")
		public String showForm(Model m){
			m.addAttribute("command", new Officer());
			System.out.println("show Form");
			return "Officerform";
			
		}
		
		@RequestMapping(value="/savee", method=RequestMethod.POST)
		public String save(@ModelAttribute("off")Officer off){
			dao.insert(off);
			return "redirect:/officerview";
		}
		@RequestMapping("/officerview")
		public String viewdea(Model m){
			List<Officer> offList= dao.getOfficerDetails();
			
			m.addAttribute("offList",offList);
			return "officerview";
		}
		
		@RequestMapping(value="/editoff/{Off_id}")
		public String edit(@PathVariable int Off_id, Model m){
			Officer off=dao.getoffOff_id(Off_id);
			m.addAttribute("command",off);
			return "offeditformjsp";
		}
		@RequestMapping(value="/editsavee",method=RequestMethod.POST)
		public String editSave(@ModelAttribute("off") Officer off){
			dao.update(off);
			return "redirect:/officerview";
		}
		
		@RequestMapping(value="/deleteoff/{Off_id}")
		public String delete(@PathVariable int Off_id){
			dao.delete(Off_id);
			return "redirect:/officerview";
		}
		
	}
