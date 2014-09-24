public class StringStuff{
    //Question1
    public String nonStart(String a, String b) {
	String partone = a;
	String parttwo = b;
	if (a.length() == 1) {
	    partone = "";
	} else {
	    partone = a.substring(1);
	}
	if (b.length() == 1) {
	    parttwo = "";
	} else {
	    parttwo = b.substring(1);
	}
	String combine = partone + parttwo;
	return combine;
    }
    //Question 2
    public String makeAbba(String a, String b) {
	String done = a + b + b + a;
	return done;
    }
    //Question 3
    public int diff21(int n) {
	int result=0;
	if (n > 21){
	    result = 2*Math.abs(n-21);
	    return result;
	} else {
	    result = Math.abs(n-21);
	    return result;
	}
    }
}

    
    
