public class Frame{
    //10 mins
    public String enclose(int r, int c){
	int row=1;
	int number=c;
	String result="";
        for (row=1;row<=r;row++){
	    if (row==1 || row==r){
		for(number=0;number<c;number++){
		    result+="*";
		}
	    }
	    else{
		for(number=1;number<=c;number++){
		    if (number==1 || number==c){
			result+="*";
		    }
		    else{
			result+=" ";
		    }
		}
	    }
	    result+="\n";
	}
	return result;
    }
    //5 min
    public String stringSplosion(String str) {
	int number;
	String result="";
	for(number=0;number<=str.length();number++){
	    result+=str.substring(0,number);
	}
	return result;
    }
    //10 min
    public String stringX(String str) {
	int test;
	if (str.length()<=2){
	    return str;
	}
	String result=str.substring(0,1);
	for(test=1;test<=str.length()-2;test++){
	    if (str.substring(test,test+1).equals("x")){
	    }
	    else{
		result+=str.substring(test,test+1);
	    }
	}
	result+=str.substring(str.length()-1);
	return result;
    }

}
			
	    
