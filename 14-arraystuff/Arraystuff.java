import java.util.*;
public class Arraystuff{
    private int[] a;
    Random rnd;
    // private final int x = 123; no allow change but can use
    //final set once but never change
    public Arraystuff(int n){
	a = new int[n];
	rnd = new Random();
	for (int i=0;i<a.length;i++){
	    a[i] =75 + rnd.nextInt(76);
        }
	/*a = new int[4];
	a[0]=1;
	a[1]=2;
	a[2]=52;
	a[3]=1;
	*/
    }

    public Arraystuff(){
	/*	a = new int[100];
	rnd = new Random();
	for (int i=0;i<a.length;i++){
	a[i] =75 + rnd.nextInt(76);*/
	this(100);
    }

    public String toString(){
	String s= "";
	for (int i = 0; i<a.length;i++){
	    s = s+ a[i]+",";
	}
	return s;
    }
    public int find(int n){
	int result=-1;
	for (int i=0; i<a.length;i++){
	    if (a[i]==n){
		 result=i;
		 return result;
	    }
	}
	return result;
    }
    public int maxVal(){
	int result=0;
	for (int i=0; i<a.length;i++){
	    if (a[i]>result){
		result=a[i];
	    }
	}
	return result;
    }
    public int freq(int i){
	if (i>=a.length){
	    return -1;
	}
	int result=0;
	for (int x=0; i<a.length; i++){
	    if (a[x]==a[i]){
		result++;
	    }
	}
	return result;
    }
    public int sum67(int[] nums) {
	int sum=0;
	for (int i = 0; i <nums.length; i++){
	    if (nums[i]!=6){
		sum+= nums[i];
	    }
	    else{
		for(int j=i; j <nums.length;j++){
		    if (nums[j]==7){
			i=j;
			break;
		    }
		}
	    }
	}
	return sum;
    }

    public static void main(String[] args){
	Arraystuff as = new Arraystuff(300);
	System.out.println(as);
	System.out.println(as.find(86));
	System.out.println(as.maxVal());
	System.out.println(as.freq(0));
    }
}
    