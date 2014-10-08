public class Driver2{
    public static void main(String[] args){
	System.out.println("Before new");
	Greeter g1 = new Greeter();
	System.out.println("after new");
	g1.setGreeting("howdy");
	System.out.println(g1.greet());
	
	Greeter g2= new Greeter("HI ThERE");
	System.out.println(g2.greet());
    }
}
