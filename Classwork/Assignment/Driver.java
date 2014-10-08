public class Driver{
    public static void main(String[] args){
	Greeter g1 = new Greeter("Tom");
	System.out.println(g1.greetPerson());
	Greeter g2 = new Greeter("Henry");
	System.out.println(g2.greetPerson());
    }
}
