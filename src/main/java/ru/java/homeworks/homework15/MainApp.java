package ru.java.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> arrayList = getArrayList(3, 10);
        System.out.println(arrayList);

        System.out.println(sumMoreFive(arrayList));

        changeList(3, arrayList);
        System.out.println(arrayList);

        arrayList = getArrayList(3, 15);
        increaseByOne(2, arrayList);
        System.out.println(arrayList);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Василий", 25));
        employees.add(new Employee("Иван", 41));
        employees.add(new Employee("Владимир", 36));
        employees.add(new Employee("Петр", 33));

        System.out.println(getEmployeeName(employees));
        System.out.println(getFilteredEmployeesByAge(employees, 33));
        checkAverageAge(employees, 35);
        System.out.println("Самый молодой сотрудник: "+getYoungEmployee(employees));

    }

    public static List<Integer> getArrayList(int min, int max) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrList.add(i);
        }
        return arrList;
    }

    public static int sumMoreFive(List<Integer> arrList) {
        int sum = 0;
        for (int element : arrList) {
            if (element > 5) {
                sum += element;
            }
        }
        return sum;
    }

    public static void changeList(int a, List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, a);
        }
    }

    public static void increaseByOne(int a, List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + a);
        }
    }

    public static List<String> getEmployeeName(List<Employee> employeesList) {
        List<String> employeesName = new ArrayList<>();
        for (Employee employee : employeesList) {
            employeesName.add(employee.getName());
        }
        return employeesName;
    }

    public static List<Employee> getFilteredEmployeesByAge(List<Employee> employees, int age) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public static void checkAverageAge(List<Employee> employees, int averageAge) {
        int sumAge = 0;
        for (Employee employee : employees) {
            sumAge += employee.getAge();
        }
        if ((sumAge / employees.size()) < averageAge) {
            System.out.println("Средний возраст не превышает: " + averageAge);
            return;
        }
        System.out.println("Средний возраст превышает или равен: " + averageAge);
    }

    public static Employee getYoungEmployee(List<Employee> employees){
        Employee young = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            if(young.getAge() > employees.get(i).getAge()){
                young = employees.get(i);
            }
        }
        return young;
    }
}
