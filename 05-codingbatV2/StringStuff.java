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
	}
	else {
	    result = Math.abs(n-21);
	    return result;
	}
    }
    //nearHundred
    public boolean nearHundred(int n) {
	if (Math.abs(200 -n)<=  10)
	    return true;
	else if (Math.abs(100 -n) <= 10)
	    return true;
	else return false;
    }
    
    //mixStart
    public boolean mixStart(String str) {
	
	if (str.length() < 3) return false;  
	
	String two = str.substring(1, 3);
	
	if (two.equals("ix")) {
	    return true;
	} else {
	    return false;
	}
    }
    
    //TeaParty
    public int teaParty(int tea, int candy) {
	if (tea <5 || candy <5)
	    return 0;
	else if ((tea <= 0.5*candy) || (candy <= 0.5*tea))
	    return 2;
	else return 1;
	
    }
    
    // lastDigit
    public boolean lastDigit(int a, int b, int c) {
	int lasta = a%10;
	int lastb = b%10;
	int lastc = c%10;
	if (lasta == lastb && lastb == lastc)
	    return true;
	else if (lasta == lastb)
	    return true;
	else if (lasta == lastc)
	    return true;
	else if (lastb == lastc)
	    return true;
	else return false;
    }
}

    
    
