public class Driver{
    public static void main(String args[]){
	/*String[] test =new String[3];
	test[1]="hi";
	String result="";
	for (int x=0;x<test.length;x++){
	    result+=test[x]+",";
	}
	System.out.println(result);*/
	String[] input = {"today","snow","thanks","yo"};
	Sarray tester=new Sarray(input);
	tester.add("check");
	System.out.println(tester);
	tester.add(2,"let");
	System.out.println(tester);
    }
}
