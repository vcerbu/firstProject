package com.endava.service;

import com.endava.utilities.Utilities;

/**
 * Created by vcerbu on 3/20/2017.
 */
public class PersonService {

    public String validateName() {
        boolean flag = false;
        do {
            System.out.println("Enter your name: ");
            String name = Utilities.readString();
            if (name.matches("[a-zA-Z]+[a-zA-Z]*([-]?[a-zA-Z]+)")) {
                flag = true;
                return name;
            }
        }
        while (flag = true);
        return "";
    }

    public String validateHobby() {
        boolean flag = false;
        do {
            System.out.println("Enter your hobby: ");
            String hobby = Utilities.readString();
            if (hobby.matches("[a-zA-Z][a-zA-Z]([a-zA-Z])*")) {
                flag = true;
                return hobby;
            }
        }
        while (flag = true);
        return "";
    }

    public int validateAge() {
        boolean flag = false;
        do {
            System.out.println("Enter your age: ");
            int age = Utilities.convertStringToInt();
            if ((age > 0) && (age < 200)) {
                flag = true;
                return age;
            }
        }
        while (flag = true);
        return 0;
    }

    public float validateSalary() {
        boolean flag = false;
        do {
            System.out.println("Enter your salary: ");
            float salary = Utilities.convertStringToFloat();
            if (salary > 0) {
                flag = true;
                return salary;
            }
        }
        while (flag = true);
        return 0;
    }


}
