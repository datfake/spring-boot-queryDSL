package com.datngo.querydsl.repository;

import com.datngo.querydsl.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository <Author, Long>{
}
