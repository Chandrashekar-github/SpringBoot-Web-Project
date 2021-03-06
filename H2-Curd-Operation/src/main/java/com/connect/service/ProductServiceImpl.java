package com.connect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.connect.dao.ProductRepository;
import com.connect.model.Product;

@Component
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		Product save = productRepository.save(product);
		return save;
	}

	@Override
	public List<Product> getAllDetails() {
		List<Product> findAll = productRepository.findAll();
		return findAll;
	}

	@Override
	public Product findById(Long cardNo) {
		Optional<Product> findById = productRepository.findById(cardNo);
		return findById.get();
	}

	@Override
	public void updateProduct(Long cardNo, Product product) {
		Optional<Product> findById = productRepository.findById(cardNo);
		Product newProduct = findById.get();
		newProduct.setAadhar(product.getAadhar());
		newProduct.setEmail(product.getEmail());
		newProduct.setName(product.getName());
		productRepository.save(newProduct);

	}

	@Override
	public void deleteProduct(Long cardNo) {
		productRepository.deleteById(cardNo);

	}

}
