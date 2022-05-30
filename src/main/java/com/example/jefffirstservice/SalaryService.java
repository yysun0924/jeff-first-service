package com.example.jefffirstservice;

import com.example.jefffirstservice.vo.Salary;
import com.example.jefffirstservice.vo.SalaryWithCompanyName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    @Autowired
    private SalaryConfiguration config;

    public String getSalary() {
        return new Salary(10, 100, "test_company").toString();
    }
    public String getSalaryFromConfig() {
        return new Salary(config.getMin(), config.getMax(), config.getCompany()).toString();
    }
}
