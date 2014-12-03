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
	int a=0;
	if (data[0].charAt(a)==i.charAt(a)){
	    a++;
	}
	if (data[0].charAt(a)>i.charAt(a)){
	    index=0;
	    System.out.println(index);
	    return true;
	}
	else{
	    boolean biggerthanlast=false;
	    //boolean smallerthancurrent;
	for (int x=1;x<data.length;x++){
      	    int y=0;
	    //doesnt work if i is smaller than what is being checked
	    boolean holder=true;
	    while (data[x].charAt(y)==i.charAt(y) && holder){
		y++;
		if (y>data[x].length()-1){
		    biggerthanlast=true;
		    holder=false;
		    y--;
		}
		if (y>i.length()-1){
		    holder=false;
		    
		    y--;
		}
	    }
	    
		
	    if (biggerthanlast){
		 holder=true;
		while (data[x].charAt(y)==i.charAt(y) && holder){
		    y++;
		    if (y>data[x].length()-1){
			biggerthanlast=true;
			holder=false;
			y--;
		    }
		    if (y>i.length()-1){
			holder=false;
			
			y--;
		    }
		}
		if ((int)i.charAt(y)<(int)data[x].charAt(y)){
		    index=x;
		    break;
		}
	    }
	    if ((int)i.charAt(y)>(int)data[x].charAt(y)){
		biggerthanlast=true;
	    }
	}
	}
	System.out.println(index);
	return true;
    }
}
    
	    /*
	    while (data[x+1].charAt(z)==i.charAt(z)){
		z++;
	    }
	    if ((int)i.charAt(y)>(int)data[x].charAt(y) && (int)i.charAt(z)<(int)data[x+1].charAt(z)){
		index=x+1;
		}*/
	    
    
