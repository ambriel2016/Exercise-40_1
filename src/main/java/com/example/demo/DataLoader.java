package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car(1970, "Chevrolet","Chevrolet Vega");
        repository.save(car);

        car = new Car(1971, "Ford", "Ford Pinto");
        repository.save(car);

        car = new Car(1972, "Mazda", "Mazda Capella");
        repository.save(car);
    }
}
