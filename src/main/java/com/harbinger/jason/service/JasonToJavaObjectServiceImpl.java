package com.harbinger.jason.service;

import com.fasterxml.jackson.databind.ObjectMapper;


import com.harbinger.jason.generetedPayload.Employee;
import com.harbinger.jason.modelMapperConfig.EmployeeToPayload;
import com.harbinger.jason.payload.EmployeePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;

@Service
public class JasonToJavaObjectServiceImpl implements JasonToJavaObjectService {
    @Autowired
    private EmployeeToPayload employeeToPayload;

    @Override
    public EmployeePayload saveData(Employee employee) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File jasonFileEmployee = new File("C:\\SpringBootProgram\\SpringBootJason\\src\\main\\resources\\employee.json");
        Employee employees = objectMapper.readValue(jasonFileEmployee, Employee.class);
        EmployeePayload employeePayload = employeeToPayload.covertEntityToPayload(employees);
        return employeePayload;
    }
}

