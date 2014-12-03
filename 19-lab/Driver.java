public class Driver{
    public static void main(String args[]){
	/*String[] test =new String[3];
	test[1]="hi";
	String result="";
	for (int x=0;x<test.length;x++){
	    result+=test[x]+",";
	}
	System.out.println(result);*/
	//String[] input = {"ab","ac","ad","ada","az"};
       	String[] input = {"ab","ac","ad","ada","az"};
	/*String[] input = new String[5];
	input[0]="today";
	input[1]="snow";
	input[2]="thanks";
	input[3]="yo";
	if(input[4]==null){
	    System.out.println("true");
	    }*/
       	OrderedSuperArray tester=new OrderedSuperArray(input);
	/*tester.add("check");
	System.out.println(tester.size());
	System.out.println(tester);
	tester.add(2,"let");
	System.out.println(tester);
	tester.set(2,"change");
	System.out.println(tester);
	tester.remove(3);
	System.out.println(tester);*/
	tester.add("ade");
	//	tester.add("acde");//not working
    }
}
