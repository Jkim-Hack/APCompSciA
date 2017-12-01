package HotelTrail;

/**
 * Represents a reservation in a hotel.
 * @author Michael Wood
 * @version 1.0
 *
 */

public class Reservation
{
   /** name of the guest with the reservation. */
   private String name;
   
   /** number of the room being reserved. */
   private int roomNum;
   
   /**
    * Creates a reservation for the guest in the provided room number.
    *
    * @param guestName The name of the guest with the reservation
    * @param roomNumber The number of the room being reserved.
    */
   public Reservation(String guestName, int roomNumber)
   {
      name = guestName;
      roomNum = roomNumber;
   }
   
   /**
    * Returns the number of the room that is being reserved.
    *
    * @return the reserved room number.
    */
   public int getRoomNumber()
   {
      return roomNum;
   }  
   
   /**
    * Returns the name of the guest with the reservation.
    *
    * @return the name of the guest.
    */
   public String getName()
   {
      return name;
   }
   
}