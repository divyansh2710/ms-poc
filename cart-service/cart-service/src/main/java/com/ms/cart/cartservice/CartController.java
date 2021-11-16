package com.ms.cart.cartservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CartController {
	
	@GetMapping(path = "/api/cart-service/cart/get/carts")
	public String getDetails() {
//		System.out.println("In get contracts");
		return "carts";
	}
	
	@GetMapping(path = "/api/cart-service/cart/get/carts/{id}")
	public String getProductDetails(@PathVariable(name = "id") String id) {
		System.out.println("In get contracts");
	return "cartsById";
	}
	
	

}
