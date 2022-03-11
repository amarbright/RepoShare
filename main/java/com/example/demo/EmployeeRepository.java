
  package com.example.demo;
  
  import java.util.List; import java.util.Optional;
  
  import org.springframework.data.repository.CrudRepository;
  
  public interface EmployeeRepository extends CrudRepository<Employee,Long> {
  List<Employee> findAll();
  
  Optional<Employee> findByName(String name);
  
  }
 