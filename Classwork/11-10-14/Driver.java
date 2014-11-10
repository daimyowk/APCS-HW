public class Driver {
    public static void main(String[] args){
	//exception errors
	//int[] a = new int[5];
	//	a[33]=20;
	Eexample ee= new Eexample();
	System.out.println("Before the error test");
	try {
	    ee.etest(11);
	    System.out.println("call to etest finished");
	} catch (IndexOutOfBoundsException e){
	    System.out.println("IOB crashed with: "+e);
	} catch (ArithmeticException e){
	    System.out.println("AIOB crash with: " + e);
	} catch (Exception e){
	    System.out.println("Catchall at the end: "+e);
	}
	System.out.println("After the error test");
    }
}
