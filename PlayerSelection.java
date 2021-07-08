import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection{
	ArrayList<String> players=new ArrayList<String>();
	public Static main(String[] arg){
		Scanner input=new Scanner(System.in);
		player(input);
	} 

	public Static String player(String input){
		System.out.println("press A to add player");
		System.out.println("press B to Display 2 best batmans");
		System.out.println("press C to Display 2 best bowlers");
		System.out.println("press D to Display 2 best keeper");
	}
}