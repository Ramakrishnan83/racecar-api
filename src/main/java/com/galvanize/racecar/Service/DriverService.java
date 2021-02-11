package com.galvanize.racecar.Service;

import com.galvanize.racecar.Entity.Car;
import com.galvanize.racecar.Entity.Driver;
import com.galvanize.racecar.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverService {
@Autowired
DriverRepository driverRepository;

    public List<Driver> fetchAllDrivers() {
        return driverRepository.findAll();

    }

}
