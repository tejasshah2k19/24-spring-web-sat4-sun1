package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate stmt;

	public void addProduct(ProductBean productBean) {
		// insert query
		stmt.update("insert into products (name,price,qty,discount,category) values (?,?,?,?,?)", productBean.getName(),
				productBean.getPrice(), productBean.getQty(), productBean.getDiscount(), productBean.getCategory());
	}

	public List<ProductBean> getAllProducts() {
		List<ProductBean> productList = stmt.query("select * from products",
				new BeanPropertyRowMapper<>(ProductBean.class));
		return productList; 
	}

}
