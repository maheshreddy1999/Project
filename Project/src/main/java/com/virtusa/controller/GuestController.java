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
	import com.virtusa.dao.GuestDao;

	@Controller
	public class GuestController {
		@Autowired
		GuestDao dao;
		@RequestMapping("/Guestform")
		public String showForm(Model m){
			m.addAttribute("command", new Guest());
			System.out.println("show Form");
			return "Guestform";
			
		}
		
		@RequestMapping(value="/saveee", method=RequestMethod.POST)
		public String save(@ModelAttribute("gus")Guest gus){
			dao.insert(gus);
			return "redirect:/Guestview";
		}
		@RequestMapping("/Guestview")
		public String viewgus(Model m){
			List<Guest> gusList= dao.getGuestDetails();
			
			m.addAttribute("gusList",gusList);
			return "Guestview";
		}
		
		@RequestMapping(value="/editgus/{Gid}")
		public String edit(@PathVariable int Gid, Model m){
			Guest gus=dao.getgusGid(Gid);
			m.addAttribute("command",gus);
			return "guseditformjsp";
		}
		@RequestMapping(value="/editsaveee",method=RequestMethod.POST)
		public String editSave(@ModelAttribute("gus") Guest gus){
			dao.update(gus);
			return "redirect:/Guestview";
		}
		
		@RequestMapping(value="/deletegus/{Gid}")
		public String delete(@PathVariable int Gid){
			dao.delete(Gid);
			return "redirect:/Guestview";
		}
		
	}
