package Strumienie;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

}
