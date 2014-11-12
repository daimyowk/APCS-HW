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
	
    
    ArrayList<Integar> ai = new ArrayList<Integar>();
    Random r = new Random();
    for (int i=0; i<20; i++){
	ai.add(r.nextInt(5));
    }
    System.out.println(ai);
    }	     
}
