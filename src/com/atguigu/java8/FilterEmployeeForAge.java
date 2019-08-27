package com.atguigu.java8;

public class FilterEmployeeForAge implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee t, Integer b) {
        return t.getAge() <= 35;
    }

}
