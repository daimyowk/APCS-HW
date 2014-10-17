import java.util.*;
public class baseChar{
    private String name="DEFAULT";
    private int Health=30;
    private int attack=5;
    private int defense=5;
    private int dexterity=5;
    private int mana=0;
    public void attacking(baseChar other){
	Random rand = new Random();
	int n = rand.nextInt(attack+2)+attack-2;
	System.out.println(n);
    }
}
	
	
	
