package com.ms.product.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping(value = "/api/product-service/product")
public class ProductController {
	@Value("${pari.ritzii}")
    private String data;
	@Value("${abc.def}")
    private String data1;
	@Value("${pari.pari}")
	private String pari;
	@GetMapping(path = "/get/products")
	public String getDetails() {
//		System.out.println("In get contracts");
		System.out.println(pari);
		return pari;
	}
	
	@GetMapping(path = "/get/products/{id}")
	public String getProductDetails(@PathVariable(name = "id") String id) {
		
	return data;
	}
	
	

}
