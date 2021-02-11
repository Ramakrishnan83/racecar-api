package com.galvanize.racecar.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.racecar.Entity.Car;
import com.galvanize.racecar.Repository.CarRepository;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
@Transactional
@ActiveProfiles("test")
public class CarControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    CarRepository carRepository;

    @Test
    public void getCars() throws Exception {
        mockMvc.perform(get("/api/v1/cars"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()").exists())
                .andExpect(jsonPath("$.[0].id").exists())
                .andExpect(jsonPath("$.[0].model").value("Corvette"));


    }

    @Test
    public void createCar_returnsCarOnSuccessfulRequest() throws Exception {
        Car car = Car.builder()
                .id(123)
                .model("Ferrari")
                .nickname("Blue Fire")
                .modelyear(2017)
                .owner(13)
                .topspeed(223)
                .status("AVAILABLE")
                .build();

        String inputCar = mapper.writeValueAsString(car);

        mockMvc.perform(post("/api/v1/cars")
                .content(inputCar).characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(123));
    }
}
