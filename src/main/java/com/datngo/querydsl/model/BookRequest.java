package com.datngo.querydsl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String name;
    private String entryDate;
    private List<Long> storeIds;
    private List<Long> authorIds;
}
