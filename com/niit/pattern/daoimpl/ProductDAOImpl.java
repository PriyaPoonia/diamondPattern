package com.niit.pattern.daoimpl;

import com.niit.pattern.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO
{            
	// singleton pattern
	private static ProductDAO  productDAO = null;
	 public static ProductDAO getProductDAO()
	 {
		 if(productDAO==null)
		 {
			 productDAO = new ProductDAOImpl();
			
		 }
		 return productDAO;
		
	 }
	 
	 private ProductDAOImpl()
	 {
		 
	 }
	
	
	
	
}
