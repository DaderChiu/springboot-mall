package com.steve.springbootmall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.steve.springbootmall.dao.ProductDao;
import com.steve.springbootmall.model.Product;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public Product getProductById(Integer productId) {
		
		return productDao.getProductById(productId);
		
	}

	
	
}
