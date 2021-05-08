package Lection05.homework;

public class Homework5 {

    public static void main(String[] args) {

        // 1.	Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        Person mainPerson = new Person("Александр", "Валерьевич",
                "Гладков", "8(495)000-11-22",
                "Test Manager", 80000, 1986);

        // 4.	Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Please welcome our " + mainPerson.getPosition() + ", " +
                mainPerson.getName() + " " + mainPerson.getSecondName() + " " + mainPerson.getSurname() + ".");

        // 5.	Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//Person[] persons = new Person[5];
        //persons[0] = new Person(...)
        Person[] persons = {
                mainPerson,
                new Person("Андрей", "Андреевич",
                        "Андреев", "8(495)111-22-33",
                        "project owner", 520000, 1973),
                new Person("Евгений", "Евгеньевич",
                        "Евгеньев", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new Person("Наталья", "Натальевна",
                        "Натальева", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new Person("Тетенька", "Тетеньковна",
                        "Тетенькова", "8(495)444-55-66",
                        "engineer", 50000, 1983)
        };

        System.out.println("**********************************************");

        for (int i = 0; i < persons.length; i++)
            if (persons[i].getAge() > 40) {
                System.out.println(persons[i].getFullInfo());
            }

        System.out.println("**********************************************");

        for (int i = 0; i < persons.length; i++)
            System.out.println(persons[i].getFullInfo());

        increaseSalary(persons, 35, 10000);

        System.out.println("**********************************************");
        for (int i = 0; i < persons.length; i++)
            if (persons[i].isSalaryChanged)
                System.out.println(persons[i].getFullInfo());

    }

    // 6.	* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 5000.
    private static void increaseSalary(Person[] emp, int age, float increment) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].setSalary(increment);
                emp[i].isSalaryChanged = true;
            }
        }
    }
}

/**
 * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 * 2 Конструктор класса должен заполнять эти поля при создании объекта;
 * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
 * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
 * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */
