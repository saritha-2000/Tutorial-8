import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection{
	ArrayList<String> players=new ArrayList<String>();
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args){
		String lowwercaseInput=input.nextLine().toLowerCase();
		//String lowwercaseInput=input.toLowerCase();
		System.out.println("press A to add player");
		System.out.println("press B to Display 2 best batmans");
		System.out.println("press C to Display 2 best bowlers");
		System.out.println("press D to Display 2 best keeper");
		player(lowwercaseInput);
	} 

	public static void player(String input){
		System.out.println(input);
		System.out.println("Enter player ");
		System.out.println("Name	:");
		String name=input.nextLine();
        System.out.println("Age 	:");
        String name=input.nextInt();
        System.out.println("Type 	:");
        int name=input.nextLine();
        System.out.println("Statistics :");
        String name=input.nextLine();


		switch(input){
			case "a":
				getPlayerType();
				Player ply1=new player(name, age, type, statistics);
				//System.out.println("press a to add player");
				break;
			case "b":
				getBestPerformence();
				//System.out.println("press b to add player");
				break;
			case "c":
				getBestPerformence();
				//System.out.println("press c to add player");
				break;
			case "v":
				playerDetails();
				//System.out.println("press c to add player");
				break;
			default:
				System.out.println("Try again...");

		}
	}

	public String best2player(){
			
	}
}