public class wordsearch{
    private char[][] board;

    public wordsearch(int r, int c){
	board= new char[r][c];
	for(int i=0;i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		board[i][j]='.';
    }
	}
    }
    public wordsearch(){
	this(20,40);
    }
    public void addWordH(String dir, String w, int row,int col){
	int c = col;
	if (dir.equals("right")){
	    if ((w.length()+c)>board[0].length){
		c=board[0].length-w.length();
	    }
	for (int i=0;i< w.length();i++){
	    board[row][c]=w.charAt(i);
	    c++;
	}
	}
	else{
	    
	    if (c-(w.length())<0){
		c=w.length()-1;
	    }
	    for (int i=0;i< w.length();i++){
		board[row][c]=w.charAt(i);
		c--;
	    }
		
    }
    }
    public String toString(){
	String s="";
	for(int i=0;i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		s=s+board[i][j];
	    }
	    s = s+ "\n";
	}
	return s;
    }
}
