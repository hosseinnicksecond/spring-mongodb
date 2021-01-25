package home.train.controller;


import home.train.document.Product;
import home.train.document.Store;
import home.train.service.ProductService;
import home.train.service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api/")
public class ProductsController {

    private final ProductService productService;
    private final StoreService storeService;

    public ProductsController(ProductService productService, StoreService storeService) {

        this.productService = productService;
        this.storeService = storeService;
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

    @GetMapping("store/all")
    public List<Store> findAllStore(){ return storeService.findAllStore();}

    @GetMapping("store/owner/{owner}")
    public List<Store> findStoreByOwner(@PathVariable("owner") String owner){
        return storeService.getStoreByOwner(owner);
    }

    @GetMapping("store/{name}")
    public List<Store> findStoreByName(@PathVariable("name")String name){
        return storeService.getStoreByName(name);
    }


}
