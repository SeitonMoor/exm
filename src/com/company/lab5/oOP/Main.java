package com.company.lab5.oOP;

public class Main {

    public static void main(String[] args) {
        Student[] studentList = new Student[5];

        Student student1 = new Student(1,"Ivan",1989,"89097852546","ivan@gmail.com");
        Student student2 = new Student(2,"Petr",1995,"89018582241","petr@gmail.com");
        Student student3 = new Student(3,"Toni",2001,"89029654821","toni@gmail.com");
        Student student4 = new Student(4,"Rita",1998,"89993647648","rita@yandex.com");
        Student student5 = new Student(5,"Mark",1971,"89102874695","mark@gmail.com");

        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        studentList[3] = student4;
        studentList[4] = student5;

        for (int i = 0; i < 5; i++) {
            System.out.print(studentList[i].getId() + "\t");
            System.out.print(studentList[i].getName() + "\t");
            System.out.print(studentList[i].getBirthYear() + "\t");
            System.out.print(studentList[i].getPhoneNumber() + "\t");
            System.out.print(studentList[i].getMail() + "\t");
            System.out.println();
        }
    }
}
