public class twod{
    public static void main(String args[]){
	int[][] a; // array of array. 2d. int array with int array
	a= new int[5][3];
	System.out.println(a.length);
	System.out.println(a[0].length);
	// either 5 across 3 down or 5 down 3 across
	a[4][1]=2;
	a[1][2]=9;
	for (int i=0; i<a.length;i++){
	    for (int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
	System.out.println();
	System.out.println();
	a[2]=new int[30];
	for (int i=0; i<a.length;i++){
	    for (int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
	/*wordsearch
	2d array
	wordlist
	generate puzzle 
	fill from wordlist with different orientations
	fill rest with random letters
	*/
	
    }
}
