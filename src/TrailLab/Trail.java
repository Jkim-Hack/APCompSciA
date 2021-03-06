package TrailLab;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Trail
{
   /** Representation of the trail. The number of markers on the trail is markers.length. */
   private int[] markers;
   
   /** Constructs a trail object and creates the array of markers. */
   public Trail()
   {
      markers = new int[13];
      importTrail();
   }
   
   /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
    *  an ending marker, and all markers between those two markers.
    *  A trail segment is level if it has a difference between the maximum elevation
    *  and minimum elevation that is less than or equal to 10 meters.
    *  @param start the index of the starting marker
    *  @param end the index of the ending marker
    *  Precondition: 0 <= start < end <= markers.length - 1
    *  @return true if the difference between the maximum and minimum
    *  elevation on this segment of the trail is less than or equal to 10 meters;
    *  false otherwise.
    */   
   
   //JOHN ONLY
   public boolean isLevelTrailSegment(int start, int end)
   { 
	 
		  if(findMaxElevation(start, end) - findMinElevation(start, end) == 10) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  
   }

   /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
    *  elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
    *  with 3 or more such changes is rated difficult.
    *  @return true if the trail is rated difficult; false otherwise.
    */
   //ASHWIN ONLY
   public boolean isDifficult()
   { 
	   int res = 0;
	   int sum = 0;
	   for(int i=0; i<markers.length;i++){
		   try {
		   sum =Math.abs(markers[i]-markers[i+1]);
		   } catch (ArrayIndexOutOfBoundsException e) {
			   break;
		   }
		   
		   
		   if(sum>=30){
			   res++;
			   	   }	   
		    }
	   if(res>=3){
		   
		   return true;
	   }
	   else{
		   return false;
	   }
   }

   /** Finds the maximum elevation of the entire trail.
    *  @return the maximum elevation of the entire trail.
    */
   //STANLEY
   public int findMaxElevation()
   {
	   int elevation = markers[0];
		for (int i = 0; i < markers.length - 1; i++) {
			if (elevation < markers[i + 1])
				elevation = markers[i + 1];
		}
		return elevation;
   }
   
   /** Finds the maximum elevation of a section of the trail.
    * @param start the index of the marker to start from.
    * @param end the index of the marker to end at.
    * @return the maximum elevation of the section of trail.
    */
   //JOHN
   public int findMaxElevation(int start, int end)
   {
	  int max = 0;
	  for(int i = start; i <= end; i++) {
		  if(markers[i] > max) {
			  
			  max = markers[i];
			  
		  }
	  }
      return max;//Here so that the program will compile.
   }
   
   /** Finds the minimum elevation of the entire trail.
    *  @return the minimum elevation of the entire trail.
    */
   //JOHN AND STANLEY ONLY
   public int findMinElevation()
   {
	int elevation = markers[0];
	for (int i = 0; i < markers.length - 1; i++) {
		if (elevation > markers[i + 1])
			elevation = markers[i + 1];
	}
	return elevation;
   }
   
   /** Finds the minimum elevation of a section of the trail.
    * @param start the index of the marker to start from.
    * @param end the index of the marker to end at.
    * @return the minimum elevation of the section of trail.
    */
   //JESSE ONLY
   public int findMinElevation(int start, int end)
   {
	   int min = markers[start];
		  for(int i = start; i <= end; i++) {
			  if(markers[i] < min) {
				  
				  min = markers[i];
				  
			  }
		  }
	      return min;//Here so that the program will compile.
   }
   
   //Do not edit this method. It imports elevations for the trail markers.
   private void importTrail()
   {
      try{
         Scanner sn = new Scanner(new File("Trail.txt"));
         for(int i = 0; i < markers.length; i++)
         {
            markers[i] = Integer.parseInt(sn.nextLine());
         }
              
      }catch(FileNotFoundException e){
         String s = "File not found! Make sure that Trail.txt ";
         s = s + "is in the same folder as the class.";
         System.out.println(s);
      }
   }
}