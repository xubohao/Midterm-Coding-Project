package com.cisc181.core;

import java.util.UUID;

import org.hibernate.id.SelectGenerator.SelectGeneratorDelegate;

public class Enrollment {

    /**
     * 6.   Create new class ‘Enrollment’.  
     *      Enrollment has the following attributes: 
     *          SectionID(UUID), StudentID (UUID), EnrollmentID(UUID) and Grade (double).  
     *      Enrollment should have its no-arg constructor private.
     *      Enrollment should have a two-arg constructor, 
     *          with StudentID and SectionID as input parameters.  
     *      EnrollmentID should be set in the constructor.
     *      SetGrade(double grade) should be defined as a procedure. 5 points.
     */
    
    private UUID SectionID, StudentID, EnrollmentID;
    
    private double Grade;
    
    private Enrollment() {
        // Enrollment should have its no-arg constructor private.
    }
    
    public Enrollment(UUID StudentID, UUID SectionID) {
        // generate Enrollment ID based on other two IDs.
        this.SectionID = SectionID;
        this.StudentID = StudentID;
        EnrollmentID = UUID.nameUUIDFromBytes(
                (StudentID.toString() + SectionID.toString()).getBytes());
    }
    
    public void setGrade(double Grade) {
        this.Grade = Grade; 
    }

    public double getGrade() {
        return Grade;
    }

    public UUID getSectionID() {
        return SectionID;
    }

    public UUID getStudentID() {
        return StudentID;
    }
}
