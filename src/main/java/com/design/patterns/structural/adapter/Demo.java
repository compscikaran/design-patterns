package com.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    /**
     * Convert one interface into another
     * Used for working with legacy code
     * Translates requests
     * E.g. Arrays.asList, streams
     * Should not hold to many complex logic
     * Provide a new interface to old code
     * Bridge on the other hand is designed upfront so that the abstraction and implementation can vary
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        List<Employee> myEmployees = new ArrayList<>();

        Employee emp1 = new EmployeeDB("1234", "Karan", "Gupta", "hello@karan.com");
        myEmployees.add(emp1);

        EmployeeLdap ldap1 = new EmployeeLdap("5678", "Gupta", "Manoj", "hello@manoj.com");
        Employee emp2 = new EmployeeAdapterLdap(ldap1);
        myEmployees.add(emp2);

        System.out.println(myEmployees);
    }
}
