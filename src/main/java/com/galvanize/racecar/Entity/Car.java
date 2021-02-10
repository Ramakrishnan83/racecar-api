package com.galvanize.racecar.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter

public class Car {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;
    private String model;
    private long modelyear;
    private long owner;
    private String status;
    private long topspeed;

}
