public class Driver{
    public static void main(Strings[] args){
	//Question 1
	public boolean mixStart(String str) {
	    if (str.length()<3){
		return false;
	    }
	    String check= str.substring(1,3);
	    return check.equals("ix");
	}
	//end question 1
	//Question 2
	public String makeOutWord(String out, String word) {
	    String firstHalf = out.substring(0,2);
	    String secondHalf = out.substring(2);
	    String done = firstHalf + word + secondHalf;
	    return done;
	}
	//End Question 2
	//Question 3
	public String firstHalf(String str) {
	    int holder = str.length();
	    int use = holder / 2;
	    return str.substring(0,use);
	}
	//End Question 3
    }
}
