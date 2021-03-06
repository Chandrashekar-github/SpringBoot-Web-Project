package com.connect.controller;

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

import com.connect.model.Product;
import com.connect.service.ProductService;

@RestController
@RequestMapping("/H2")
public class Productontroller {

	@Autowired
	private ProductService productService;

	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	@GetMapping("/all")
	public List<Product> getAllDetails() {

		return productService.getAllDetails();
	}

	@GetMapping("/id/{cardNo}")
	public Product findById(@PathVariable(name = "cardNo") Long cardNo) {

		return productService.findById(cardNo);
	}

	@DeleteMapping("/delete/{cardNo}")
	public void deleteProduct(@PathVariable(name = "cardNo") Long cardNo) {
		productService.deleteProduct(cardNo);

	}

	@PutMapping("/update/{cardNo}")
	public void updateProduct(@PathVariable(name = "cardNo") Long cardNo, @RequestBody Product product) {
		productService.updateProduct(cardNo, product);

	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	} 
}
