package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.capstore.dto.Product;
import com.cg.capstore.service.ICapstoreService;

@Controller
public class MyController {

	
	@Autowired

ICapstoreService service;
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll(Model model)
	{
		List<Product> prodList=service.showAllSortedProd();
		model.addAttribute("products", prodList);
		return "AllProds";
	}
	@RequestMapping(value="asc",method=RequestMethod.GET)
	public String getAllAsc(Model model)
	{
		List<Product> prodList1=service.showAllAscPriceProd();
		model.addAttribute("products", prodList1);
		return "ProdSortedList";
	}
	@RequestMapping(value="desc",method=RequestMethod.GET)
	public String getAllDesc(Model model)
	{
		List<Product> prodList=service.showAllDescPriceProd();
		model.addAttribute("products", prodList);
		return "ProdSortedList";
	}
	

}
