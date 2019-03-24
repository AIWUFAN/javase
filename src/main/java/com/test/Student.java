package com.test;

public class Student {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + age + '\'' +
                '}';
    }
}
