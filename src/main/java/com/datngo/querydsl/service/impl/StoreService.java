package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.repository.StoreRepository;
import com.datngo.querydsl.service.IStoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoreService implements IStoreService {

    private final StoreRepository storeRepository;

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public Store getStoreById(Long id) {
        return storeRepository.findById(id).get();
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public void deleteStoreById(Long id) {
        storeRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        storeRepository.deleteAll();
    }
}
