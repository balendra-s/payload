package com.example.payload;

import com.example.payload.entity.Employee;
import com.example.payload.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDb {
    private static final Logger log = LoggerFactory.getLogger(LoadDb.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepo employeeRepo){
        return args -> {
            log.info("Preloading " + employeeRepo.save(new Employee("Balendra","admin")));
            log.info("Preloading " + employeeRepo.save(new Employee("Ramya","student")));
        };
    }
}
