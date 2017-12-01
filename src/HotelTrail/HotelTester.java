package HotelTrail;

import java.util.Scanner;

public class HotelTester
{  
   public static void main(String [] args)
   {
      Hotel adInn = new Hotel(50);
      Scanner scanner = new Scanner(System.in);
      String option;
      
      System.out.println("Welcome to the Athens Inn!");
      while(true)
      {
         printMenu();
         option = scanner.nextLine();
         if(option.equals("1"))
         {
        	 System.out.println("Enter your name: ");
        	 adInn.requestRoom(scanner.nextLine());
         }
         else if(option.equals("2"))
         {
        	System.out.println("Enter your name: ");
        	adInn.cancel(scanner.nextLine());
         }
         else if(option.equals("3"))
         {
        	 Scanner s = new Scanner(System.in);
           System.out.println("Enter room number: ");
           if(adInn.checkRoom(s.nextInt()) == true) {
        	   System.out.println("Available");
           } else {
        	   System.out.println("Not Available");
           }
         }
         else if(option.equals("4"))
         {
            adInn.printGuestList();
         }
         else if(option.equals("5"))
         {
            adInn.printEmptyRoomNumbers();
         }
         else if(option.equals("6"))
         {
            System.out.println("Have a great day!");
            System.exit(0);
         }
         else
         {
            System.out.println("Invalid option, select again.");
         }    
      
      }
   }
   
   public static void printMenu()
   {
      System.out.println("1 - create reservation");
      System.out.println("2 - cancel reservation");
      System.out.println("3 - check room availability");
      System.out.println("4 - print guest list");
      System.out.println("5 - print available rooms");
      System.out.println("6 - quit");
      
   }
}