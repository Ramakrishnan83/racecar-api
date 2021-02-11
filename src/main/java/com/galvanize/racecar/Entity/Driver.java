package com.galvanize.racecar.Entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID")
    private List<Car> cars;
    private long wins;
    private long losses;
}
