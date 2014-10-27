import java.util.*;
import java.io.*;
public class stuff{
    public int[] test(){
	int[] result = new int[100];
	for(int x=0;x<100;x++){
	    random y = new Random();
	    int addant = 75 + y.nextInt(75);
	    result[x] = addant;
	}
	return result;
    }
}
