package com.example.student;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private double amount;

    public Salary(  ) {
        this.amount = 30303.00;
    }

    public double getAmount() {
        return amount;
    }


}
