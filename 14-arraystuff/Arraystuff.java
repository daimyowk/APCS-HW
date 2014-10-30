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
    public boolean more14(int[] nums) {
	int one=0;
	int four=0;
	for (int i=0; i<nums.length; i++){
	    if (nums[i]==1){
		one+=1;
	    }
	    else if (nums[i]==4){
		four+=1;
	    }
	}
	if(one>four){
	    return true;
	}
	else return false;
    }
    public int[] tenRun(int[] nums) {
	int j;
	for (int i=0; i<nums.length; i++){
	    if (nums[i]%10==0){
		for (j=i+1; j<nums.length && nums[j]%10!=0;j++){
		    nums[j]=nums[i];
		}
		i=j-1;
	    }
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	for (int i =0; i<nums.length-2;i++){
	    if( nums[i]==nums[i+1]-1){
		if (nums[i]==nums[i+2]-2){
		    return true;
		}
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	
	for(int i=0; i<nums.length;i++){
	    int first=0;
	    int second=0;
	    for (int a=i; a>=0; a--){
		first+=nums[a];
	    }
	    for (int b=i+1; b<nums.length;b++){
		second+=nums[b];
	    }
	    System.out.println(first);
	    System.out.println(second);
	    System.out.println();
	    if (first==second){
		return true;
	    }
	}
	return false;
}
    public int[] seriesUp(int n) {
	int[] result= new int[n*(n+1)/2];
	int a=0;
	while(a<result.length){
	    for (int x=1; x<=n;x++){
		for (int y=1;y<=x;y++){
		    
		    result[a]=y;
		    a++;
		    
		    
		    
		}
	    }
	}
	return result;
    }

    public static void main(String[] args){
       	Arraystuff as = new Arraystuff(300);
	System.out.println(as);
	System.out.println(as.find(86));
	System.out.println(as.maxVal());
	System.out.println(as.freq(0));
	int[] tester = {1, 1, 1, 2, 1};
	System.out.println(as.canBalance(tester));
    }
}
    
