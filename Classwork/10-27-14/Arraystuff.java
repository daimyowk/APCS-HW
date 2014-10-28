import java.util.*;
public class Arraystuff{
    private int[] a;
    Random rnd;
    // private final int x = 123; no allow change but can use
    //final set once but never change
    public Arraystuff(int n){
	a = new int[n];
	rnd = new Random();
	for (int i=0;i<a.length;i++){
	    a[i] =75 + rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	/*	a = new int[100];
	rnd = new Random();
	for (int i=0;i<a.length;i++){
	a[i] =75 + rnd.nextInt(76);*/
	this(100);
    }

    public String toString(){
	String s= "";
	for (int i = 0; i<a.length;i++){
	    s = s+ a[i]+",";
	}
	return s;
    }
    public int find(int n){
	int result=-1;
	for (int i=0; i<a.length;i++){
	    if (a[i]==n){
		result=i;
	    }
	}
	return result;
	    }
    
    public static void main(String[] args){
	Arraystuff as = new Arraystuff(10);
	System.out.println(as);
	System.out.println(as.find(86));
    }
}
    
