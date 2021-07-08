import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection{
	ArrayList<String> players=new ArrayList<String>();
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String lowwercaseInput=input.nextLine().toLowerCase();
		//String lowwercaseInput=input.toLowerCase();
		System.out.println("press A to add player");
		System.out.println("press B to Display 2 best batmans");
		System.out.println("press C to Display 2 best bowlers");
		System.out.println("press D to Display 2 best keeper");
		player(lowwercaseInput);
	} 

	public static String player(String input){
		switch(input){
			case "a":
				System.out.println("press a to add player");
			case "b":
				System.out.println("press b to add player");
			case "c":
				System.out.println("press c to add player");
			default:
				System.out.println("Try again...");

		}
	}
}