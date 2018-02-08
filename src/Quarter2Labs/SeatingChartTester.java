package Quarter2Labs;

import java.util.ArrayList;

public class SeatingChartTester
{
   public static void main(String [] args)
   {
      ArrayList<Student> roster = new ArrayList<Student>();
      roster.add(new Student("Karen", 3));
      roster.add(new Student("Liz", 1));
      roster.add(new Student("Paul", 4));
      roster.add(new Student("Lester", 1));
      roster.add(new Student("Henry", 5));
      roster.add(new Student("Renee", 9));
      roster.add(new Student("Glen", 2));
      roster.add(new Student("Fran", 6));
      roster.add(new Student("David", 1));
      roster.add(new Student("Danny",3));
      
      SeatingChart sc = new SeatingChart(roster, 3, 4);
      System.out.println(sc);
      sc.removeAbsentStudents(4);
      System.out.println(sc);
   }
}