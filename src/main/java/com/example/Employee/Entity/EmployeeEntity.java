package com.example.Employee.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public EmployeeEntity(){

    }
    public EmployeeEntity(Long id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @NotBlank(message =  "Employee Name")
    private String name;

    @NotBlank(message = "Employee Salary")
    private Long salary;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
