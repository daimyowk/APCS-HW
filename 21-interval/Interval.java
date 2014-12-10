import java.io.*;
import java.util.*;

class Interval implements Comparable {

    private int low,high;
    private static Random r = new Random();//static makes use one generator only				
    private static int numIntervals = 0;
    public void setup(int l,int h){
	high=h;
	low=l;
	numIntervals++;
    }
    public Interval(int l, int h){
	setup(l,h);
    }
   
    public Interval() {
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
        setup(l,h);
    }
    public int getHigh(){
	return high;
    }
    public int getLow(){
	return low;
    }
       	
    public String toString() {
	//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";
	return s;
    }
    
    public static void printstuff() {
	System.out.println("Stuff");
    }
    public int compareTo2(Interval x){
	if (this.getLow()>x.getLow()){
	    return 1;
	}
	else if (this.getLow()<x.getLow()){
	    return -1;
	}
	else if (this.getHigh()> x.getHigh()){
	    return 1;
	}
        else if (this.getHigh()<x.getHigh()){
	    return -1;
        }
	else 
	    return 0;
        
    }
    //better way
    public int compareTo(Object x){
	//create local variable and cast and assign parametr
	Interval o = (Interval)x;
	if (this.getLow()==o.getLow()){
	    return this.getHigh()-o.getHigh();
	}
	else
	    return this.getLow()-o.getLow();
    }

    
    public static void main(String[] args) {
	
	Interval ival = new Interval();
	ival.printstuff(); // normal calling off of an instance
	printstuff(); // since printStuff is static we can call it without an instance
	Interval.printstuff(); // we can also call it right off a class
	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	
	Interval test1=new Interval(11,24);
	Interval test2=new Interval(10,25);
	System.out.println(test1);
	System.out.println(test2);
	System.out.println(test1.compareTo(test2));
        //Interfaces
	//contract in java that specifies that a class will implment
	//certain methods with certain signatures
	/* interface name{
	    method1_signature;
	    method2_signature;
	    ect
	   }
	   
	   method signature is: public/private return_type name(params);
	   ex. built in Java Comparable interface look liek this
	   
	   interface Comparable{
	     public int CompareTo(Object other);
	   }

	   to implement interface use "implements"
	   ex:

	   class myClass implments Comparable{
	     //class definitions
	   }

	   A class can only extend one class but can implement as many 
	   interface as it wants seperated by ,
	*/
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	//not flexible
    }
}
