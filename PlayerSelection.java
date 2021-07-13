import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection{
    static ArrayList<Player> players=new ArrayList<Player>();
    static Scanner input=new Scanner(System.in);
    static boolean running=true;
    public static void main(String[] args){
		//String lowwercaseInput=input.toLowerCase();
    while(running){
	menu();
	}
    } 

    public static void menu(){
	System.out.println("press A to add player");
	System.out.println("press V to View All players");
	System.out.println("press B to Display 2 best batmans");
	System.out.println("press C to Display 2 best bowlers");
	System.out.println("press D to Display 2 best keeper");
	System.out.println("press Q to Exit");
	String lowwercaseInput=input.nextLine().toLowerCase();
	player(lowwercaseInput);
    }

    public static void player(String input){
	switch(input){
	case "a"://add player
            addplayer();
            break;
        case "b"://Display 2 best batmans
            viewbest2battmen();
            break;
	case "c"://Display 2 best bowlers
            viewbest2bowler();
            break;
	case "d"://Display 2 best keeper
            viewbest2bowler();
            break;
	case "v"://View All players
            viewplayerDetails();
            break;
	case "q":
            running=false;
            break;
	default:
            System.out.println("Try again...");

	}
    }

    public static void addplayer(){
	System.out.println("Enter player ");

	System.out.print("Name	   :");
	String playername=input.nextLine();

	System.out.print("Age 	   :");
	int playerage=input.nextInt();
        
        int typeindex;
        do{
            System.out.println("Choose the player type...");
            System.out.println("1:Spin Bowler");
            System.out.println("2:Seam Bowler");
            System.out.println("3:Batsman");
            System.out.println("4:Keeper");

            System.out.print("Type 	   :");
            typeindex=input.nextInt();
        }while(typeindex>5);
	String playerType=setPlayerType(typeindex);

	System.out.println("Statistics :");
	System.out.print("Enter player runs: ");
       	int runs = input.nextInt();

       	System.out.print("Enter player wickets: ");
       	int wickets = input.nextInt();

	Player player=new Player(playername, playerage, playerType, runs ,wickets);
	players.add(player);
        System.out.println("Player added.");
	}

	public static void viewplayerDetails(){
		for (int i=0;i<players.size();i++){
			System.out.println(players.get(i));
		}
	}

    public static void viewbest2bowler(){
        int plyer1id=0;
        int player2id=1;
        int ply1=players.get(0).getwickets();
        int ply2=players.get(1).getwickets();
        for (int i=0;i<players.size();i++){
        int tempruns=players.get(i).getruns();
            if (ply1<tempruns){
                ply2=ply1;
                ply1=tempruns;

                player2id=plyer1id;
                plyer1id=i;
            }
        }
        System.out.println("Best batman 1: "+players.get(plyer1id).getname()+" wickets : "+ply1);
        System.out.println("Best batman 2: "+players.get(player2id).getname()+" wickets : "+ply2);
    }

    public static void viewbest2battmen(){
        int plyer1id=0;
        int player2id=1;
        int ply1=players.get(0).getruns();
        int ply2=players.get(1).getruns();
        for (int i=0;i<players.size();i++){
        int tempruns=players.get(i).getruns();
            if (ply1<tempruns){
                ply2=ply1;
                ply1=tempruns;

                player2id = plyer1id;
                plyer1id=i;
            }
        }
        System.out.println("Best Bowler 1: "+players.get(plyer1id).getname()+" runs : "+ply1);
        System.out.println("Best Bowler 2: "+players.get(player2id).getname()+" runs : "+ply2);
        }

    private static String setPlayerType(int choose) {
        String plytype="";
        switch(choose){
            case 1:
                plytype="Spin Bowler";
                break;
            case 2:
                plytype="Seam Bowler";
                break;
            case 3:
                plytype="Batsman";
                break;
            case 4:
                plytype="Keeper";
                break;
        }return plytype;
    }
}
