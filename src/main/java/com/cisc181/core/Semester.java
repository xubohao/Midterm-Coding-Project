package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
    
    /**
     * 2.   Create new class named ‘Semester’.  
     *      Semester has the following attributes: SemesterID (UUID), StartDate (date),
     *      EndDate (date).  5 points.
     */
    
    private UUID SemesterID;
    
    public Semester() {
        SemesterID = UUID.randomUUID();
    }
    
    private Date StartData, EndDate;

    public Date getStartData() {
        return StartData;
    }

    public void setStartData(Date startData) {
        StartData = startData;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public UUID getSemesterID() {
        return SemesterID;
    }

    public void setSemesterID(UUID semesterID) {
        SemesterID = semesterID;
    }
    
}
