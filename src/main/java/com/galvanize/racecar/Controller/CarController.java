package com.galvanize.racecar.Controller;

import com.galvanize.racecar.Entity.Car;
import com.galvanize.racecar.Repository.CarRepository;
import com.galvanize.racecar.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {
    @Autowired
    CarRepository carRepository;

    @Autowired
    CarService carService;

    @GetMapping
public List<Car> getCars(){
       return carService.fetchAllCars();
}
}
