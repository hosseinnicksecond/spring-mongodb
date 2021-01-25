package home.train.controller;


import home.train.document.Product;
import home.train.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api/")
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService) {

        this.productService = productService;
    }

    @GetMapping("all")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PutMapping("{product}")
    public Product updateProDuct(@RequestParam Product product){
        return productService.save(product);
    }

    @PostMapping("{product}")
    public Product saveProduct(@RequestParam Product product){
        return productService.save(product);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id")String id){
        productService.deleteById(id);
    }
}
