package com.company.testclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired() {if (this.age >= 65){return true;} return false; }




}
