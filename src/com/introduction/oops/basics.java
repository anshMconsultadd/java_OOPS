package com.introduction.oops;

class Student{
     int roll;
     String name;
     int age;

     Student(){
         this(12,"divy",32);
     }
     Student(int roll,String name,int age){
         System.out.println("parametrised constructor called");
         this.roll=roll;
         this.name=name;
         this.age=age;
     }

};

public class basics {
    public static void main(String[] args) {
        Student divy=new Student();
        System.out.println(divy.age);
        Student ayush=new Student(3,"ayush jain",21);
        System.out.println();
    }
}
