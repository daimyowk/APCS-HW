public class Driver{
    public static void main(String[] args){
	//Testing function1
	StringStuff test = new StringStuff();
	String test1 = test.nonStart("Hello","There");
	System.out.println(test1); //should print "ellohere"
	String test2 = test.nonStart("a", "x");
	System.out.println(test2);//should print "" (empty string)
	//Testing function2
	String test3 = test.makeAbba("Yo","Homie");
	System.out.println(test3); //should print "YoHomieHomieYo"
	String test4 = test.makeAbba("","Yo"); 
	System.out.println(test4);//should print "YoYo"
	//Testing function3
	int  test5= test.diff21(50);
	System.out.println(test5);//should return 58
        int test6= test.diff21(-2);
	System.out.println(test6);//should reutrn 23
    }
}
