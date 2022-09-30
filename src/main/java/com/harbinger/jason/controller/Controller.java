package com.harbinger.jason.controller;

import com.harbinger.jason.generetedPayload.Employee;
import com.harbinger.jason.service.JasonToJavaObjectServiceImpl;
import com.harbinger.jason.payload.EmployeePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;


@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
  private JasonToJavaObjectServiceImpl obj;

    @GetMapping("/fetchData/")
    public EmployeePayload getData(Employee employee) throws IOException {
     EmployeePayload employeePayload =  obj.saveData(employee);
        return employeePayload;
    }
}
