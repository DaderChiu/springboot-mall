package com.steve.springbootmall.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.steve.springbootmall.constant.ProductCategory;
import com.steve.springbootmall.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	//ResultSet的get要依照類別去取
	//ResultSet get的key要小心不要打錯
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product = new Product();
		
		product.setProductId(rs.getInt("product_id"));
		product.setProductName(rs.getString("product_name"));
		
		String categoryStr = rs.getString("category");
		ProductCategory category = ProductCategory.valueOf(categoryStr);
		
		product.setCategory(category);
		product.setImageUrl(rs.getString("image_url"));
		product.setPrice(rs.getInt("price"));
		product.setStock(rs.getInt("stock"));
		product.setDescription(rs.getString("description"));
		product.setCreatedDate(rs.getTimestamp("created_date"));
		product.setLastModifiedDate(rs.getTimestamp("last_modified_date"));
		
		return product;
	}

}
