package com.connect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connect.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
