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
	import com.virtusa.dao.FacilitiesDao;

	@Controller
	public class FacilitiesController {
		@Autowired
		FacilitiesDao dao;
		@RequestMapping("/Facilitiesform")
		public String showForm(Model m){
			m.addAttribute("command", new Facilities());
			System.out.println("show Form");
			return "Facilitiesform";
			
		}
		
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public String save(@ModelAttribute("fac")Facilities fac){
			dao.insert(fac);
			return "redirect:/facilitiesview";
		}
		@RequestMapping("/facilitiesview")
		public String viewfac(Model m){
			List<Facilities> facList= dao.getFacilitiesDetails();
			
			m.addAttribute("facList",facList);
			return "facilitiesview";
		}
		
		@RequestMapping(value="/editfac/{CaseFile_No}")
		public String edit(@PathVariable int CaseFile_No, Model m){
			Facilities fac=dao.getfacCaseFile_No(CaseFile_No);
			m.addAttribute("command",fac);
			return "faceditformjsp";
		}
		@RequestMapping(value="/editsave",method=RequestMethod.POST)
		public String editSave(@ModelAttribute("fac") Facilities fac){
			dao.update(fac);
			return "redirect:/facilitiesview";
		}
		
		@RequestMapping(value="/deletefac/{CaseFile_No}")
		public String delete(@PathVariable int CaseFile_No){
			dao.delete(CaseFile_No);
			return "redirect:/facilitiesview";
		}
		
	}
