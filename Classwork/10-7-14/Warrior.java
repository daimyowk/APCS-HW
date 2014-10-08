public class Warrior extends Basechar{
    //private int health=5000;
    private int healthboost = 5;
    public int getHealth(){
	return healthboost + super.getHealth();
    }
}
