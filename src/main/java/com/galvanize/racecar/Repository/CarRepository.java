package com.galvanize.racecar.Repository;
import com.galvanize.racecar.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}

