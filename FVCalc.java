// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentvalue = args[0];
		String interest = args[1];
		String years = args[2];
		double interstnum = Double.parseDouble(interest)/100.0;
		double currentvaluenum = Double.parseDouble(currentvalue);
		int yearsnum = Integer.parseInt(years);
		double futurevalue =currentvaluenum* Math.pow((1.0 + interstnum),yearsnum);
		System.out.println("after " + years + " years, $" + currentvalue + " saved at " + interest + ".0% will yeald $" + (int) futurevalue);
	}
}