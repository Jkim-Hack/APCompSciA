package Section6Labs;

import java.text.NumberFormat;

public class ShoppingCart
{
    private int itemCount;      // total number of items in the cart
    private double totalPrice;  // total price of items in the cart
    private int capacity;       // current cart capacity
    private Item[] cart;
    private int j;

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart()
    {
	capacity = 5;
	itemCount = 0;
	totalPrice = 0.0;
	cart = new Item[capacity];
	j = 0;
    }

    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {
    	
    	Item i = new Item(itemName, price,  quantity);
    	
    	cart[j] = i;
    	
    	totalPrice += price;
    	
    	j++;
    	
    }

    // -------------------------------------------------------
    //  Returns the contents of the cart together with
    //  summary information.
    // -------------------------------------------------------
    public String toString()
    {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();

	String contents = "\nShopping Cart\n";
	contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

	for (int i = 0; i < itemCount; i++)
	    contents += cart[i].toString() + "\n";

	contents += "\nTotal Price: " + fmt.format(totalPrice);
	contents += "\n";

	return contents;
    }

    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
    private void increaseSize()
    {
    	//new temporary item array
    	Item[] temp = new Item[cart.length+3];
    	
    	//loads in temp with all the cart array items.
    	for(int i = 0; i<cart.length; i++) {
    		temp[i] = cart[i];
    	}
    	//all of temp is in cart.
    	cart = temp;
    	
    	
    }

	public double getTotalPrice() {
		return totalPrice;
	}
    
    
}

