package com.connect.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.connect.model.Product;

@Service
@Transactional
public interface ProductService {
	
	public Product createProduct(Product product);

	public List<Product> getAllDetails();

	public Product findById(Long cardNo);

	

	public void deleteProduct(Long cardNo);
	
	public void updateProduct(Long cardNo,Product product);

}
