package com.steve.springbootmall.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steve.springbootmall.constant.ProductCategory;
import com.steve.springbootmall.model.Product;
import com.steve.springbootmall.model.ProductQueryParams;
import com.steve.springbootmall.model.ProductRequest;
import com.steve.springbootmall.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(
			@RequestParam(required = false) ProductCategory category,
			@RequestParam(required = false) String search){
		
		
		ProductQueryParams productQueryParams = new ProductQueryParams();
		productQueryParams.setCategory(category);
		productQueryParams.setSearch(search);
		
		List<Product> productList = productService.getProducts(productQueryParams);
		
		return ResponseEntity.status(HttpStatus.OK).body(productList);
		
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
		
		Product product = productService.getProductById(productId);
		
		System.out.println(product);
		
		if(product != null) {
			return ResponseEntity.status(HttpStatus.OK).body(product);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
		Integer productId = productService.createProduct(productRequest);
		
		Product product = productService.getProductById(productId);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	
	@PutMapping("/products/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer productId
												,@RequestBody @Valid ProductRequest productRequest){
		
		//檢查product是否存在
		Product product = productService.getProductById(productId);
		
		if(product==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		//修改商品的數據
		productService.updateProduct(productId, productRequest);
		Product updatedProduct = productService.getProductById(productId);
		
		return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
		
	}
	
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<?> deleteProduct(@PathVariable Integer productId){
		
		//刪除商品的數據
		productService.deleteProductById(productId);
		
		//204
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
	
}
