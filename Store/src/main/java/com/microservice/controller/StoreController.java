package com.microservice.controller;

import com.microservice.entity.Store;
import com.microservice.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/store/")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @GetMapping("all")
    @ResponseStatus(HttpStatus.OK)
    public List<Store> getAllStores() {
        return storeService.findAll();
    }

    @PostMapping("insert")
    @ResponseStatus(HttpStatus.CREATED)
    public Store insertStore(@RequestBody Store store) {
        return storeService.createStore(store);
    }
}
