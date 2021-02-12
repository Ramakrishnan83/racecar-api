package com.galvanize.racecar.Entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@Setter

public class Driver {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private long age;
    private String nickName;
    @OneToMany
    @JoinColumn(name = "driver_id", referencedColumnName = "ID")
    private List<Car> cars;
    private long wins;
    private long losses;

}
