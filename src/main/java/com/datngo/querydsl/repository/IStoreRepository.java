package com.datngo.querydsl.repository;

import com.datngo.querydsl.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStoreRepository extends JpaRepository <Store, Long> {
}
