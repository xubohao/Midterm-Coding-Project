package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	/**
	 * 1.  Staff_Test.
	 *     Create an ArrayList of Staff class.  
	 *     Add five sample Staff instances to the ArrayList with different salaries.  
	 *     Compute an average of the salaries and prove it with an assertEquals method.
	 */

	@Test
	public void test() throws PersonException {
	    
	    ArrayList<Staff> staffs = new ArrayList<Staff>();
        Staff sa = new Staff("Amy", "A", "Auro", new Date(95, 1, 1), 
                "1 Street A", "111-111-1111", "amy@a.com", "1:00 - 5:00", 1, 3000, 
                new Date(111, 1, 1), eTitle.MR);
        Staff sb = new Staff("Bob", "B", "Benn", new Date(96, 1, 1), 
                "1 Street A", "111-111-2222", "bob@a.com", "1:00 - 5:00", 2, 3500, 
                new Date(112, 1, 1), eTitle.MRS);
        Staff sc = new Staff("Cor", "C", "Cann", new Date(97, 1, 1), 
                "1 Street A", "111-111-3333", "cor@a.com", "1:00 - 5:00", 3, 4000, 
                new Date(113, 1, 1), eTitle.MR);
        Staff sd = new Staff("Den", "D", "Dora", new Date(98, 1, 1), 
                "1 Street A", "111-111-4444", "den@a.com", "1:00 - 5:00", 4, 4500, 
                new Date(114, 1, 1), eTitle.MRS);
        Staff se = new Staff("Err", "R", "Endy", new Date(99, 1, 1), 
                "1 Street A", "111-111-5555", "err@a.com", "1:00 - 5:00", 5, 5000, 
                new Date(115, 1, 1), eTitle.MS);
        staffs.add(sa);
        staffs.add(sb);
        staffs.add(sc);
        staffs.add(sd);
        staffs.add(se);
        
        double average = 0;
        for (Staff staff : staffs) {
            average += staff.getSalary();
        }
        average /= staffs.size();
        
        // expected average salary is 4000.
        assertEquals(average, 4000, 0.00001);
	}	

    @Test(expected = PersonException.class) 
    public void testInvalidPhoneNumber() throws PersonException {
         Staff s = new Staff("Amy", "A", "Auro", new Date(95, 1, 1), 
                                //! invalid !
                 "1 Street A", "111-111-111", "amy@a.com", "1:00 - 5:00", 1, 3000, 
                 new Date(111, 1, 1), eTitle.MR);
    }

    @Test(expected = PersonException.class) 
    public void testInvalidDOB() throws PersonException {
                                                    //! invalid !
         Staff s = new Staff("Amy", "A", "Auro", new Date(256, 1, 1), 
                 "1 Street A", "111-111-1111", "amy@a.com", "1:00 - 5:00", 1, 3000, 
                 new Date(111, 1, 1), eTitle.MR);
    }
}
