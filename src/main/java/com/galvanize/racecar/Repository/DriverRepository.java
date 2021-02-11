package com.galvanize.racecar.Repository;

import com.galvanize.racecar.Entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {
}
