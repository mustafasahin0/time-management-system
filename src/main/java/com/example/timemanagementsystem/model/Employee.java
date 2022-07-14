package com.example.timemanagementsystem.model;

import com.example.timemanagementsystem.enums.AccountStatus;
import com.example.timemanagementsystem.enums.AccountType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
public class Employee {

    private LocalDate birthDate;
    private String email;
    private Long phoneNum;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
    private Long userId;
    private Date startDate;
    private AccountType accountType;
    private AccountStatus accountStatus;
}
