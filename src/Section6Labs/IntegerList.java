package Section6Labs;

public class IntegerList
{
    int[] list; //values in the list
    private int size;
    int[] tempor;
    int p;
    int l;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int s)
    {
    size = s;	
	list = new int[size];
	tempor = new int[size];
	p = tempor.length;
	l = list.length;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;
		tempor = list;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i<list.length; i++)
	    System.out.println(i + ":\t" + list[i]);
    }
    
    public void increaseSize() {
    	
    	//Makes temporary array that will be the new amount
    	
    	int[] temp = new int[list.length*2];
    	//Goes through and iterates so that all of list is now in temp
    	for(int i = 0; i<list.length; i++) {
    		temp[i] = list[i];
    	}
    
    	list = temp;
    	
    	
    }
    
    public void addElement(int newVal) {
    	
    	//try-catch statement, the last element + 1 will be the new value, but when 
    	//the compiler sees that there's an outofbounds exception, it will increase the size of the 
    	//array times 2 and assigning the new value at the end of the increased array.
    	try {
    	 list[l] = newVal;
    	} catch (ArrayIndexOutOfBoundsException e) {
    		increaseSize();
    		list[p] = newVal;
    		p++;
    		l++;
    	}
    }
    
    public void removeFirst(int newVal) {
    	
    	//Iterates through the array
    	for(int i = 0; i < list.length; i++) {
    		
    		//sees first occurrence
    		if(list[i] == newVal) {
    		//wherever the position was found, that position will now be equal to one above it
    			list[i] = list[i+1];
    			
    			//iterates a second time to make sure every element is shifted one down after the
    			//removal of the occurrence.
    			for(int j = i+1; j < list.length-1; j++) {
    				
    				list[i+1] = list[j+1];
    				
    			}
    			//breaks the statement when it is found.
    			break;
    			
    		}
    		
    		
    	}
    	
    }
    //same thing as above except the break statement is not needed.
    public void removeAll(int newVal) {
    	
    	for(int i = 0; i < list.length; i++) {
    		
    		if(list[i] == newVal) {
    		
    			list[i] = list[i+1];
    			
    			for(int j = i+1; j < list.length-1; j++) {
    				
    				list[i+1] = list[j+1];
    				
    			}
    			
    			
    			
    		}
    		
    		
    	}
    	
    	
    }
    
}

