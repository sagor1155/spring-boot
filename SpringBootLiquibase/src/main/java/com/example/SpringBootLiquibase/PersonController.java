package com.example.SpringBootLiquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class PersonController {

    @Autowired
    private PersonRepository repo;

    @PostMapping(path="person", consumes = {"application/json"})
    public Person createPerson(Person person){
        repo.save(person);
        return person;
    }

    @GetMapping(path="person", produces={"application/json"})
    public List<Person> GetPersonAll(){
        return repo.findAll();
    }
}
