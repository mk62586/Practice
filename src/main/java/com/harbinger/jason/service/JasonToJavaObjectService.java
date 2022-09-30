package com.harbinger.jason.service;

import com.harbinger.jason.generetedPayload.Employee;
import com.harbinger.jason.payload.EmployeePayload;

import java.io.IOException;

public interface JasonToJavaObjectService {
    EmployeePayload saveData(Employee employee) throws IOException;
}
