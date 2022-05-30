package com.example.jefffirstservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

    Environment environment = new StandardEnvironment();

    @Autowired
    private SalaryService myService;

    @GetMapping("/getSalary1")
    public String getSalary1() {
        return myService.getSalary();
    }

    @GetMapping("/getSalary2")
    public String getSalary2() {
        return myService.getSalaryFromConfig();
    }
}
