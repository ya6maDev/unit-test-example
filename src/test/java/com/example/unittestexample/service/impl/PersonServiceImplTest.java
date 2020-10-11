package com.example.unittestexample.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.unittestexample.domain.Person;
import com.example.unittestexample.repository.PersonRepository;

@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {

  @Mock
  private PersonRepository personRepositoryMock;

  @InjectMocks
  private PersonServiceImpl personServiceImpl;

  @Test
  void test_getNextYearAge() {
    // Mock
    when(personRepositoryMock.selectById(anyLong())).thenReturn(new Person(1L, "Taro", 9));

    // 実績値
    int actual = personServiceImpl.getNextYearAge(1);

    // 検証
    assertEquals(10, actual);

  }
}
