package com.company;

public class Student {

    public String name;
    public double GPA;

    public Student (String n, double g)
    {
        name = n;
        GPA = g;
    }

    public boolean isHonors ()
    {
        if(GPA >= 3.5)
            return true;
        else
            return false;
    }

    public double getGPA()
    {
        return GPA;
    }
}
