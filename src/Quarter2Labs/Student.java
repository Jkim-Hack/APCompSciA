package Quarter2Labs;

public class Student
{
   //Declare the class variables. Javadoc comments have been added for 
   //each needed variable
   
   /** the name of the student **/
   public String name;
   /** the number of absences the student has **/
   public int absences;
 
    public Student(String n, int daysMissed)
    {
       //Insert code to create the constructor.
       name = n;
       absences = daysMissed;
    }
 
    /** Returns the name of this Student. */
    public String getName()
    {
       return name; //here so the program compiles.
    }
 
 
    /** Returns the number of times this Student has missed class. */
    public int getAbsenceCount()
    {
       return absences; //here so the program compiles.
    }
    
    public String toString()
    {
       return name + " " + absences;
    }
}