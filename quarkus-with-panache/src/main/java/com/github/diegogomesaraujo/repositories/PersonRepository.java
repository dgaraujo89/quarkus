package com.github.diegogomesaraujo.repositories;

import com.github.diegogomesaraujo.domains.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {

}
