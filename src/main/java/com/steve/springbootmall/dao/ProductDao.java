package com.steve.springbootmall.dao;

import com.steve.springbootmall.model.Product;

public interface ProductDao {

	Product getProductById(Integer productId);
	
}
