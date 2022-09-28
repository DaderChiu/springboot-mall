package com.steve.springbootmall.service;

import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductRequest;

public interface ProductService {

	Product getProductById(Integer productId);
	
	Integer createProduct(ProductRequest productRequest);
}
