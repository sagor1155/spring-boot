package com.example.SpringBootLiquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repo;

    @PostMapping(path="person", consumes = {"application/json"})
    public Person createPerson(@RequestBody Person person){
//        System.out.println("person id: " + person.getId());
//        System.out.println("person name: " + person.getName());
//        System.out.println("person height: " + person.getHeight());
        repo.save(person);
        return person;
    }

    @GetMapping(path="person", produces={"application/json"})
    public List<Person> GetPersonAll(){
        return repo.findAll();
    }
}
