package Section6Labs;

import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number of salesmen ");
	final int SALESPEOPLE = scan.nextInt();
	int[] sales = new int[SALESPEOPLE];
	int sum;
	
	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
	    }
	//added variables
	int max = sales[0];
	int min = sales[0];
	int posMax = 0;
	int posMin = 0;

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
	
	for (int i=0; i<sales.length; i++)
	    {
		//+1 in order to do 1 2 3 4... instead of starting with 0
		System.out.println("     " + (i+1) + "         " + sales[i]);
		sum += sales[i];
		
		//if the sales is greater than max, then the max is now that sales array and takes the 
		//position of the max
		if(sales[i]>max) {
			
			max = sales[i];
			posMax = i;
		
		}
		//same as above except it is min.
		else if(sales[i]<min) {
			
			min = sales[i];
			posMin = i;
			
			}
			
		
	    }
	
	//prints total sales
	System.out.println("\nTotal sales: " + sum);
	
	//gets average
	double average = sum/SALESPEOPLE;
	//prints average
	System.out.println("\nAverage sales: " + average );
	
	//prints position of min and max people and how much they have
	
	System.out.println("Salesperson " + (posMax+1) + " has a max sales: " + max);
	System.out.println("Salesperson " + (posMin+1) + " has a min sales: " + min);
	
	//enters value
	System.out.println("Enter value: ");
	int l = scan.nextInt();
	
	int sum1 = 0;
	
	//shows people that exceeded the amount inputed above and increases the sum.
	for (int o = 0; o < sales.length; o++) {
		
		if(sales[o] > l) {
			
			System.out.println("Salesperson " + o + " exceeded this amount with " + sales[o] + 
					" amount of sales.");
			
			sum1++;
			
			}
		
		}
	
	
	//prints the amount of people that exceeded that amount.
	System.out.println(sum1 + " amount of people exceeded that value.");
	
	
    }
    
    
    
    
}
