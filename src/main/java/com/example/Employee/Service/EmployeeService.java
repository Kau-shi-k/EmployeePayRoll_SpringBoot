package com.example.Employee.Service;

import com.example.Employee.Dto.EmployeeDto;
import com.example.Employee.Entity.EmployeeEntity;
import com.example.Employee.Interface.IEmployeeService;
import com.example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto get(Long id) {
        EmployeeEntity emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot Find Employee Id"));
        EmployeeDto empDto = new EmployeeDto(emp.getId(), emp.getName(), emp.getSalary());
        return empDto;

    }

    @Override
    public EmployeeDto create(EmployeeDto emp) {
        EmployeeEntity newEntity = new EmployeeEntity(emp.getId(),emp.getName(), emp.getSalary());
        employeeRepository.save(newEntity);
        EmployeeDto empDto = new EmployeeDto(newEntity.getId(), newEntity.getName(), newEntity.getSalary());
        return empDto;
    }

    @Override
    public EmployeeDto edit(EmployeeDto emp, Long id) {
        EmployeeEntity empFound = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found"));

        empFound.setName(emp.getName());
        empFound.setSalary(emp.getSalary());

        employeeRepository.save(empFound);

        EmployeeDto empDto = new EmployeeDto(empFound.getId(), empFound.getName(), empFound.getSalary());
        return empDto;
    }

    @Override
    public String delete(Long id) {
        EmployeeEntity foundEmp = employeeRepository.findById(id).orElseThrow(()->new RuntimeException("No employee found for given id"));
        employeeRepository.delete(foundEmp);
        return "Employee Deleted";
    }
}
