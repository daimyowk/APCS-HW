
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }
    // about 10-15 mins
    public String tri1(int h){
	String done="";
	int rows=1;
	int number=0;
	while (rows<=h){
	    while(number<rows){
		done+="*";
		number++;
	    }
	    done+="\n";
	    rows++;
	    number=0;
	}
	return done;
    }
    //about 10 mins
    public String tri2(int h){
	int rows=1;
	int number=0;
	String result="";
	while (rows<=h){
	    while (number<h){
		if (number>=(h-rows)){
		    result+="*";
			}
		else{
		    result+=" ";
		}
		number++;
	    }
	    result+="\n";
	    number=0;
	    rows++;
	}
	return result;
    }
    //20 mins
    public  String tri3(int h){
	int row=1;
	int apart=0;
	int bpart=0;
	int star=0;
	String result="";
	for(row=1;row<=h;row++){
	    // total characters in row subtracted by # stars in each row divided by 2 
	    int spaces=((2*h-1)-(2*row-1))/2;
	    for(apart=0;apart<spaces;apart++){
		result+=".";
	    }
	    for(star=1;star<= 2*row-1;star++){
		result+="*";
	    }
	    for(bpart=0;bpart<spaces;bpart++){
		result+=".";
	    }
	    result+="\n";
	}
	return result;
    }
    // 15 mins
    public String tri4(int h){
	String result="";
	int row=1;
	int count=0;
	int holder=0;
	while(row<=h) {
	    while (count<h){
		if (holder<(row-1)) {
		    result+=" ";
		    holder++;
		}
		else {
		    result+="*";
		}
		count++;
	    }
		row++;
		result+="\n";
		count=0;
		holder=0;
	}
	return result;
    }
    public String diamond(int h) {
	int row=1;
	int apart=0;
	int bpart=0;
	int star=0;
	String result="";
	for(row=1;row<=((h+1)/2);row++) {
	    int spaces=(h-(2*row-1))/2;
	    for(apart=0;apart<spaces;apart++){
		result+=".";
	    }
	    for (star=1;star<=(2*row-1);star++){
	        result+="*";
	    }
	    for(bpart=0;bpart<spaces;bpart++){
		result+=".";
	    }
	    result+="\n";
	}
	for(row=((h+1)/2+1);row<=h;row++){
	    int spaces=(h-(2*(h-row+1))-1)/2;
	    for(apart=0;apart<=spaces;apart++){
		result+=".";
	    }
	    for (star=1;star<=((2*(h-row+1))-1);star++){
	        result+="*";
	    }
	    for(bpart=0;bpart<=spaces;bpart++){
		result+=".";
	    }
	    result+="\n";
	}
	return result;	
	    }

	    
	
}
