public class Warrior extends Basechar{
    private int health=5000;
    // public Warrior(){
    //	setName("DEFAULT");
    // }
    public Warrior(String n){
	//if dont explicitly call super constructor - super();
	// as first line of our subclass constructor, Java will do 
	// it automatically
	//super();
	super(n);
	//setName(n); dont need to call if super consttructor does it
     }
    private int healthboost = 5;
     public void attack(Basechar other){
	 System.out.println(this.getName()+" is SUPERattacking "+ other.getName());
    }
    // public int getHealth(){
    //	return healthboost + super.getHealth();
    //}
}
