package com.example.springboothibernate.repository;


import com.example.springboothibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    private final static String SELECT_PERSON_BY_CITY = "SELECT p FROM Person p WHERE p.cityOfLiving = :city";
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery(SELECT_PERSON_BY_CITY)
                .setParameter("city", city)
                .getResultList();
    }
}
