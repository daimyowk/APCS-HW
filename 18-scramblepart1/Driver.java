public class Driver{
    public static void main(String args[]){
	wordsearch w= new wordsearch();
       	w.addWordH("right","hello",3,15);//should work
	//w.addWordH("right","hello",3,34);
	w.addWordH("left","hello",3,1);
        w.addWordH("left","hello",4,7);
		w.addWordH("right","look",3,14);//test ilegal overlap
		w.addWordH("left","look",3,17);//illegal overlap left
	w.addWordH("right","look",3,18);//test legal overlap
	System.out.println(w.illegalOverlap("right","look",3,18));
	System.out.println(w.illegalOverlap("right","look",3,14));
		w.addWordH("right","look",-3,20);//test illegal roww
		w.addWordH("right","look",3,55);//test illegal col
	
	System.out.println(w);
    }
}
