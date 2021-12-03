package com.vtoebe.employees_salary;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<String> listOfEmployees = new ArrayList<>();
        List<String> listOfSalaryData = new ArrayList<>();
        String employeeName;
        float employeeSalary;

        Scanner scan = new Scanner(System.in);
        System.out.println("### Type END as an Employee name when you're done entering Employee data ###");

        while(true){
            System.out.print("\nType the employee name: ");
            employeeName = scan.next();

            if(!employeeName.equals("END")){
                System.out.print("Type the employee current salary: ");
                employeeSalary = scan.nextFloat();

                Employee employee = new Employee(employeeName, employeeSalary);
                employee.updateSalary();

                listOfEmployees.add(employee.saveEmployee());
                listOfSalaryData.clear();
                listOfSalaryData.add(employee.updateSalaryHistory());

            } else {
                System.out.print(listOfEmployees.toString()
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", ""));


                System.out.print(listOfSalaryData.toString()
                        .replace("[", "")
                        .replace("]", ""));
                break;


            }


        }
    }
}
