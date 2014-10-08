public class Warrior extends Basechar{
    //private int health=5000;
    private int healthboost = 5;
     public void attack(Basechar other){
	System.out.println(this.getName()+" is SUPERattacking "+ other.getName();
    }
    public int getHealth(){
	return healthboost + super.getHealth();
    }
}
