package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
