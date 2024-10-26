package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;
import com.dao.ProductDao;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;

	@GetMapping("newproduct")
	public String newProduct() {
		return "NewProduct";
	}

	@PostMapping("saveproduct")
	public String saveProduct(ProductBean productBean) {
		// read data -> bean

		// validation

		// db insert
		productDao.addProduct(productBean);
		return "";
	}
	
	@GetMapping("listproducts")
	public String listProduct(Model model) {
		
		//get list from database 
		List<ProductBean> productList = productDao.getAllProducts();	
		//send list to jsp 
		model.addAttribute("productList",productList);
		System.out.println(productList.size());
		return "ListProduct";
	}
	
}
