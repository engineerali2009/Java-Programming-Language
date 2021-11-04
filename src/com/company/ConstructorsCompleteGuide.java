package com.company;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ConstructorsCompleteGuide {
    private int tax;
    private int salary;
    private int Id;
    private int age;
    private String Employename;

    public ConstructorsCompleteGuide() {
        this.Id = 0;
        this.age = 0;
        this.tax = 0;
        this.salary = 0;
        this.Employename = "No one is Employed yet";
    }

    public ConstructorsCompleteGuide(int tax) {
        System.out.println("This is  constructor with argument taxes= " + tax);
    }

    public ConstructorsCompleteGuide(int tax, int salary) {
        this.tax = tax;
        this.salary = salary;
        System.out.println("This is  constructor with argument taxes= " + tax + ", y= " + salary);
    }

    public ConstructorsCompleteGuide(int Id, int age, int tax, int salary, String Employename) {
        this.Id = Id;
        this.age = age;
        this.salary = salary;
        this.tax = tax;
        this.Employename = Employename;
    }

    public static void main(String[] args) {
        ConstructorsCompleteGuide Employe = new ConstructorsCompleteGuide();
        Employe.Id = 1;
        Employe.Employename = "Ali Mohamed";
        Employe.age = 35;
        Employe.salary = 2000;
        Employe.tax = 10;
        System.out.println(Employe.toString());
    }

    public String toString() {
        return "ConstructorsCompleteGuide{Employe Name= " + this.Employename + ", ID= " + this.Id + ", Age= " + this.age + ", Salary= " + this.salary + ", taxes=" + this.tax + "}";
    }
}

