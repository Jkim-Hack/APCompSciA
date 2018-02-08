/*
The class SeatingChart, shown below, uses a two-dimensional array to represent the seating arrangement
of students in a classroom. The seats in the classroom are in a rectangular arrangement of rows and columns.
*/

package Quarter2Labs;

import java.util.ArrayList;

public class SeatingChart
{
   /** seats[r][c] represents the Student in row r and column c in the classroom. */
   private Student[][] seats;

   /** Creates a seating chart with the given number of rows and columns from the students in
    * studentList. Empty seats in the seating chart are represented by null.
    * @param rows the number of rows of seats in the classroom
    * @param cols the number of columns of seats in the classroom
    * Precondition: rows > 0; cols > 0;
    * rows * cols >= studentList.size()
    * Postcondition:
    * - Students appear in the seating chart in the same order as they appear
    *   in studentList, starting at seats[0][0].
    * - seats is filled column by column from studentList, followed by any
    *   empty seats (represented by null).
    * - studentList is unchanged.
   */
   public SeatingChart(ArrayList<Student> studentList, int rows, int cols)
   { 
      //Insert code here to create the constructor.
	   seats = new Student[rows][cols];
	   for(int i = 0; i < seats.length; i++) {
		   for(int j = 0; j < seats[0].length; j++) {
			   seats[i][j] = studentList.get(j+i);
		   }
	   }

   }
 
   /** Removes students who have more than a given number of absences from the
    * seating chart, replacing those entries in the seating chart with null
    * and returns the number of students removed.
    * @param allowedAbsences an integer >= 0
    * @return number of students removed from seats
    * Postcondition:
    * - All students with allowedAbsences or fewer are in their original positions in seat
    * - No student in seats has more than allowedAbsences absences.
    * - Entries without students contain null.
   */
   public int removeAbsentStudents(int allowedAbsences)
   {
	  for(int i = 0; i < seats.length; i++) {
		  for (int j = 0; j < seats[0].length; j++) {
			  if(seats[i][j].getAbsenceCount() == allowedAbsences) {
				  seats[i][j].equals(null);
			  }
		  }
	  }
      return 0; //here so the program compiles.
   }
   
   public String toString()
   {
      if(seats == null)
         return "";
      String result = "";
      String tmp;
      for(int i = 0; i<seats.length; i++)
      {
         for(int j = 0; j<seats[0].length; j++)
         {
            if(seats[i][j]!=null)
            {
               tmp = seats[i][j].getName();
               while(tmp.length() < 6)
                  tmp = tmp + " ";
               result = result + tmp + " ";  
            }
            else
               result = result + "null  ";
         }
         result = result + "\n";
      }
      
      return result; //here so the program compiles.
   }

}