import java.io.*;
import java.util.*;
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
    /*if adding word left to right and word goes beyond, sets col to first possible column that can fit the word. same applies if adding right to left, moves it right until first possible column
     if row input is too big and goes beyond, sets row to last row
     if row input is negative, sets row to be first row
     after correcting column issue checks if overlap. if illegal overlap then
     stops and returns message
     */
    public ArrayList<String> ReadFile(){
	ArrayList<String> result = new ArrayList<String>();
	try{
	Scanner sc=new Scanner(new File("words.txt"));
	while (sc.hasNext()){
	    String s=sc.next();
	    result.add(s);
	}
	}
	catch(Exception e){
	    System.out.println("File not found");
	    System.exit(0);
	}
	return result;
    }
    public void FillIn(){
	for (int x=0;x<ReadFile().size();x++){
	    addWord(ReadFile().get(x));
	}
    }
    public boolean addWord(String w){
	Random r = new Random();
	int row=r.nextInt(board.length);
	int col=r.nextInt(board[0].length);
	int direction=r.nextInt(8);
        
	if (direction==0){
	    addWordH("right",w,row,col);
	    //fixing of row and col to work only occurs in addWordH locally have to redo 
	    if ((w.length()+col)>board[0].length){
		col=board[0].length-w.length();
	    }
	    return !(illegalOverlap("right",w,row,col));
	}
	else if (direction==1){
	    addWordH("left",w,row,col);
	    if (col-(w.length())<0){
		col=w.length()-1;
	    }
	    return !(illegalOverlap("left",w,row,col));
	}
	else if (direction==2){
	    addWordV("up",w,row,col);
	    if((row-w.length())<0){
		row=w.length()-1;
	    }
	    return !(illegalOverlap("up",w,row,col));
	}
	else if (direction==3){
	    addWordV("down",w,row,col);
	    if((w.length()+row)>board.length){
		    row=board.length-w.length();
		}
	    return !(illegalOverlap("down",w,row,col));
	}
	else if (direction==4){
	    addWordD("southwest",w,row,col);
	    if((w.length()+row)>board.length){
		    row=board.length-w.length();
		}
	    if (col-(w.length())<0){
		col=w.length()-1;
	    }
	    return !(illegalOverlap("southwest",w,row,col));
	}
	else if (direction==5){
	    addWordD("southeast",w,row,col);
	    if((w.length()+row)>board.length){
		    row=board.length-w.length();
		}
	    if ((w.length()+col)>board[0].length){
		col=board[0].length-w.length();
	    }
	    return !(illegalOverlap("southeast",w,row,col));
	}
	else if (direction==6){
	    addWordD("northeast",w,row,col);
	    if((row-w.length())<0){
		row=w.length()-1;
	    }
	    if ((w.length()+col)>board[0].length){
		col=board[0].length-w.length();
	    }
	    return !(illegalOverlap("northeast",w,row,col));
	}
	else if (direction==7){
	    addWordD("northwest",w,row,col);
	    if((row-w.length())<0){
		row=w.length()-1;
	    }
	    if (col-(w.length())<0){
		col=w.length()-1;
	    }
	    return !(illegalOverlap("northwest",w,row,col));
	}
	return false;
    }
    public boolean illegalOverlap(String dir, String w, int row, int col){
	boolean result=false;
	int c = col;
	int r = row;
	if (dir.equals("right")){
	    for (int i=0;i<w.length();i++){
		if(!(board[row][c]=='.' || board[row][c]==w.charAt(i))){
		    result=true;
		}
	        c++;
	    }
	}
	else if (dir.equals("left")){
	    for (int i=0;i<w.length();i++){
		if(!(board[row][c]=='.' || board[row][c]==w.charAt(i))){
		    result=true;
		}
	        c--;
	    }
	}
	else if (dir.equals("down")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][col]=='.' || board[r][col]==w.charAt(i))){
		    result=true;
		}
		r++;
	    }
	}
	else if (dir.equals("up")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][col]=='.' || board[r][col]==w.charAt(i))){
		    result=true;
		}
		r--;
	    }
	}
	else if (dir.equals("southwest")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    result=true;
		}
		r++;
		c--;
	    }
	}
	else if (dir.equals("southeast")){
	    for (int i=0;i<w.length();i++){
		if(!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    result=true;
		}
		r++;
		c++;
	    }
	}
	else if(dir.equals("northeast")){
	    for(int i=0;i<w.length();i++){
		if(!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    result=true;
		}
		r--;
		c++;
	    }
	}
	else if(dir.equals("northwest")){
	    for(int i=0;i<w.length();i++){
		if(!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    result=true;
		}
		r--;
		c--;
	    }
	}
	return result;
    }
   
	
    public void addWordD(String dir, String w, int row, int col){
	int r=row;
	int c=col;
	if (c>board[0].length){
	    c=board[0].length-1;
	}
	else if(col<0){
	    c=0;
	}
	if (r>=board.length){
	    r=board.length-1;
	}
	else if(r<0){
	    r=0;
	}
	if (dir.equals("southwest")){
	    if((w.length()+r)>board.length){
		    r=board.length-w.length();
		}
	    if (c-(w.length())<0){
		c=w.length()-1;
	    }
	    if (illegalOverlap(dir, w, r, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r++;
		c--;
	    }
	}
	if (dir.equals("southeast")){
	    if((w.length()+r)>board.length){
		    r=board.length-w.length();
		}
	    if ((w.length()+c)>board[0].length){
		c=board[0].length-w.length();
	    }
	    if (illegalOverlap(dir, w, r, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r++;
		c++;
	    }
	}
	if (dir.equals("northeast")){
	    if((r-w.length())<0){
		r=w.length()-1;
	    }
	    if ((w.length()+c)>board[0].length){
		c=board[0].length-w.length();
	    }
	    if (illegalOverlap(dir, w, r, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r--;
		c++;
	    }
	}
	if (dir.equals("northwest")){
	    if((r-w.length())<0){
		r=w.length()-1;
	    }
	    if (c-(w.length())<0){
		c=w.length()-1;
	    }
	    if (illegalOverlap(dir, w, r, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][c]=w.charAt(i);
		r--;
		c--;
	    }
	}
    }
    public void addWordV(String dir, String w, int row, int col){
	int r = row;
	if (col>board[0].length){
	    col=board[0].length-1;
	}
	else if(col<0){
	    col=0;
	}
	if (dir.equals("down")){
	    if(r<0){
		r=0;
	    }
	    if((w.length()+r)>board.length){
		    r=board.length-w.length();
		}
	    if (illegalOverlap(dir, w, r, col)){
		System.out.println("Cannot overlap at row"+r+" column"+col+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][col]=w.charAt(i);
		r++;
	    }
	}
	else {
	    if(r>=board.length){
		r=board.length-1;
	    }
	    if((r-w.length())<0){
		r=w.length()-1;
	    }
	    if (illegalOverlap(dir, w, r, col)){
		System.out.println("Cannot overlap at row"+r+" column"+col+" with " + w);
		return;
	    }
	    for(int i=0;i<w.length();i++){
		board[r][col]=w.charAt(i);
		r--;
	    }
	}
    }
    public void addWordH(String dir, String w, int row,int col){
	int c = col;
	if (row>=board.length){
	    row=board.length-1;
	}
	else if(row<0){
	    row=0;
	}
	if (dir.equals("right")){
	    if (c<0){
		c=0;
	    }
	    if ((w.length()+c)>board[0].length){
		c=board[0].length-w.length();
	    }
	    if (illegalOverlap(dir, w, row, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
	    }
	for (int i=0;i< w.length();i++){
	    board[row][c]=w.charAt(i);
	    c++;
	}
	}
	else{
	    if(c>board[0].length){
		c=board[0].length-1;
	    }
	    if (c-(w.length())<0){
		c=w.length()-1;
	    }
	    if (illegalOverlap(dir, w, row, c)){
		System.out.println("Cannot overlap at row"+row+" column"+c+" with " + w);
		return;
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
