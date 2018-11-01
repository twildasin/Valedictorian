package com.company;

public class HighSchoolClass {


    public HighSchoolClass (Student[] arry)
    {
        students = arry;
        clslength = arry.length;
    }

    public Student students [];
    private double clslength;


    public Student getValedictorian()
    {
        int hgh = students.length/2;

        for(int i = 0; i < students.length; i++)
        {
            if(students[i].GPA > students[hgh].GPA)
                hgh = i;
        }
        return students[hgh];
    }

    public double getHonorsPercentage()
    {
        double amt = 0;
        for(Student a: students)
        {
            if(a.isHonors())
            {
                amt++;
            }
        }
        return (amt/clslength);
    }

    /*
    public double getGPA(Student l)
    {
        return l.GPA;
    }

    public boolean isHonors (Student p)
    {
        if(p.GPA >= 4.0)
            return true;
        else
            return false;
    }
    */
}
