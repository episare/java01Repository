package Lection05.homework;
import java.util.UUID;

public class Office {
    public static int numberOfEmployees;

    public static void main (String[] args) {
        numberOfEmployees=5;
        Employee[] employees = new Employee[numberOfEmployees];
        employees[0] = new Employee("Peter", "White", "Project manager", "010-01", 150000, 42);
        employees[1] = new Employee("John", "Smith", "Major developer", "010-02", 120000, 35);
        employees[2] = new Employee("Max", "Stone", "Junior Developer", "010-031", 75000, 25);
        employees[3] = new Employee("Sandra", "Kelly", "Junior Developer", "010-032", 75000, 20);
        employees[4] = new Employee("David", "Miller", "Quality Assurance", "010-04", 110000, 48);

        System.out.println ("List of all employees");
        printAllEmployees(employees, '/');
        System.out.println();

        System.out.println ("List of Name / Age");
        for (int i=0; i<employees.length; i++) {
            System.out.println ("Name: " + employees[i].getFirstName() + " " + employees[i].getLastName()
                + ", Age: " + employees[i].getAge());
        }
        System.out.println();

        System.out.println ("List of employees over 40");
        for (int i=0; i<employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printEmployee('/');
            }
        }
        System.out.println();

        increaseSalaryOverMinAge(employees, 10000, 35);
        System.out.println ("List of all employees with current salary");
        printAllEmployees(employees, '/');

    }

    public static void printAllEmployees (Employee[] listEmployees, char delimiter) {
        for (int i=0; i<listEmployees.length; i++) {
            listEmployees[i].printEmployee(delimiter);
        }
    }

    public static void increaseSalaryOverMinAge (Employee[] listEmployees, int increaseValue, int minAge) {
        for (int i=0; i<listEmployees.length; i++) {
            if (listEmployees[i].getAge() > minAge) {
                listEmployees[i].setSalary(listEmployees[i].getSalary()+increaseValue);
            }
        }

    }

}
