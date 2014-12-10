import java.io.*;
import java.util.*;

class Interval {

    private int low,high;
    private Random r = new Random();				
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
    public int compareTo(Interval x){
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

    
    public static void main(String[] args) {
	/*
	Interval ival = new Interval();
	ival.printstuff(); // normal calling off of an instance
	printstuff(); // since printStuff is static we can call it without an instance
	Interval.printstuff(); // we can also call it right off a class
	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
	*/
	Interval test1=new Interval(11,24);
	Interval test2=new Interval(10,25);
	System.out.println(test1);
	System.out.println(test2);
	System.out.println(test1.compareTo(test2));
    
    }
}
