public class Driver{
    public static void main(String args[]){
	String[] input = {"fj","ac","agh","wag","aiuhw","li","awh","hdf","more",
			  "words","crazy","tree","stupid","waste","money","ball"
			  ,"water","polo","bridge","steam","ice","fire","cards",
			  "argument","agenda","gender","swimming","failure",
			  "buzzkill","supersupalong","greetings","league","card"
			  ,"order","cute","happy","mad","long","short","high",
			  "low","super","wack","you","gmail","mail","blog",
			  "final","exam","find","search","save","redo","cut",
			  "open","close","face","book","homework","crunchy",
			  "sushi","bento","seven","sword","armor","magic",
			  "comics","book","novel","nobel","noble","DNA",
			  "science","chinese","bagel","donut","language"};
	Sarray tester=new Sarray(input);
	//System.out.println(tester);
	//	tester.isort();
	//	System.out.println(tester);*/
	//	System.out.println(tester);
	//	tester.ssort();
	//	System.out.println(tester);*/
	//System.out.println(tester);
	//	tester.bsort();
	//	System.out.println(tester);
	if (args[0].equals("i")){
	   tester.isort();
	  
	}
	else if(args[0].equals("s")){
	    tester.ssort();
	}
	else if(args[0].equals("b")){
	   tester. bsort();
	   }
    }
}
