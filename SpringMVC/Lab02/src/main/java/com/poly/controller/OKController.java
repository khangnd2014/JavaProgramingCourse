package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ctrl")
public class OKController {
	@RequestMapping("/ok")
	public String ok() {
		return "ok";
	}

	@RequestMapping(value = "/ok", method = RequestMethod.POST)
	public String ok1(Model m) {
		m.addAttribute("result", "Primary Button");
		return "ok";
	}
	
	@RequestMapping(value = "/ok", method = RequestMethod.GET)
	public String ok2(Model m) {
		m.addAttribute("result", "Success Button");
		return "ok";
	}
	
	@RequestMapping(value = "/ok", params = "x",  method = RequestMethod.POST)
	public String ok3(Model m) {
		m.addAttribute("result", "Warning Button");
		return "ok";
	}
}
