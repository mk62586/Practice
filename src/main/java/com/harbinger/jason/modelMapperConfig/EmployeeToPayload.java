package com.harbinger.jason.modelMapperConfig;

import com.harbinger.jason.generetedPayload.Employee;
import com.harbinger.jason.payload.EmployeePayload;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeToPayload {

    public EmployeePayload covertEntityToPayload(Employee employee){
        ModelMapper modelMapper = new ModelMapper();
        EmployeePayload employeeDto  =modelMapper.map(employee, EmployeePayload.class);
        return employeeDto;
    }
    public Employee covertPayloadToEntity(EmployeePayload employeePayload){
        ModelMapper modelMapper = new ModelMapper();
        Employee employee  =modelMapper.map(employeePayload,Employee.class);
        return employee;
    }
}
