public class Driver{
    public static void main(String args[]){
	/*int[] a = new int[3];
	a[0]= 1;
	String s = "";
       	for (int i=0;i<a.length;i++){
	      	s = s  + a[i]+", ";
	}
	System.out.println(s);*/
	//	int[] a = {1,2715,37,90};
	int[] a = new int[5];
	a[0]=2;
	a[1]=26;
	Sarray test = new Sarray(a);
	System.out.println(test);
	test.remove(1);
	System.out.println(test);
	test.add(0,11);
	System.out.println(test);
	test.add(99);
     	System.out.println(test);
	test.size();
	test.set(10,991);
	System.out.println(test);
	/*test.set(10,991);
	System.out.println(test);
	System.out.println(test.get(2));
	System.out.println(test);
	test.add(10,4);
	System.out.println(test);*/
	
    }
}
