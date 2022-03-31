package com.datngo.querydsl.controller;

import com.datngo.querydsl.entity.Store;
import com.datngo.querydsl.model.StoreRequest;
import com.datngo.querydsl.service.IStoreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/store")
@AllArgsConstructor
public class StoreController {
    private final IStoreService storeService;

    @GetMapping
    public ResponseEntity getAllStores() {
        List<Store> stores = storeService.getAllStores();
        if (null != stores) return new ResponseEntity<>(stores, HttpStatus.OK);
        else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("error");
    }

    @PostMapping
    public ResponseEntity addStore(@RequestBody StoreRequest storeRequest) {
        Store store = new Store();
        store.setName(storeRequest.getName());
        storeService.addStore(store);
        return new ResponseEntity<>(store, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getStore(@PathVariable("id") Long id) {
        Store store = storeService.getStoreById(id);
        return new ResponseEntity<>(store, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteStore(@PathVariable("id") Long id) {
        storeService.deleteStoreById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
