package com.datngo.querydsl.service.impl;

import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.service.IStoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService implements IStoreService {
    @Override
    public List<Store> getAllStores() {
        return null;
    }

    @Override
    public Store getStoreById(Long id) {
        return null;
    }

    @Override
    public boolean deleteStoreById(Long id) {
        return false;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
