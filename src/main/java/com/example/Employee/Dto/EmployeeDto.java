package com.example.Employee.Dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class EmployeeDto {

    private Long id;

    public EmployeeDto(String name, Long salary) {
        this.name = name;
        this.salary = salary;
        this.id =null;
    }

    public EmployeeDto(Long id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeDto() {
    }

    @NotBlank(message =  "Employee Name")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @NotNull
    private Long salary;

}
