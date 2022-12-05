package com.company.testclass;

public class Main {
    public static void main(String[] args){
        SalariedEmployee pierre = new SalariedEmployee();
        pierre.setAge(66);
        System.out.println(pierre.isRetired());

    }
}
