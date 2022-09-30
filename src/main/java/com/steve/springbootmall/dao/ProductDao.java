package com.steve.springbootmall.dao;

import java.util.List;

import com.steve.springbootmall.constant.ProductCategory;
import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductQueryParams;
import com.steve.springbootmall.model.ProductRequest;

public interface ProductDao {

	Integer countProduct(ProductQueryParams productQueryParams);
	
	List<Product> getProducts(ProductQueryParams productQueryParams);
	
	Product getProductById(Integer productId);
	
	Integer createProduct(ProductRequest productRequest);
	
	void updateProduct(Integer productId, ProductRequest productRequest);
	
	void deleteProductById(Integer productId);
	
}
