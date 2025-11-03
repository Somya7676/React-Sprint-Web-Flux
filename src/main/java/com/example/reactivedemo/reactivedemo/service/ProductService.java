package com.example.reactivedemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reactivedemo.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final List<Product> products = List.of(
            new Product("1", "Laptop", 55000),
            new Product("2", "Mobile", 25000),
            new Product("3", "Headphones", 2000)
    );

    public Flux<Product> getAllProducts() {
        // Flux emits multiple products asynchronously
        return Flux.fromIterable(products);
    }

    public Mono<Product> getProductById(String id) {
        // Mono emits a single product (or empty if not found)
        return Flux.fromIterable(products)
                .filter(p -> p.getId().equals(id))
                .next();
    }
}
