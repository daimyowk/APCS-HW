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
    public void isort(){
	String newvalue;
	int i;
	for (int x=0;x<data.length;x++){
	    newvalue=data[x];
	    remove(x);
	    last=data.length-1;
	    
	    for(i=last;i>0 && newvalue.compareTo(data[i-1])<0;i--){
		data[i]=data[i-1];
	    }

	    data[i]=newvalue;
	    String s = "";
	    for (int z=0;z<data.length;z++){
		      	s = s  + data[z]+", ";
	    }
	    System.out.println(s);
	
	}
    }
}


