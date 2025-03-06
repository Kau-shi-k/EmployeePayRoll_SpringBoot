package com.example.Employee.Dto;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public EmployeeDto(Long id, String name, Long salary) {
        this.name = name;
        this.salary = salary;
        this.id =id;
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

    @NotBlank(message = "Employee Salary")
    private Long salary;

}
