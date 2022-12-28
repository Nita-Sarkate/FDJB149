package com.infy.springbootrestapicrudapp.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootrestapicrudapp.app.model.Product;
import com.infy.springbootrestapicrudapp.app.repository.ProductRepository;
import com.infy.springbootrestapicrudapp.app.serviceI.ProductServiceI;
@Service
public class ProductServiceimpl implements ProductServiceI
{
	@Autowired
   ProductRepository pr;
	@Override
	public Product saveProduct(Product p)
	{
		
		return pr.save(p);
	}
	@Override
	public Product updateProduct(Integer productId, Product p) 
	{
	    Optional<Product> op = pr.findById(productId);	
	    if(op.isPresent())
	    {
	    	Product product = op.get();
	    	product.setProductName(p.getProductName());
	    	product.setProductPrice(p.getProductPrice());
	    	return pr.save(product);
	    }
	    else
	    {
	    	return null;
	    }
	    
	}
	@Override
	public List<Product> getAllProduct()
	{
		return pr.findAll();
	}
	@Override
	public void deleteProduct(Integer productId) 
	{
		pr.deleteById(productId);
		
	}

}
