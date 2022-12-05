package com.company.testclass;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HourlyEmployee extends Employee {
    double hourlyPayRate;
    public double getDoublePay(){
        return this.hourlyPayRate *2;
    }

}
