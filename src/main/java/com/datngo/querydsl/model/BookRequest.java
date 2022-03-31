package com.datngo.querydsl.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String name;
    private String entryDate;
    private List<Long> storeIds;
    private List<Long> authorIds;
}
