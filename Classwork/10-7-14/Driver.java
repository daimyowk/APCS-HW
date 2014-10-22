public class Driver{
    public static void main(String[] args){
	/*
	Basechar c= new Basechar();
	Warrior w=new Warrior();
	Mage m = new Mage();
	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());
	System.out.println(m.getManna());

	Basechar c2;
	Warrior w2;
	Mage m2;

	//no work w2=m;
	//no work w2=c;
	c2=w;
	System.out.println(c2.getHealth());

	c2=m;//doesnt know have getManna. superclass cant see subclass
	System.out.println(c2.getHealth());
	System.out.println(((Mage)c2).getManna());

	w.setName("Groo");
	m.setName("Mr. Sage");
	w.attack(m);
	m.attack(w);
	w.attack(w);
	*/
	
	Warrior w= new Warrior("groo");
	System.out.println(w.getHealth());
	//	Warrior w2= new Warrior();
	//System.out.println(w2);
	    
    }
}
