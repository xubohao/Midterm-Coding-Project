package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Student_Test {

    static ArrayList<Course> courses;
    static ArrayList<Semester> semesters;
    static ArrayList<Section> sections;
    static ArrayList<Student> students;

    @BeforeClass
    public static void setup() throws PersonException {
        // Add three Course records, add them to an ArrayList of Course
        courses = new ArrayList<Course>();
        Course Calculus = new Course("Calculus 302", 6, eMajor.BUSINESS);
        Course Physics = new Course("Physics 103", 4, eMajor.PHYSICS);
        Course Chemistry = new Course("Chemistry 201", 3, eMajor.CHEM);
        courses.add(Calculus);
        courses.add(Physics);
        courses.add(Chemistry);
        
        // Add two Semesters, one for Fall, one for Spring.  
        // Add them to an ArrayList of Semester
        semesters = new ArrayList<Semester>();
        Semester fall = new Semester();
        fall.setStartData(new Date(118, Calendar.JULY, 14));
        fall.setEndDate(new Date(118, Calendar.NOVEMBER, 14));
        Semester spring = new Semester();
        fall.setStartData(new Date(119, Calendar.JANUARY, 14));
        fall.setEndDate(new Date(119, Calendar.MAY, 14));
        semesters.add(fall);
        semesters.add(spring);
        
        // Add two Sections for each Course & Semester (total of six Sections).  
        // Add them to an ArrayList of Section
        sections = new ArrayList<Section>();
        Section s18f_Cal302 = new Section(Calculus, fall, 101);
        Section s18f_Phy103 = new Section(Physics, fall, 405);
        Section s18f_Che201 = new Section(Calculus, fall, 209);
        Section s18s_Cal302 = new Section(Calculus, spring, 505);
        Section s18s_Phy103 = new Section(Physics, spring, 312);
        Section s18s_Che201 = new Section(Calculus, spring, 201);
        sections.add(s18f_Cal302);
        sections.add(s18f_Phy103);
        sections.add(s18f_Che201);
        sections.add(s18s_Cal302);
        sections.add(s18s_Phy103);
        sections.add(s18s_Che201);
        
        // Create ten Student records, add them to an ArrayList of Student.
        students = new ArrayList<Student>();
        Student s0 = new Student("Zero", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s1 = new Student("One", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s2 = new Student("Two", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s3 = new Student("Three", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s4 = new Student("Four", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s5 = new Student("Five", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s6 = new Student("Six", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s7 = new Student("Seven", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s8 = new Student("Eight", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        Student s9 = new Student("Nine", "Meed", "Larst",  new Date(95, 1, 1),
                eMajor.BUSINESS, "Adress", "111-111-1111", "email@e.com");
        students.add(s0);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
    }
    
    private double calculateGPA(double grade) {
        if (grade >= 90)
            return 4.0;
        if (grade >= 80)
            return 3.0;
        if (grade >= 70)
            return 2.0;
        if (grade >= 60)
            return 1.0;
        return 0.0;
    }

    @Test
    public void test() {
        // Enroll the ten students you created in each of the Sections you created.  
        // Grade each student (pick your own grade values).
        double[] grades = {
            95.0, 95.0, 95.0, 95.0, 95.0, 95.0, 
            95.0, 95.0, 95.0, 95.0, 95.0, 85.0, 
            95.0, 95.0, 95.0, 95.0, 85.0, 85.0, 
            95.0, 95.0, 95.0, 85.0, 85.0, 85.0, 
            95.0, 95.0, 85.0, 85.0, 85.0, 85.0, 
            95.0, 85.0, 85.0, 85.0, 85.0, 85.0, 
            85.0, 85.0, 85.0, 85.0, 85.0, 85.0, 
            75.0, 85.0, 85.0, 85.0, 85.0, 85.0, 
            75.0, 75.0, 85.0, 85.0, 85.0, 85.0, 
            75.0, 75.0, 75.0, 85.0, 85.0, 85.0
        };
        
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
        int index = 0;
        for (Student student : students) {
            for (Section section : sections) {
                Enrollment enrollment = new Enrollment(student.getStudentID(), section.getSectionID());
                enrollment.setGrade(grades[index++]);
                enrollments.add(enrollment);
            }
        }
        
        // Checking
        ArrayList<Double> GPAs = new ArrayList<Double>();
        ArrayList<Double> CourseAverages = new ArrayList<Double>();
        
        // Calculating GPAs.
        for (Student student : students) {
            UUID stuID = student.getStudentID();
            double GPA = 0;
            for (Enrollment enrollment : enrollments) {
                if (enrollment.getStudentID() == stuID) {
                    GPA += calculateGPA(enrollment.getGrade()) / 6;
                }
            }
            GPAs.add(GPA);
        }

        // Calculating Course Average grades.
        for (Section section : sections) {
            UUID secID = section.getSectionID();
            double ave = 0;
            for (Enrollment enrollment : enrollments) {
                if (enrollment.getSectionID() == secID) {
                    ave += enrollment.getGrade() / 10;
                }
            }
            CourseAverages.add(ave);
        }

        // GPA check
        assertEquals(GPAs.get(0), 4, 0.00001);
        assertEquals(GPAs.get(1), 3.833333333, 0.00001);
        assertEquals(GPAs.get(2), 3.666666667, 0.00001);
        assertEquals(GPAs.get(3), 3.5, 0.00001);
        assertEquals(GPAs.get(4), 3.333333333, 0.00001);
        assertEquals(GPAs.get(5), 3.166666667, 0.00001);
        assertEquals(GPAs.get(6), 3, 0.00001);
        assertEquals(GPAs.get(7), 2.833333333, 0.00001);
        assertEquals(GPAs.get(8), 2.666666667, 0.00001);
        assertEquals(GPAs.get(9), 2.5, 0.00001);
        
        // Course Average grade check
        assertEquals(CourseAverages.get(0), 88, 0.00001);
        assertEquals(CourseAverages.get(1), 88, 0.00001);
        assertEquals(CourseAverages.get(2), 88, 0.00001);
        assertEquals(CourseAverages.get(3), 88, 0.00001);
        assertEquals(CourseAverages.get(4), 87, 0.00001);
        assertEquals(CourseAverages.get(5), 86, 0.00001);
    }
}