package com.poly.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poly.model.Product;

@Controller
public class ProductController {
	@GetMapping("/product/form")
	public String form(Model m) {
		Product pro = new Product();
		pro.setName("IPhone 13");
		pro.setPrice(23.545666);
		
		m.addAttribute("product1", pro);
		return "product/form";
	}

	@PostMapping("/product/save")
	public String save(Model m, Product pro) {
		m.addAttribute("name", pro.getName());
		m.addAttribute("price", pro.getPrice());
		
		
		return "product/form";
	}

	@ModelAttribute("items")
	public List<Product> getItems() {
		return Arrays.asList(new Product("A", 1.344), new Product("B", 12.765));
	}

}
