package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Joe", 3.2),
                new Student("Rob", 4.0),
                new Student("John", 2.1),
                new Student("Isaac" ,3.5),
                new Student("Bob",1.9),
                new Student("Mary", 4.1),
                new Student("Katie", 2.4),
                new Student("Christina", 2.9),
                new Student("Chris", 2.8),
                new Student("Brenden", 4.0),
                new Student("Sharron", 2.6) };

        HighSchoolClass hsc = new HighSchoolClass(students);

        System.out.println(hsc.getValedictorian().getGPA());
        System.out.println(hsc.getHonorsPercentage());
        System.out.println(hsc.getValedictorian().name);



    }
}
