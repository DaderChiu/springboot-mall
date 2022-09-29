package com.steve.springbootmall.dao;

import java.util.List;

import com.steve.springbootmall.constant.ProductCategory;
import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductRequest;

public interface ProductDao {

	List<Product> getProducts(ProductCategory category, String search);
	
	Product getProductById(Integer productId);
	
	Integer createProduct(ProductRequest productRequest);
	
	void updateProduct(Integer productId, ProductRequest productRequest);
	
	void deleteProductById(Integer productId);
	
}
