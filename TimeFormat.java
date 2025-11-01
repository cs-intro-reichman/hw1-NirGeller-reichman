// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		if (hours == 13) 
		{
			if (minutes < 10) {
				System.err.println("1" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("1" + ":" + minutes + " PM");	

		}
		else if (hours == 14) 
		{
			if (minutes < 10) {
				System.err.println("2" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("2" + ":" + minutes + " PM");	

		}
		else if (hours == 15) 
		{
			if (minutes < 10) {
				System.err.println("3" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("3" + ":" + minutes + " PM");	

		}
		else if (hours == 16) 
		{
			if (minutes < 10) {
				System.err.println("4" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("4" + ":" + minutes + " PM");	

		}
		else if (hours == 17) 
		{
			if (minutes < 10) {
				System.err.println("5" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("5" + ":" + minutes + " PM");	

		}
		else if (hours == 18) 
		{
			if (minutes < 10) {
				System.err.println("6" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("6" + ":" + minutes + " PM");	

		}
		else if (hours == 19) 
		{
			if (minutes < 10) {
				System.err.println("7" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("7" + ":" + minutes + " PM");	

		}
		else if (hours == 20) 
		{
			if (minutes < 10) {
				System.err.println("8" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("8" + ":" + minutes + " PM");	

		}
		else if (hours == 21) 
		{
			if (minutes < 10) {
				System.err.println("9" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("9" + ":" + minutes + " PM");	

		}
		else if (hours == 22) 
		{
			if (minutes < 10) {
				System.err.println("10" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("10" + ":" + minutes + " PM");	

		}
		else if (hours == 23) 
		{
			if (minutes < 10) {
				System.err.println("11" + ":" + "0" + minutes + " PM");
			}
			else
		System.err.println("11" + ":" + minutes + " PM");	

		}
		else if (9<hours && hours<13) {
			if (minutes < 10) {
				System.err.println(hours + ":" + "0" + minutes + " AM");
			}
			else 
			System.err.println(hours + ":" + minutes + " AM");
			
		}
		else if (hours > 0 && hours < 10)
		{
			if (minutes < 10) {
				System.err.println(hours + ":" + "0" + minutes + " AM");
			}
			else 
			System.err.println(hours + ":" + minutes + " AM");
		}
		else if (hours == 0) {
			if (minutes < 10) {
				System.err.println("0" + ":" + "0" + minutes + " AM");
			}
			else {
				
			System.err.println("0" + ":" + minutes + " AM");
			}
			

			
		}

				
	
		if (hours == 24) {
			if (minutes < 10) {
				System.err.println("0" + ":" + "0" + minutes + " AM");
			}
			else {
				
			System.err.println("0" + ":" + minutes + " AM");
			}
		}	
	}
} 
