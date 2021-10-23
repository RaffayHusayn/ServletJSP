package com.fclass.servletjsp;

public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

   public int getAge(){
        return this.age;
   }

   public String getName(){
        return this.name;
   }

   public String toString(){
        return this.name + " : " + this.age;
   }

}
