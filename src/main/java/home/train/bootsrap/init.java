package home.train.bootsrap;

import home.train.document.Address;
import home.train.document.Category;
import home.train.document.Product;
import home.train.document.Store;
import home.train.repository.ProductRepository;
import home.train.repository.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

//@Component
public class init implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final StoreRepository storeRepository;

    public init(ProductRepository productRepository, StoreRepository storeRepository) {
        this.productRepository = productRepository;
        this.storeRepository = storeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Store> stores= Arrays.asList(
                new Store("John","Magic Market",
                        new Address("London","england"),
                        "2224536"),
                new Store("Sarah","Lux Market",
                        new Address("Paris","france"),
                        "225476"),
                new Store("Emily","Small Market",
                        new Address("NewYork","usa"),
                        "236936")
        );

        Category home=new Category();
        home.setName("For Home");

        Category work= new Category();
        work.setName("For Work");

        Product product1= new Product();
        product1.setName("tablet");
        product1.setPrice(BigDecimal.valueOf(250.3));
        product1.setCategory(home);
        product1.setStores(stores.subList(0,2));


        Product product2= new Product();
        product2.setName("laptop");
        product2.setPrice(BigDecimal.valueOf(250.3));
        product2.setCategory(work);
        product2.setStores(stores.subList(1,3));

        Product product3= new Product();
        product3.setName("phone");
        product3.setPrice(BigDecimal.valueOf(250.3));
        product3.setCategory(work);
        product3.setStores(stores.subList(0,3));

        stores.forEach(storeRepository::save);

        System.out.println(productRepository.save(product1).getName());
        productRepository.save(product2);
        productRepository.save(product3);
    }
}
