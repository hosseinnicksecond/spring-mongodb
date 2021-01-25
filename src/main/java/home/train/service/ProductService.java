package home.train.service;

import home.train.document.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();
    Product save(Product product);
    Product getById(String id);
    void deleteById(String id);
}
