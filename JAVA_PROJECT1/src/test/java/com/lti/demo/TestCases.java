package com.lti.demo;

//import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCases {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test 
	public void testAddProduct() {
		Product p = new Product(101, "Mobile", 2000);
		ProductService ps = new ProductService();
		Assertions.assertEquals("Product Added!", ps.addProduct(p));
	}
	
	@Test
	public void testIDcard() {
		Product p = new Product(101, "Mobile", 2000);
		Assertions.assertEquals("LTI", p.getCompanyName());
	}
	
	@Test
	public void testUsernameisNull() {
		Throwable e = assertThrows(IllegalArgumentException.class,()->{
			User user = new User();
			user.setName(null);
			}
		);
		Assertions.assertEquals("Username cannot be blank", e.getMessage());
		
	}
	

}
