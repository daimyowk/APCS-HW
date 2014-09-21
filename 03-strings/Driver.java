public class Driver {
    public static void main(String[] args){
	String s = "javis wu";
	int index = s.indexOf(" ");
	String first = s.substring(0,index);
	String last = s.substring(index+1);
	System.out.println(first);
	System.out.println(last);
	System.out.println(index);
    }
}
