package com.cisc181.core;

public class PersonException extends Exception {
    
    /**
     * 7.   Create new custom exception for ‘Person’.  Name the class ‘PersonException’.  
     *       The new exception should extend ‘Exception’, and add ‘Person’ an attribute.  
     *       Use ‘this’ to pass the current state of the instance to the exception.
     *       The exception should be thrown if the DOB given is more than 100 years older 
     *          than the current date.  
     *       The exception should be thrown if the phone number isn’t formatted 
     *          (###)-###-####.  Easiest way to do this is to use regular expressions (regex).  
     */
    
    Person person;

    public PersonException() {
        // TODO Auto-generated constructor stub
    }

    public PersonException(String arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public PersonException(Throwable arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public PersonException(String arg0, Throwable arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public PersonException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
        // TODO Auto-generated constructor stub
    }

}
