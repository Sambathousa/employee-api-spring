package co.istad.restfulemployeeapi.mapper;

import co.istad.restfulemployeeapi.domain.Employee;
import co.istad.restfulemployeeapi.dto.CreateEmployeeRequest;
import co.istad.restfulemployeeapi.dto.EmployeeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    // Map from Domain to DTO
    EmployeeResponse toResponse(Employee employee);

    // Map from DTO to Domain
    Employee fromCreateEmployeeRequest(CreateEmployeeRequest createEmployeeRequest);

}
