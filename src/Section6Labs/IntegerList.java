package Section6Labs;

public class IntegerList
{
    int[] list; //values in the list
    private int size;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int s)
    {
    size = s;	
	list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i<list.length; i++)
	    System.out.println(i + ":\t" + list[i]);
    }
    
    public void increaseSize(int amt) {
    	
    	int[] temp = new int[list.length+amt];
    	
    	for(int i = 0; i<list.length; i++) {
    		temp[i] = list[i];
    	}
    	
    	list = temp;
    	
    	
    }
    
    public void addElement(int newVal) {
    	
    	
    	try {
    		
    	 list[list.length] = newVal;
    		
    	} catch (ArrayIndexOutOfBoundsException e) {
    		
    		increaseSize(1);
    		list[list.length-1] = newVal;
    		
    	}
    
    }
    
    public void removeFirst(int newVal) {
    	
    	for(int i = 0; i < list.length; i++) {
    		
    		if(list[i] == newVal) {
    		
    			list[i] = list[i+1];
    			
    			for(int j = i+1; j < list.length-1; j++) {
    				
    				list[i+1] = list[j+1];
    				
    			}
    			
    			break;
    			
    		}
    		
    		
    	}
    	
    }
    
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

