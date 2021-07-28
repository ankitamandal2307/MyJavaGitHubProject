package com.lti.demo;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<Product> prdList = new ArrayList<>();

	public String addProduct(Product P) {
		
		prdList.add(P);
		return "Product Added!";
		
	}
}
