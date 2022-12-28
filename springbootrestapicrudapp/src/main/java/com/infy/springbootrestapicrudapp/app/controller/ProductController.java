package com.infy.springbootrestapicrudapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.serviceI.ProductServiceI;

@RestController
@RequestMapping(value="/api")
public class ProductController 
{
	@Autowired
	ProductServiceI psi;
	 //Post Api
	  @PostMapping(value="/product")
  public Product saveProduct(@RequestBody Product p)
  {
	Product product = psi.saveProduct(p);
	  return null;
  }
	  
	 //Put Api
	  @PutMapping(value="/product/{productId}")
	  public Product updateProduct(@PathVariable Integer productId,@RequestBody Product p)
	  {
		  Product product = psi.updateProduct(productId,p);
		  return product;
	  }
	  
	  //Get Api
	  
	  @GetMapping(value="/getproduct") 
	  public List<Product> getAllProduct() 
	  { 
		  List<Product> list =psi.getAllProduct();
	      return list; 
	  }
	  
	  //Delete Api
	  @DeleteMapping(value="/product/{productId}")
	  public void deleteProduct(@PathVariable Integer productId)
	  {
		  psi.deleteProduct(productId);
	  }
}
