// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name = args[0];
	    String name1 = args[1];
		String name2 =args [2];
		String bill =args[3];
		int totalbill= Integer.parseInt(bill);

	    
		double eachbill = totalbill / 3.0;
	    eachbill=Math.ceil(eachbill);
		System.out.println("Dear " +name2 +", "+ name1 + ", and " + name + ": pay " +eachbill +" Shekels each.");
		


	}
}
