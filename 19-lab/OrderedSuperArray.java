public class OrderedSuperArray extends Sarray{
    public OrderedSuperArray(String[] stuff){
	super(stuff);
    }
    public void add(int index, String i){
	System.out.println("Extra parameter. Expected: String");
	return;
    }
    public boolean add(String i){
	int index=-1; //states i larger than everything
	for (int x=0;x<data.length-1;x++){
      	    int y=0;
	    int z=0;
	    while (data[x].charAt(y)==i.charAt(y)){
		y++;
	    }
	    while (data[x+1].charAt(z)==i.charAt(z)){
		z++;
	    }
	    if ((int)i.charAt(y)>(int)data[x].charAt(y) && (int)i.charAt(z)<(int)data[x+1].charAt(z)){
		index=x+1;
	    }
	    
	}
	System.out.println(index);
	return true;
    }
}
