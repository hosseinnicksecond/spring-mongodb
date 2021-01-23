package home.train.service;

import home.train.document.Product;

import java.util.Set;

public interface ProductService {

    Set<Product> getAllProduct();
    Product save(Product product);
    Product getById(String id);
    void deleteById(String id);
}
