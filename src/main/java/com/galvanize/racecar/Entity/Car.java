package com.galvanize.racecar.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

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
    private long driver_id;
    private String status;
    private long topspeed;

}
