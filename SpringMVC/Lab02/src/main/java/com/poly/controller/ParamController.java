package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

	
	@RequestMapping("/param/save/{x}")
	String params(Model m, @RequestParam String y, @PathVariable String x) {
		//String y = (req.getParameter("y"));
		
		m.addAttribute("x", x);
		m.addAttribute("y", y);
		m.addAttribute("yVal" , y);
		return "param";
	}
	
	@RequestMapping("/param")
	String param(Model m) {
		return "param";
	}
}
