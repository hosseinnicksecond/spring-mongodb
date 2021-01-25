package home.train.bootsrap;

import home.train.document.Category;
import home.train.document.Product;
import home.train.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class init implements CommandLineRunner {

    private final ProductRepository productRepository;

    public init(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Category home=new Category();
        home.setName("For Home");

        Category work= new Category();
        work.setName("For Work");

        Product product1= new Product();
        product1.setName("tablet");
        product1.setPrice(BigDecimal.valueOf(250.3));
        product1.setCategory(home);

        Product product2= new Product();
        product2.setName("laptop");
        product2.setPrice(BigDecimal.valueOf(250.3));
        product2.setCategory(work);

        Product product3= new Product();
        product3.setName("phone");
        product3.setPrice(BigDecimal.valueOf(250.3));
        product3.setCategory(work);

        System.out.println(productRepository.save(product1).getName());
//        productRepository.save(product2);
//        productRepository.save(product3);
    }
}
