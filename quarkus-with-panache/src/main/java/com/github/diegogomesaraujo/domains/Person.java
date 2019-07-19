package com.github.diegogomesaraujo.domains;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Year;

@Entity
public class Person {

    @Id
    public String id;

    @NotNull
    public String name;

    @NotNull
    public String email;

    private Year age;

}
