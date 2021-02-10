package com.galvanize.racecar.Service;

import com.galvanize.racecar.Entity.Car;
import com.galvanize.racecar.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> fetchAllCars() {
        return carRepository.findAll();

    }

}
