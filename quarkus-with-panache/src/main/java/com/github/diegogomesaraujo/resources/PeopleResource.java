package com.github.diegogomesaraujo.resources;

import com.github.diegogomesaraujo.domains.Person;
import com.github.diegogomesaraujo.repositories.PersonRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.UUID;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleResource {

    @Inject
    private PersonRepository personRepository;

    @GET
    public List<Person> list() {
        return personRepository.findAll().list();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response save(@Valid Person person) {
        person.id = UUID.randomUUID().toString();
        personRepository.persist(person);

        return Response.ok(person).build();
    }

}
