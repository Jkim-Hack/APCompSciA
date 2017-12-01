public class TrailTester
{
   public static void main(String [] args)
   {
      //instantiate a trail object.
      Trail t = new Trail();
      
      //test findMaxElevation()
      System.out.println("*****TESTING findMaxElevation()*****");
      System.out.println("Max Elevation 0 - 12: " + t.findMaxElevation());
      if(t.findMaxElevation() != 150)
         System.out.println("TEST FAILED. Expected Value: 150");
      else
         System.out.println("Succesful Test");
         
      System.out.println();
      
      //test findMaxElevation(int start, int end)
      System.out.println("*****TESTING findMaxElevation(int start, int end)*****");
      System.out.println("Max Elevation 5 - 9: " + t.findMaxElevation(5, 9));
      if(t.findMaxElevation(5,9) != 80)
         System.out.println("TEST FAILED. Expected Value: 80");
      else
         System.out.println("Succesful Test");
         
      System.out.println();
      
      //test findMinElevation()
      System.out.println("*****TESTING findMinElevation()*****");
      System.out.println("Min Elevation 0 - 12: " + t.findMinElevation());
      if(t.findMinElevation() != 50)
         System.out.println("TEST FAILED. Expected Value: 50");
      else
         System.out.println("Succesful Test");
         
      System.out.println();
      
      //test findMinElevation(int start, int end)
      System.out.println("*****TESTING findMinElevation(int start, int end)*****");
      System.out.println("Min Elevation 2 - 5: " + t.findMinElevation(2, 5));
      if(t.findMinElevation(2, 5) != 80)
         System.out.println("TEST FAILED. Expected Value: 80");
      else
         System.out.println("Succesful Test");

      System.out.println();
      
      //test isLevelTrailSegment(int start, int end)
      System.out.println("*****TESTING isLevelTrailSegment(int start, int end)*****");
      System.out.println("Test 1 - Is Level 2 - 10: " + t.isLevelTrailSegment(2,10));
      if(t.isLevelTrailSegment(2,10))
         System.out.println("TEST FAILED. Expected Value: false");
      else
         System.out.println("Successful Test");
         
      System.out.println();   
      

      System.out.println("Test 2 - Is Level 7 - 10: " + t.isLevelTrailSegment(7,10));
      if(!t.isLevelTrailSegment(7,10))
         System.out.println("TEST FAILED. Expected Value: true");
      else
         System.out.println("Succesful Test");   
      
      System.out.println();

      //test isDifficult()      
      System.out.println("*****TESTING isDifficult()*****");
      System.out.println("Trail rated as difficult: " + t.isDifficult());
      if(!t.isDifficult())
         System.out.println("TEST FAILED. Expected Value: true");
      else
         System.out.println("Successful Test");
      
      System.out.println();
      
      //Print out notice and instructions for submitting.
      System.out.println("Make sure to check with different trail values to");
      System.out.println("ensure that your program works in all conditions.");
      System.out.println("Edit Trail.txt to change the values, but do not");
      System.out.println("change the total number of values. When complete, ");
      System.out.println("submit Trail.java to your Google Drive in a folder");
      System.out.println("called Trail Exercise");
   }
}