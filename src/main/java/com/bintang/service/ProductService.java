package com.bintang.service;

import com.bintang.entity.Product;
import com.bintang.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).get();
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }
}
