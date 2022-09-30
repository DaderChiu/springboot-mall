package com.steve.springbootmall.model;

import com.steve.springbootmall.constant.ProductCategory;

//如果傳遞多個參數，創建一個類別處理請求參數比較方便
public class ProductQueryParams {

	private ProductCategory category;
	private String search;
	private String orderBy;
	private String sort;
	
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
}
