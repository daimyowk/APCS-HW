public class stuff {
    public String box(int r, int c) {
	String box="";
	String row="";
	int hold=0;
	int hold2=r;
	while (hold<c){
	    row+="*";
	    hold++;
	}
	row+="\n";
	while (hold2>0){
	    box+=row;
	    hold2--;
	}
	return box;
    }
}
		
	    
		
