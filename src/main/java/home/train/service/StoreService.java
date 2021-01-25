package home.train.service;

import home.train.document.Store;

import java.util.List;

public interface StoreService {

    List<Store> findAllStore();
    Store saveStore(Store store);
    List<Store> getStoreByOwner(String owner);
    List<Store> getStoreByName(String name);
}
