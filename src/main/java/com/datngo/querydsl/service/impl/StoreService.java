package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.repository.IStoreRepository;
import com.datngo.querydsl.service.IStoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StoreService implements IStoreService {

    private final IStoreRepository storeRepository;

    @Override
    public List<Store> getAllStores() {
        return null;
    }

    @Override
    public Store getStoreById(Long id) {
        return null;
    }

    @Override
    public void deleteStoreById(Long id) {
    }

    @Override
    public void deleteAll() {
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }
}
