
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
}
