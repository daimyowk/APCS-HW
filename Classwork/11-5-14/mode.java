public class mode(){
    private int[] a;
    public mode(int n, int m){
       	a = new int[n];
	rnd = new Random();
	for (int i=0;i<a.length;i++){
	    a[i] =rnd.nextInt(m);
        }
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
}
