package com.example.timemanagementsystem.service;

import com.example.timemanagementsystem.enums.AccountStatus;
import com.example.timemanagementsystem.enums.AccountType;
import com.example.timemanagementsystem.model.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface EmployeeService {

    Employee createNewEmployee(String firstName, String lastName, LocalDate birthDate, String email, Long phoneNum, String password, String address, String city, String state, String zipCode, Long userId, Date startDate, AccountType accountType, AccountStatus accountStatus);

    List<Employee> listAllEmployees();

    void deleteEmployee(Long userId);
}
