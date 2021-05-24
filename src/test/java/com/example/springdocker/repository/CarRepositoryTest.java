package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class CarRepositoryTest {
@Autowired
CarRepository carRepository;
    @Test
    void findCarByName() {
        Car c=new Car();
        c.setId("1");
        c.setName("Toyota");
        c.setNewModel(true);
        c.setCanIDriveIt(true);
        carRepository.save(c);
       List<Car> cars=carRepository.findCarByName("Toyota");
        assertEquals(cars.get(0),c);
    }
@Test
    void findCarByCanIDriveIt(){
    Car c=new Car();
    c.setId("1");
    c.setName("Toyota");
    c.setNewModel(true);
    c.setCanIDriveIt(true);
    carRepository.save(c);
    List<Car> cars=carRepository.findCarByCanIDriveIt(true);
    assertEquals(cars.get(0),c);
}
}