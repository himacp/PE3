package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
 *
 */

/*This program creates a class called StudentMarks, which prompts user for the number of students,
  reads it from the keyboard, and saves
  it in an int variable called numOfStudents.
  It then prompts user for the grades of each of the students and saves them in an int array called stuGrades.
  Checks that the grade is between 0 and 100 else has to trow an error message.
 */



public class StudentMarks {
    public String checkStudentGrade(int[] number)
    {
        for (int i = 0; i < number.length; i++) {
            try {
                if (number[i] < 0 || number[i] > 100)
                    throw new Exception("Invalid input of grades");
            } catch (Exception e) {
                return e.getMessage();
            }
        }

        return "valid grades";
    }
}
