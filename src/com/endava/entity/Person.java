package com.endava.entity;

import com.endava.service.PersonService;
import com.endava.utilities.Utilities;

/**
 * Created by vcerbu on 3/15/2017.
 */
public class Person {
    private int age;
    private String name, hobby;
    private float salary;

    public Person() {
    }

    public Person(int age, String name, String hobby, float salary) {
        this.age = age;
        this.name = name;
        this.hobby = hobby;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void inputPersonInformation() {
        PersonService personService = new PersonService();
        this.setName(personService.validateName());
        this.setHobby(personService.validateHobby());
        this.setSalary(personService.validateSalary());
        this.setAge(personService.validateAge());
    }

    public String printPersonalInformation() {
        return
                "Name: " + name + ", hobby: " + hobby + ", salary: " +
                        salary + ", age: " + age;
    }
}
