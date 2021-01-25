package home.train.repository;

import home.train.document.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StoreRepository extends MongoRepository<Store,String> {

    List<Store> findByOwner(String owner);
    List<Store> findByName(String name);

}
