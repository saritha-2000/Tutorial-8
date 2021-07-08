public class Player {                
    String name;
    int ID;
    String type;
    int age;
    double PlayerAvg;
    int NumberOfWickets;
    int TotalRuns;
    int BestScore;
    int MatchesPlayed;


    public Player(String name, int ID, String type, int age, double PlayerAvg, int NumberOfWickets, int TotalRuns, int BestScore, int MatchesPlayed){
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.age = age;
        this.PlayerAvg = PlayerAvg;
        this.NumberOfWickets = NumberOfWickets;
        this.TotalRuns = TotalRuns;
        this.BestScore = BestScore;
        this.MatchesPlayed = MatchesPlayed;
    }
    void playeraverage(){
        PlayerAvg = TotalRuns/MatchesPlayed;
        System.out.println("Average :"+PlayerAvg);
    }
    void getplayerdetails(){
        System.out.println("Player Name :"+name);
        System.out.println("Player Age :"+age);
        System.out.println("Player Type :"+type);
    }
    void bestperformance(){
        System.out.println("Best Score :"+BestScore);
        System.out.println("Most Wickets :"+NumberOfWickets);
    }
}