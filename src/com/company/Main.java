package com.company;

public class Main {

    public static void main(String[] args) {


        Student group[] = new Student[6];
        group[0] = new Student("Joe", 4.79);
        group[1] = new Student("Bob", 3.9);
        group[2] = new Student("Robert", 3.8);
        group[3] = new Student("Corey", 3.5);
        group[4] = new Student("Isaac", 4.2);
        group[5] = new Student("Marina", 4.0);

        HighSchoolClass year1 = new HighSchoolClass(group);

        System.out.println(year1.getGPA(group[0]));
        System.out.println(year1.isHonors(group[0]));
        System.out.println(year1.getHonorsPercentage());
        System.out.println((year1.getValedictorian()).name);
    }
}
