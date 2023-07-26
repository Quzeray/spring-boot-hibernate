package com.example.springboothibernate.controller;

import com.example.springboothibernate.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonController {
    PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<String> getPersons(String city) {
        return repository.getPersonsByCity(city).stream()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
