import java.util.*;
public class searching{
    Comparable[] stuff;
    public searching(int n){
	stuff= new Comparable[n];        
    }
    public void additem(Comparable item){
	int x=0;
	for (int y=0; y<stuff.length;y++){
	    if (stuff[y]==null){
	    	x=y;
		y=stuff.length;
	    }
	}
	stuff[x]=item;
    }
    public Comparable lsearch(Comparable item){
	for (int x=0; x<stuff.length;x++){
	    if (stuff[x].equals(item)){
		return stuff[x];
	    }
	}
	return null;
    }
    public Comparable bsearch(Comparable item){
	int high=stuff.length-1;
	int low=0;
	int split;
	while(low<=high){
	    split=(high+low)/2;
	    if (stuff[split].compareTo(item)==0){
		return stuff[split];
	    }
	    else if (stuff[split].compareTo(item)<0){
		low=split+1;
	    }
	    else{
		high=split-1;
	    }
	}
	return null;
    }
    public Comparable rbsearch(Comparable item, int high, int low){
	int split=(high+low)/2;
	
	if (low>high){
	    return null;
	}
	else if(stuff[split].compareTo(item)==0){
	    return stuff[split];
	}
	else if (stuff[split].compareTo(item)<0){
	    return rbsearch(item,high,split+1);
	}
	else{
	    return rbsearch(item,split-1,low);
	}
       
    }
	    
	
    
    public static void main(String[] args){
	searching test= new searching(1000000);
	Random r = new Random();
      	for (int x=0;x<test.stuff.length;x++){
	    test.additem(r.nextInt(50));
	}
        
	Arrays.sort(test.stuff);
	//System.out.println(Arrays.toString(test.stuff));
	//System.out.println(test.lsearch(12));
	//System.out.println(test.rbsearch(5,test.stuff.length-1,0));
	//	System.out.println(test.bsearch(5));
	if (args[0].equals("l")){
	    test.lsearch(12);
	}
	else if (args[0].equals("b")){
	    test.bsearch(12);
	}
		
        
    }
}
