package com.cisc181.core;

import java.util.UUID;

public class Section {
    
    /**
     * 3.   Create new class ‘Section’.  
     *      Section has the following attributes: CourseID (UUID), SemesterID (UUID),
     *      SectionID (UUID), RoomID (int).  5 points.  
     */
    
    private UUID CourseID, SemesterID, SectionID;
    
    private int RoomID;

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int roomID) {
        RoomID = roomID;
    }
    
    public Section(Course c, Semester s, int room) {
        CourseID = c.getCourseID();
        SemesterID = s.getSemesterID();
        // generate Section ID based on other two IDs.
        setSectionID(UUID.nameUUIDFromBytes(
                (CourseID.toString() + SemesterID.toString()).getBytes()));
        RoomID = room;
    }

    public UUID getSectionID() {
        return SectionID;
    }

    public void setSectionID(UUID sectionID) {
        SectionID = sectionID;
    }

}
