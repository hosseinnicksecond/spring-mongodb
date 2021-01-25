package home.train.service;

import home.train.document.Store;
import home.train.repository.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImp implements StoreService{

    private final StoreRepository storeRepository;

    public StoreServiceImp(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public List<Store> findAllStore() {
        return storeRepository.findAll();
    }

    @Override
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public List<Store> getStoreByOwner(String owner) {
        return storeRepository.findByOwner(owner);
    }

    @Override
    public List<Store> getStoreByName(String name) {
        return storeRepository.findByName(name);
    }
}
