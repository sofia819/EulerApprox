import java.util.Scanner;

public class Control {
	
	public static void main(String[] args) {
		String ins = "Guide:\n";
		ins += "Approximation(x_start, y_start, h, n)\n";
		ins += "Change slope() in Approximation class\n";
		
		System.out.println(ins);
		System.out.print("Proceed? Y/N ");
		
		Scanner in = new Scanner(System.in);
		String input = in.next();
		if(input.equals("Y") || input.equals("y")) {
			Approximation apr = new Approximation(0, 100, 0.1, 20);
			System.out.println(apr);
		}
		else
			System.out.println("Please change slope function in Approximation.");
		
		
	}
	
	
}