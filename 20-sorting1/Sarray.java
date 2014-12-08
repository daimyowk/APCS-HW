public class Sarray {
     String[] data;
     int   last;
    
    public Sarray(String[] stuff) {
        // set up the initial instance variables
        data = stuff;
	//int[0]=1;
	//	int[1]=52;
	last=data.length-1;
	for (int x=0;x<data.length;x++){
	    if (data[x]==null){
		last=x-1;
		break;
	    }
	}
    }
    public void lastcheck(){
	last=data.length-1;
      	for (int x=0;x<data.length;x++){
	    if (data[x]==null){
		last=x-1;
		break;
	    }}
    }
    public boolean add(String i){
        // adds an item to the end of the list, grow if needed
        // returns true
	lastcheck();
	if (last==(data.length-1)){
	    String[] result = new String[data.length+1];
	    for (int x=0;x<data.length;x++){
		result[x]=data[x];
	    }
	    result[data.length]=i;
	    data=result;
	}
	else data[last+1]=i;
	return true;
	
    }
    
    public void  add(int index, String i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed
        
        lastcheck();
       
	    
	try{ 
	    errorEvent(index);
	} catch(ArrayIndexOutOfBoundsException e){
	    System.out.println(e+ ": Array size not large enough. Not done");
	    System.exit(0);
	}
	if (last==data.length-1){
	String[] result= new String[data.length+1];
        for (int x=0;x<index;x++){
	    result[x]=data[x];
	}
	result[index]=i;
	for (int x=index; x<data.length;x++){
	    result[x+1]=data[x];
	}
	data=result;
	}
	else{
	String[] result= new String[data.length];
        for (int x=0;x<index;x++){
	    result[x]=data[x];
	}
	result[index]=i;
	for (int x=index+1; x<data.length;x++){
	    result[x]=data[x-1];
	}
	data=result;
	}
    }
    
    public int size() {
        // returns the number of items in the list (not the array size)
	int counter=0;
	for (int x=0;x<data.length;x++){
	    if(data[x]!=null){
		counter++;
	    }
	}
	return counter;
    }
    
    public String get(int index) {
        // returns the item at location index of the lsit
	lastcheck();
	try{ 
	    errorEvent(index);
	} catch(ArrayIndexOutOfBoundsException e){
	    System.out.println(e+ ": Array size not large enough. Not done");
	    System.exit(0);
	}
	return data[index];
    }
    
    public String set(int index, String i){
        // sets the item at location index to value i
        // returns the old value. 
	lastcheck();
	try{ 
	    errorEvent(index);
	} catch(ArrayIndexOutOfBoundsException e){
	    System.out.println(e+ ": Array size not large enough. Not done");
	    System.exit(0);
	}
	String old=data[index];
	data[index]=i;
	return old;
	}
    public String toString() {
	       	String s = "";
	      	for (int i=0;i<data.length;i++)
		      	s = s  + data[i]+", ";
			return s;
		}
    public void errorEvent(int i ){
	if (i>last){
	    throw new ArrayIndexOutOfBoundsException();
	}
    }
    public String remove(int index){
        // removes the item at index i
        // returns the old value
        lastcheck();
	try{ 
	    errorEvent(index);
	} catch(ArrayIndexOutOfBoundsException e){
	    System.out.println(e+ ": Array size not large enough. Not done");
	    System.exit(0);
	}
	String[] result= new String[data.length];
        for (int x=0;x<index;x++){
	    result[x]=data[x];
	}
	for (int x=index+1; x<data.length;x++){
	    result[x-1]=data[x];
	}
	data=result;
	return data[index];
    }
    /*
    public void isort(){
	String newvalue;
	int i;
	String[] result = new String[data.length];
        
	int last=0;
	for (int x=0;x<data.length;x++){
	    
	    newvalue=data[x];
	    // remove(x);
	    System.out.println(last);
	    for(i=last; i>0 && newvalue.compareTo(result[i-1])<0; i--){
		    result[i]=result[i-1];
	    }
	    result[i]=newvalue;
	    last++;
	}
	data=result;
	}*/
    //n^2
    public void isort(){
	String newvalue;
	int i;
        int assignCounter=0;
	int compareCounter=0;
	for (int last=0;last<data.length;last++){
	    newvalue=data[last];
	    
	    
	    for(i=last;i>0 && newvalue.compareTo(data[i-1])<0;i--){
		data[i]=data[i-1];
		assignCounter++;
		compareCounter++;
	    }

	    data[i]=newvalue;
	    assignCounter++;
	    /*String s = "";
	    for (int z=0;z<data.length;z++){
		      	s = s  + data[z]+", ";
	    }
	    System.out.println(s);*/
	
	}
	System.out.println(compareCounter);
    }
    //ssort
    //find min --> n
    //do n times
    //n^2 times but n always decrease in 2nd loop
    //(n^2+n)/2 as n gets larger only n^2
    public void ssort(){
	int x;
	int smallestindex;
	String smallestString;
	int assignCounter=0;
	int compareCounter=0;
	for (int i=0;i<data.length;i++){
	    smallestindex=i;
	    smallestString=data[i];
	    for (x=i;x<data.length;x++){
		if (data[x].compareTo(smallestString)<0){
		    smallestindex=x;
		    smallestString=data[x];
		    compareCounter++;
		    // System.out.println(smallestString);
		    // System.out.println(smallestindex);
		}
	    }
	    data[smallestindex]=data[i];
	    data[i]=smallestString;
	    assignCounter+=2;
	    
	}
	System.out.println(compareCounter);
    }
    public void bsort(){
	for (int y=0;y<data.length-1;y++){
	    for (int x=0;x<data.length-1;x++){
		if (data[x].compareTo(data[x+1])>0){
		    String holder1=data[x];
		    String holder2=data[x+1];
		    data[x+1]=holder1;
		    data[x]=holder2;
		}
	    }
	}
    }
    //when dealing with a small array, all three short methods take the same
    //amount of time. However as the array gets larger, bubble sort takes longer
    // than the other two.

    //compare on different data sets
    //number of assignments
    //number of comparsions
    //builtin Arrays.sort(data)
}


