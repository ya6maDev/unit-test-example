package com.example.unittestexample.domain;

import java.io.Serializable;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
@Getter
@Setter
public class Person implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private int age;

  /**
   * コンストラクタ
   *
   * @param id
   * @param name
   * @param age
   */
  public Person(long id, String name, int age) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
