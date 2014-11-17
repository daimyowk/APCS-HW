java.util.*;
/**
   the randomize class
<p>
It can have html <b> markup <b> or anchors

*/ 
public class Randomize{
    Random rnd = new Random;
    /* shuffle 1
       1.
    */
    public ArrayList<Integer> shuffle1(ArrayList<Integer> l){
	ArrayList<Integer> result = new ArrayList<Integer>();
	while(l.size()>0){
	    int i = rnd.nextInt(l.size());
	    int v = l.remove(i);
	    result.add(v);
	}
	return result;
    }
    /*
      Same as shuffle1 but works "in place"
      s=l.size();
      1.gernerate a random index between 0 and s
      2. remove that item
      3. add item to end
      4.subtract 1 from s
      5.go back to step one until done
    */
    public ArrayList<Integer> shuffle2(ArrayList<Integer> l){
	ArrayList<Integer> result = new ArrayList<Integer>();
    }
    /* hidden complexity
       
     */
    /*
      same as Shuffle1 but works in places
      s=l.size();
      1.generate random index between 0 and s
      2.swap item
    public static void main(String args[]){
	
