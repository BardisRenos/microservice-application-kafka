package com.microservice.initdb;

import com.microservice.dao.StoreRepository;
import com.microservice.entity.Store;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class dbInitial {

    @Bean
    public CommandLineRunner initDB(StoreRepository storeRepository) {

        return args -> {

            List<Store> stores = new ArrayList<>(Arrays.asList(
                    new Store(1, "Praktiker", "15 Boulevard"),
                    new Store(2, "Nikos", "20 road"),
                    new Store(3, "Andreas", "47 Boulevard")));

            storeRepository.saveAll(stores);

        };
    }
}
