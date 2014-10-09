public class Basechar{
    private int health=20;
    private String name;
    //public Basechar(String n){
    //	setName(n);
    // }
    // public Basechar(){
    //	setName("DEFAULT");
    // }
   
    public Basechar(String n){
	 setName(n);
     }
    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	System.out.println(this+" is attacking "+ other);
    }
    public  void setName(String name){
	this.name = name;
    }
    public String getName(){
	return name;
    }
    public int getHealth(){
	return health;
    }
}
