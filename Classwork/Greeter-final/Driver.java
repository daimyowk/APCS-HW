public class Driver{
    public static void main(String[] args){
	Greeter g1= new Greeter();
	Greeter g2= new Greeter();
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	g1.setGreeting("sup");
	//g1.greeting = new String("Sup");
	//changes instance variable greeting in g1 only
	//cant change if greeting is privite in Greeter class
	//in java instance varibles always privite
	//to get at it write accessor methods --> get and set
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	String s = g1.getGreeting();
	System.out.println("g1's greeting is "+s);
	System.out.println("g2's greeting is "+g2.getGreeting());
    }
}
