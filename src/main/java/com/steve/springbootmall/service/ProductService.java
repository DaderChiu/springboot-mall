package com.steve.springbootmall.service;

import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductRequest;

public interface ProductService {

	Product getProductById(Integer productId);
	
	Integer createProduct(ProductRequest productRequest);
	
	void updateProduct(Integer productId, ProductRequest productRequest);
	
	void deleteProductById(Integer productId);
	
}
