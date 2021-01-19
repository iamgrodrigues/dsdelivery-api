package com.iamgrodrigues.dsdeliveryapi.repositories;

import com.iamgrodrigues.dsdeliveryapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByOrderByNameAsc();
}
