package com.infy.springbootrestapicrudapp.app.serviceI;

import java.util.List;

import com.infy.springbootrestapicrudapp.app.model.Product;

public interface ProductServiceI 
{

	public Product saveProduct(Product p);

	public Product updateProduct(Integer productId, Product p);

	public List<Product> getAllProduct();

	public void deleteProduct(Integer productId);

}
