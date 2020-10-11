package com.example.unittestexample.service;

import java.util.List;
import com.example.unittestexample.domain.Person;

public interface PersonService {

  public abstract List<Person> findAll();

  public abstract int getNextYearAge(long id);
}
