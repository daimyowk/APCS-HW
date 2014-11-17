import  java.util.*;
public class Driver{
    public static void main(String args[]){
	ArrayList<Object> al = new ArrayList<Object>();
	//<> decides what type of objects
	//basically superarray
	System.out.println(al);
	al.add("hello");
	System.out.println(al);

	al.add("world");
	System.out.println(al);

	al.add(33.2);
	System.out.println(al);
	
    
    ArrayList<Integer> ai = new ArrayList<Integer>();
    Random r = new Random();
    for (int i=0; i<20; i++){
	ai.add(r.nextInt(2));
    }
    System.out.println(ai);
    	     
    for (int i=1;i<ai.size();i++){
	if(ai.get(i)==ai.get(i-1)){
	    ai.remove(i);
	    i--; //makes sure doesnt skip over when remove and shrinking list
	}
    }
    System.out.println(ai);
    }
}
