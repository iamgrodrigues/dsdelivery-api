package com.iamgrodrigues.dsdeliveryapi.services;

import com.iamgrodrigues.dsdeliveryapi.dto.ProductDTO;
import com.iamgrodrigues.dsdeliveryapi.entities.Product;
import com.iamgrodrigues.dsdeliveryapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAll();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }
}
