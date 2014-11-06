import java.io.*;
import java.util.*;

public class Mode {

		/*----------- Instance Variables --------*/
		int[] a;
		Random r;

		
		/*----------- Constructors --------*/
		public Mode() {
				this(20,100);
		}

		public Mode(int n) {
				this(n,100);
		}

		/*
			n - size of the array
			m - max value for each element
		*/
		public Mode(int n,int m){
				r = new Random();
				a = new int[n];
				for (int i=0;i<n;i++){
						a[i] = r.nextInt(m);
				}
		}

    /*
		public int mode(){
				int modeSoFar=a[0],
						modeCount=freq(a[0]);
				
				for (int i=0;i<a.length;i++){
						if (freq(a[i])>modeCount){
								modeSoFar = a[i];
								modeCount = freq(a[i]);
						}
				}
				/* just for testing purposes */
    /*	System.out.println("Modecount: "+modeCount);
				return modeSoFar;
		}*/
    public int maxVal(int[] a){
	int result=0;
	for (int i=0; i<a.length;i++){
	    if (a[i]>result){
		result=a[i];
	    }
	}
	return result;
    }
    public int maxIndex(int[] a){
	int result=0;
	for (int i=0; i<a.length;i++){
	    if (a[i]>a[result]){
		result=i;
	    }
	}
	return result;
    }
    public int mode(){
	int result=a[0];
	int counter=0;
	int[] holder = new int[maxVal(a)+1];
	for (int x =0; x<holder.length;x++){
	    holder[x]=0;
	}
	for (int y = 0;y<holder.length;y++){
	    holder[y]=freq(y, holder);
	}
	for (int z = 0;z<holder.length;z++){
	    if (holder[z]>counter){
		counter=holder[z];
		result=z;
	    }
	}
	return result;
    }
	     
    public int fastmode(){
	int mv = maxVal(a);
	int[] tallies = new int[mv+1];
	//by default java intialies array with all 0s
	for(int i=0;i<a.length; i++){
	    tallies[a[i]]+=1;
	}
	/*	for (int i=0;i<a.length;i++){
	    System.out.print(a[i] +",");
	}
	for (int i=0;i<tallies.length;i++){
	    System.out.println(i+": "+tallies[i]);
	    }*/
	int mi=maxIndex(tallies);
	System.out.println("Mode Count: "+tallies[mi]);
	return mi;
    }
    

		
		/*----------- methods --------*/

		public String toString() {
				String s = "";
				for (int i=0;i<a.length;i++)
						s = s  + a[i]+", ";
				return s;
		}

	    public int freq(int n, int[] b){
				int count = 0;
				for (int i=0;i<b.length;i++){
						if (b[i] == n){
								count = count + 1;
						}
				}
				return count;
		}
		/*----------- main --------*/

		public static void main(String[] args) {
				int arraylength=20,
						maxvalue=20;

				if (args.length > 0) {
						arraylength = Integer.parseInt(args[0]);
				}
				if (args.length > 1) {
						maxvalue = Integer.parseInt(args[1]);
				}
				
				Mode m = new Mode(arraylength,maxvalue);
					System.out.println(m);
				System.out.println("Mode value: "+m.fastmode());
		}

}
