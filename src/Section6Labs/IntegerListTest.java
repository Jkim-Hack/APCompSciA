package Section6Labs;
import java.util.Scanner;

public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    // Create a list, then repeatedly print the menu and do what the
    // user asks until they quit
    //-------------------------------------------------------
    public static void main(String[] args)
    {
	printMenu();
	int choice = scan.nextInt();
	while (choice != 0)
	    {
		dispatch(choice);
		printMenu();
		choice = scan.nextInt();
	    }
    }
    public static void dispatch(int choice)
    {
	int loc;
	switch(choice)
	    {
	    case 0: 
		System.out.println("Bye!");
		break;
	    case 1:
		System.out.println("How big should the list be?");
		int size = scan.nextInt();
		list = new IntegerList(size);
		list.randomize();
		break;
	    case 2:
		list.print();
		break;
	    case 3:
	    int newVal = scan.nextInt();
	    list.addElement(newVal);
	    case 4:
	    int val = scan.nextInt();
	    list.removeFirst(val);
	    case 5:
	    int vals = scan.nextInt();
	    list.removeAll(vals);
	   
	    }
    }

    //----------------------------
    // Print the user's choices
    //----------------------------
    public static void printMenu()
    {
	System.out.println("\n   Menu   ");
	System.out.println("   ====");
	System.out.println("0: Quit");
	System.out.println("1: Create a new list (** do this first!! **)");
	System.out.println("2: Print the list");
	System.out.println("3: Add element");
	System.out.println("4. Remove element");
	System.out.println("5. Remove all elements");
	System.out.print("\nEnter your choice: ");
    }
}


