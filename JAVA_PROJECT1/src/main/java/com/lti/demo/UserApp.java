package com.lti.demo;

public class UserApp {
	
	public static void main(String[] args) {
		Calculator c = new Calculator(100, 200);
		int sum = c.sum();
		System.out.println(sum);
		
		Product p = new Product(101, "Mobile", 2000);
		
		ProductService ps = new ProductService();
		String str = ps.addProduct(p);
		System.out.println(str);
		System.out.println("Second commit");
		
		
		
	}

}
