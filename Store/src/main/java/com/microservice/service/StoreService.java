package com.microservice.service;

import com.microservice.dao.StoreRepository;
import com.microservice.entity.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;


    public List<Store> findAll() {

        return storeRepository.findAll();
    }

    public Store createStore(Store store) {

        return storeRepository.save(store);
    }
}
