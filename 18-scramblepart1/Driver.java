import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String args[]){
	wordsearch w= new wordsearch();
	/*	w.addWordH("right","hello",3,15);//should work
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
		w.addWordH("left","hey",7,55);
		w.addWordV("down","test",3,22);
		w.addWordV("up","mister",13,13);
		w.addWordV("down","horrible",22,5); //test illegal row
		w.addWordV("up","check",19,-45);//test illegal col
		w.addWordV("up","time",20,11);
			w.addWordV("down","crazy",4,22); //test illegal overlap
			w.addWordV("up","cracy",4,23); //illegal overlap
			w.addWordV("down","stairs",5,22);//legal overlap
			w.addWordD("southwest","class",14,28);
			w.addWordD("southeast","whack",100,-100);
			System.out.println(w.addWord("ball"));*/
        w.FillIn();
	System.out.println(w);
    }
}
