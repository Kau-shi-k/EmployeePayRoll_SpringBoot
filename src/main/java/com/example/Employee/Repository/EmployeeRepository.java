package com.example.Employee.Repository;


import com.example.Employee.Dto.EmployeeDto;
import com.example.Employee.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
