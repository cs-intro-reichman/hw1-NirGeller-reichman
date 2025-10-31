// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String inputnum= args[0];
		int thenumber = Integer.parseInt(inputnum);
		int hundreds = thenumber/100;
		
		int secondstep = thenumber-(hundreds*100);
		int tens= secondstep/10;
		int units= secondstep-(tens*10);
		System.out.println(hundreds +" hundreds, "+ tens +" tens, "+ "and " + units +" ones");
		

	}
}
