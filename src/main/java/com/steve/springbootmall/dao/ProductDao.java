package com.steve.springbootmall.dao;

import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductRequest;

public interface ProductDao {

	Product getProductById(Integer productId);
	
	Integer createProduct(ProductRequest productRequest);
	
}
