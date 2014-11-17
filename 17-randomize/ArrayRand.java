import java.util.*;
public class ArrayRand{
    private Random rnd = new Random();
    private int[] ai;
    
    public ArrayRand(){
	this(10);
    }

    public ArrayRand(int n){
	ai= new int[n];
	for (int i=0;i<n; i++){
	    ai[i]=i;
	}
    }

    public String toString() {
      	String s = "";
      	for (int i=0;i<ai.length;i++)
	    s = s  + ai[i]+", ";
	    return s;
      	}
    
    public void randomize(){
	int[] holder = new int[ai.length];
	/*	for (int i =0;i<ai.length;i++){
	    holder[i]=ai[i];
	    }*/
	    
        for (int i =0;i<ai.length;){
        int r = rnd.nextInt(ai.length);
	   
	if(ai[r]!=-1){
	    holder[i]=ai[r];
	    ai[r]=-1;
	    i++;
	    }
	}
        
	ai=holder;
    }

    public static void main(String[] args){
	ArrayRand test = new ArrayRand();
	System.out.println(test);
	test.randomize();
	System.out.println(test);
    }
}
		

	
