
public class Player{

    private String name;
    private int age;
    private String type;
    private int playerruns;
    private int playerwickets;


    public Player(String name, int age, String type, int playerruns,int playerwickets){
        this.name = name;
        this.age = age;
        this.type = type;
        this.playerruns = playerruns;
        this.playerwickets = playerwickets;
    }

    public int getBattingAvg(){
        int avg=playerruns/15;
        return avg;
    }

    public int getBowlingAvg(){
        int avg=playerwickets/15;
        return avg;
    }

    public void playerDetails(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Type"+type);
        System.out.println("Statistics");
        System.out.println("Runs"+playerruns);
        System.out.println("Wickets"+playerwickets);
    }
    
    public void getBestPerformence(){
        System.out.println("Best Runs :"+playerruns);
        System.out.println("Most Wickets :"+playerwickets);
    }

    public String getname(){
        return name;
    }

    public String gettype(){
        return type;
    }

    public int getage(){
        return age;
    }

    public int getruns(){
        return playerruns;
    }

    public int getwickets(){
        return playerwickets;
    }
    
}

