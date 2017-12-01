package HotelTrail;


/**
 * Represents a hotel.
 *
 */

/*
HINTS: 

A statement in the format:        <object name> = null;
sets the object equal to null (basically deletes it but keeps the identifier.

a test in the format:             <object name> == null
checks to see if something is equal to null.

         

*/
public class Hotel
{
   /** All possible rooms that could be reserved in the hotel. */
   private Reservation [] rooms;
   
   public Hotel(int numRooms)
   {
      rooms = new Reservation [numRooms];  
   }
   
   /**
    * If there are any empty rooms (rooms with no reservation),
    * then create a reservation for an empty room for the specified guest. 
    *
    * @param guestName The name of the guest who is reserving the room.
    * 
    * @return the Reservation if their is a room, null if no rooms are
    *         available.
    */
   public Reservation requestRoom(String guestName)
   {
	  for(int i = 0; i < rooms.length; i++) {
		  
	  if(rooms[i] == null) {
		  
		  rooms[i] = new Reservation(guestName, i);
		  break;
	  }
	  
	  }
	   
	   
      return null; //here so that the program will compile.
   }
   
   /**
    * Looks for the reservation for the guest with the provided name and
    * Cancels the reservation opening up the room to be reserved by 
    * someone else. 
    * 
    * @param guestName name of the person canceling their reservation.
    */
   public void cancel(String guestName)
   {
	   for(int i = 0; i < rooms.length; i++) {
		   
		   if(rooms[i].getName().equals(guestName)) {
			   
			   rooms[i] = null;
			   
		   }
		   
		   
	   }
   
   }
   
   /**
    * Prints the name of each guest followed by the room they are staying
    * in to the console. The guest and room they are in should be on the 
    * same line. 
    *
    */
   public void printGuestList()
   {
	   for(int i = 0; i < rooms.length; i++) {
		   
		   
		   if(rooms[i] == null) {
			   
		   System.out.println("Room number: " + i + " Empty");
			   
		   } else {
		   
		   System.out.println("Room number: " + i + " Name: " + rooms[i].getName());
		   
		   }   
	   }
	   
	   
   }
   
   /**
    * Prints "Available Rooms" followed by a list of every room number that 
    * is not occupied to the console.
    *
    */
   public void printEmptyRoomNumbers()
   {
	   int sum = 0;
	   System.out.println("Room numbers: ");
	   for (int i = 0; i < rooms.length; i++) {
		   
		   if(rooms[i] == null) {
			   
			   sum++;
			   
			   System.out.print(i + " ");
			   
			   
		   }
		   
		   
	   }
	   System.out.print("are available");
	   System.out.println("\nThere are " + sum + " available rooms");
	   
   }
   
   /**
    * Checks if the given room number is available. 
    * 
    * @param roomNumber the room to check for availability.
    *
    * @return true if the room is available, false otherwise.
    */
   public boolean checkRoom(int roomNumber)
   {
	  
		   if(rooms[roomNumber] == null) {
			   return true;
		   } else {
			   
			   return false; //here so that the program will compile.
			   
		   }
   }
   
}