public class moreStrings{
    // about 7 mins
    public String frontTimes(String str, int n) {
	String front;
	String result="";
	if (str.length()<3){
	    front=str;
	} 
	else{
	    front=str.substring(0,3);
	}
	while (n>0){
	    result+=front;
	    n--;
	}
	return result;   
    }
    //about 8 mins
    public String stringBits(String str) {
	String result="";
	int number=0;
	while (number<str.length()){
	    if (number%2==0) {
		result+=str.substring(number,number+1);
	    }
	    number++;
	}
	return result;
    }
    // 10 mins
    public int stringMatch(String a, String b) {
	int number=0;
	int result=0;
	int shortlength;
	if (a.length()<b.length()){
	    shortlength=a.length();
	}
	else
	    {
		shortlength=b.length();
	    }
	while (number+2<=shortlength){
	    if (a.substring(number,number+2).equals(b.substring(number,number+2))){
		result+=1;
		number+=1;
	    }
	    else
		{
		    number+=1;
		}
	}
	return result;
    }
    /* 30 mins. Didn't undestand what it said about "a" at first. Tried approaching with substring and got stuck. Eventually found and used charAt.
     */
    public String stringYak(String str) {
	String result="";
	int number=0;
	while (number<str.length()){
	    if (number+2<str.length() && str.charAt(number)=='y' && str.charAt(number+2)=='k'){
		number+=3;
	    }
	    else{
		result+=str.substring(number,number+1);
		number+=1;
	    }
	}
	return result;
 
}
}
