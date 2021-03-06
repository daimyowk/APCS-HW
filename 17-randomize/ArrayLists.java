import java.util.*;

public class ArrayLists{

    private Random rnd = new Random();
    private ArrayList<Integer> ai;

    public ArrayLists(){
        this(10);
    }

    public ArrayLists(int n){
	ai = new ArrayList<Integer>();
	for (int i = 0; i < n; i++){
	    ai.add(i);
	}
    }
    public String toString() {
      	String s = "";
      	for (int i=0;i<ai.size();i++)
	    s = s  + ai.get(i)+", ";
	    return s;
		}
    public void randomize(){
	//ArrayList<Integer> copy = ai; pointer not seperate copy
	ArrayList<Integer> copy = new ArrayList<Integer>();
	for (int i=0;i<ai.size();i++){
	    copy.add(ai.get(i));
	}
	
	for (int i = 0; i < ai.size(); i++){
	    int r = rnd.nextInt(copy.size());
	    ai.set(i, copy.get(r));
	    copy.remove(r);
	    //System.out.println(i);
	  
	    
	}
    }


    public static void main(String[] args){
        
	ArrayLists a = new ArrayLists();
	System.out.println(a);
	a.randomize();
	System.out.println(a);
    }

}
