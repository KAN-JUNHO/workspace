package me.whiteship;

/**
 * Hello world!
 *
 */
public class Moim {
    int maxNumberOfAttendees;
    int numberOfEnrollment;

    public boolean isErollmentFull(){
        if(maxNumberOfAttendees ==0){
            return false;
        }
        if (numberOfEnrollment < maxNumberOfAttendees){
            return false;
        }
        return true;

    }
}