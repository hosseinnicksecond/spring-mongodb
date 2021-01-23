package home.train.service;

import home.train.document.Product;
import home.train.repository.ProductRepository;

import java.util.Set;

public class ProductServiceImp implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Set<Product> getAllProduct() {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public Product getById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
