package Lection05.homework;

import java.util.Random;
import java.util.UUID;

public class Employee {
    private Random randomValue=new Random();

    private final int uniquePersonalId;
    private String firstName;
    private String lastName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (String valueFirstName, String valueLastName, String valuePosition, String valuePhoneNumber,
                     int valueSalary, int valueAge) {
        uniquePersonalId=randomValue.nextInt(99999);
        lastName=valueLastName;
        firstName=valueFirstName;

        position=valuePosition;
        phoneNumber=valuePhoneNumber;
        salary=valueSalary;
        age=valueAge;
    }

    public int getuniquePersonalId() {
        return uniquePersonalId;
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getPosition () {
        return position;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public int getSalary () {
        return salary;
    }

    public int getAge () {
        return age;
    }

    public void setSalary (int newSalary) {
        salary=newSalary;
    }

    public void setAge (int newAge) {
        age=newAge;
    }

    public void setPosition (String newPosition) {
        position=newPosition;
    }

    public void setPhoneNumber (String newPhoneNumber) {
        phoneNumber=newPhoneNumber;
    }

}