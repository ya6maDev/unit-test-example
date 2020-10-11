package com.example.unittestexample.repository;

import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import com.example.unittestexample.domain.Person;

@ConfigAutowireable
@Dao
public interface PersonRepository {

  @Select
  List<Person> selectAll();

  @Select
  Person selectById(long id);

}
