package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
    /**
     * 1.   Create new class named ‘Course’ (note the package name: com.cisc181.core)  
     *      Course has the following attributes: CourseID (UUID), CourseName (String).  
     *      GradePoints(int)   5 points.
     * 5.   Add Major to Course as an attribute.
     */

    private UUID CourseID;
    
    private String CourseName;
    
    private int GradePoints;
    
    private eMajor Major;

    public Course(String courseName, int gradePoints, eMajor major) {
        super();
        setCourseID(UUID.randomUUID());
        CourseName = courseName;
        GradePoints = gradePoints;
        Major = major;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getGradePoints() {
        return GradePoints;
    }

    public void setGradePoints(int gradePoints) {
        GradePoints = gradePoints;
    }

    public eMajor getMajor() {
        return Major;
    }

    public void setMajor(eMajor major) {
        Major = major;
    }

    public UUID getCourseID() {
        return CourseID;
    }

    public void setCourseID(UUID courseID) {
        CourseID = courseID;
    }
    
}
