package Lection05.homework;
import java.util.Random;

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

        this.uniquePersonalId=setUniquePersonalId();

        this.lastName=valueLastName;
        this.firstName=valueFirstName;

        this.position=valuePosition;
        this.phoneNumber=valuePhoneNumber;
        this.salary=valueSalary;
        this.age=valueAge;

    }

    public int getUniquePersonalId() {
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
    public void printEmployee (char delimiter) {
        System.out.println ("" + uniquePersonalId + delimiter
                + firstName+ " " + lastName + delimiter
                + position+ delimiter + phoneNumber + delimiter
                + salary + delimiter + age);

    }

    private int setUniquePersonalId () {
 //       return randomValue.nextInt(99999);
        return Math.abs(this.hashCode());
    }

}