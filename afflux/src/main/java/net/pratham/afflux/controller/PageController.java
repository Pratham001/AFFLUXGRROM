package net.pratham.afflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.pratham.affluxbackend.dao.serviceDAO;
import net.pratham.affluxbackend.dto.services;

@Controller
public class PageController {
	
	
	@Autowired
	private serviceDAO serviceDAO;
	
	

	@RequestMapping(value = { "/", "/index", "/home" })

	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing the list of services
		
		mv.addObject("service",serviceDAO.list());
		
		
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About us");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	
	
	/*
	 *  methods to load all the salons and based on services
	 */

	@RequestMapping(value = "/show/all/salons")

	public ModelAndView showAllSalons() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Salons");
		
		//passing the list of services
		
		mv.addObject("service",serviceDAO.list());
		
		
		mv.addObject("userClickAllSalons", true);
		return mv;

	}
	
	
	@RequestMapping(value = "/show/services/{id}/salons")

	public ModelAndView showServiceSalons(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");
	
		// serviceDAO to fetch a single service
	   services services= null;
	   
	   services=serviceDAO.get(id);
		
		
		mv.addObject("title", services.getName());
		
		//passing the list of services
		
		mv.addObject("service",serviceDAO.list());
		
		//passing single category object
		
		mv.addObject("services", services);
		
		
		mv.addObject("userClickServiceSalons", true);
		return mv;

	}

	
	
}
