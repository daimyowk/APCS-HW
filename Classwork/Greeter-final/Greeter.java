public class Greeter {
    //instance variables
    private String greeting;
    //better not to print things throughout program

    // Constructors
    // called when "new" an instance of class
    //if no constructor, java give default one with no arguments
    /* notes always public
             name is name of class
	     no return type not even void
	     will be called when run new statement
    */
    //once write construuctor that take one or more arguement
    //lose default constructor
    //solve by overloading
    //overloading is when make 2 or more methods or constructors
    //of same name. Have differ in parameter types. java figure
    //out which one to use based on parameters
    //will make one with no parameters one with string parameters
    public Greeter(String s){
	greeting=s;
    }
    public Greeter(){
	greeting="Hello World"; //can be done isntead of new String("awd")
    }
    // Regular Methods
    // word after public defines the return type method
    //here returning string value.
    //if dont want return use void
    public String getGreeting() {
	return greeting;
    }
    public void setGreeting(String s){
	greeting=s;
    }
    public String greet() {
	//local variable only for this method
	// String greeting = new String("sup");
	//System.out.println(greeting);
	return greeting;
    }
    public void ungreet() {
	//uses instance varible of "Hello World"
	System.out.println("I'm out!");
    }
}
