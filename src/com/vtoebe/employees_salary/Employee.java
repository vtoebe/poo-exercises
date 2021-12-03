package com.vtoebe.employees_salary;

public class Employee {
    String name;
    float salary;
    float updatedSalary = 0;
    float totalCurrentSalary = 0;
    float totalUpdatedSalary = 0;
    float diffCurrentUpdatedSalary = 0;

    Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    public String saveEmployee(){
        updateSalaryHistory();
        return "Employee: " + this.name +
                " | Current Salary: " + this.salary +
                " | Updated Salary: " + updatedSalary + "\n";
    }

    public void updateSalary(){
        if (this.salary <= 150){
            this.updatedSalary = (float) (this.salary + this.salary * 0.25);
        }
        if(this.salary > 150 && this.salary <= 300){
            this.updatedSalary = (float) (this.salary + this.salary * 0.2);
        }
        if(this.salary > 300 && this.salary <= 600){
            this.updatedSalary = (float) (this.salary + this.salary * 0.15);
        }
        if (salary > 600){
            this.updatedSalary = (float) (this.salary + this.salary * 0.1);
        }
    }

    public String updateSalaryHistory(){
        this.totalCurrentSalary += this.salary;
        this.totalUpdatedSalary += this.updatedSalary;
        this.diffCurrentUpdatedSalary = this.totalUpdatedSalary - this.totalCurrentSalary;
        return "Sum of Current Salary: " + this.totalCurrentSalary +
                " | Sum of Updated Salary: " + this.totalUpdatedSalary +
                " | Diff Between Current/Updated Salary: " + this.diffCurrentUpdatedSalary;
    }


}
