package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
}
