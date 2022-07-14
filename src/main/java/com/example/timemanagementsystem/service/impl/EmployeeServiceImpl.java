package com.example.timemanagementsystem.service.impl;

import com.example.timemanagementsystem.enums.AccountStatus;
import com.example.timemanagementsystem.enums.AccountType;
import com.example.timemanagementsystem.model.Employee;
import com.example.timemanagementsystem.service.EmployeeService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee createNewEmployee(String firstName, String lastName, LocalDate birthDate, String email, Long phoneNum, String password, String address, String city, String state, String zipCode, Long userId, Date startDate, AccountType accountType, AccountStatus accountStatus) {
        return null;
    }

    @Override
    public List<Employee> listAllEmployees() {
        return null;
    }

    @Override
    public void deleteEmployee(Long userId) {

    }
}
