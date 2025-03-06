package com.example.Employee.Collector;


import com.example.Employee.Dto.EmployeeDto;
import com.example.Employee.Interface.IEmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayRollApp {
    @Autowired
    IEmployeeService employeeService;

    @GetMapping("/get/{id}")
    public EmployeeDto get(@PathVariable Long id){
        return employeeService.get(id);
    }

    @PostMapping("/post")
    public EmployeeDto create(@RequestBody EmployeeDto emp){
        return employeeService.create(emp);
    }

    @PutMapping("/put/{id}")
    public EmployeeDto edit(@RequestBody EmployeeDto emp, @PathVariable Long id){
        return employeeService.edit(emp, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return employeeService.delete(id);
    }

}
