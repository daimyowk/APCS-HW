public class Driver{
    public static void main(String args[]){
	wordsearch w= new wordsearch();
	//	w.addWordH("left","hello",3,15);//should work
	//w.addWordH("right","hello",3,34);
	w.addWordH("left","hello",3,1);
	/*
	w.addWordH("look",3,14);//test ilegal overlap
	w.addWordH("look",3,18);//test legal overlap
	w.addWordH("look",-3,20);//test illegal roww
	w.addWordH("look",3,55);//test illegal col
	*/
	System.out.println(w);
    }
}
