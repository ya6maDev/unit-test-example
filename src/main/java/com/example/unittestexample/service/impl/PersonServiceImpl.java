package com.example.unittestexample.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.unittestexample.domain.Person;
import com.example.unittestexample.repository.PersonRepository;
import com.example.unittestexample.service.PersonService;

public class PersonServiceImpl implements PersonService {

  @Autowired
  private PersonRepository personRepository;

  @Override
  public List<Person> findAll() {
    return personRepository.selectAll();
  }

  @Override
  public int getNextYearAge(long id) {
    Person person = personRepository.selectById(id);
    int nextYearAge = person.getAge() + 1;
    return nextYearAge;
  }
}
