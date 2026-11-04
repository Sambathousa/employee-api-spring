package co.istad.restfulemployeeapi.dto;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateEmployeeRequest(

        @NotBlank(message = "Name is required")
        @Size(min = 2, max = 100, message = "Names must be between 2 and 100 characters")
        String name,

        @Email(message = "Invalid email format")
        String email,

        @Positive(message = "Salary must be greater than 0")
        @NotNull(message = "Salary is required")
        BigDecimal salary,


        @DateTimeFormat(pattern = "yyyy-MM-dd")
//        @NotBlank(message = "Hire date is required")
        LocalDate hireDate

) {
}