package com.atguigu.java8;

public class FilterEmployeeForSalary implements MyPredicate<Employee> {

    public FilterEmployeeForSalary() {
    }

    @Override
    public boolean test(Employee t, Integer b) {
        return t.getSalary() >= 5000;
    }

}
