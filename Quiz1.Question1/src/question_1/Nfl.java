package question_1;
import java.util.Scanner;

public class Nfl {
	public static void main(String args []) {
		Scanner user_input = new Scanner(System.in);
		
		//Get player stats
		System.out.print("Input player's total touch downs: ");
		Double td = user_input.nextDouble();
		
		System.out.print("Input player's total yards: ");
		Double yards = user_input.nextDouble();
		
		System.out.print("Input player's total interceptions: ");
		Double interceptions = user_input.nextDouble();
		
		System.out.print("Input player's total completions: ");
		Double comp = user_input.nextDouble();
		
		System.out.print("Input players total passes attempted: ");
		Double att = user_input.nextDouble();
		
		user_input.close();
		
		//Compute passer rating
		Double a = (((comp/att) - .3) * 5);
		Double b = (((yards/att) - 3) * .25);
		Double c = ((td/att) * 20);
		Double d = (2.375 - ((interceptions/att) * 25));
		
		Double passer_rating = ((a + b + c + d)/6) * 100;
		
		//Display passer rating
		System.out.println("Passer rating = " + passer_rating);				
	}//end main
}//end Nfl
