package com.example.Employee.Interface;

import com.example.Employee.Dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {
    public EmployeeDto get(Long id);

    public EmployeeDto create(EmployeeDto emp);

    public EmployeeDto edit(EmployeeDto emp, Long id);

    public String delete(Long id);
}
