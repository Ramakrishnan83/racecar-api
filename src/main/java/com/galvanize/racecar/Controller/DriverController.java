package com.galvanize.racecar.Controller;

import com.galvanize.racecar.Entity.Car;
import com.galvanize.racecar.Entity.Driver;
import com.galvanize.racecar.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/drivers")
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping
    public List<Driver> getDrivers(){
        return driverService.fetchAllDrivers();
    }
}
