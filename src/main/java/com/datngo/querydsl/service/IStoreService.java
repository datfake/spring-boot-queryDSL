package com.datngo.querydsl.service;

import com.datngo.querydsl.entity.Store;

import java.util.List;

public interface IStoreService {
    List<Store> getAllStores();
    Store getStoreById(Long id);
    void deleteStoreById(Long id);
    int deleteAll();
}
