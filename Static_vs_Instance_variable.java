class Player{
    public int run = 0;  //instance variable
    public int team_Run =0 ; //instance variable
    public static int teamRun =0;  //static variable

    public void hit_four(){
        run += 4;
        team_Run += 4;
        teamRun += 4;
    }

    public void hit_six(){
        run += 6;
        team_Run += 6;
        teamRun += 6;
    }
}

public class Static_vs_Instance_variable {
    static void main(String[] args) {
        System.out.println("Team run: " + Player.teamRun);
        Player p1 = new Player();
        Player p2 = new Player();

        p1.hit_four();
        p1.hit_six();
        p2.hit_six();

        System.out.println("player 1 run: " + p1.run); //10
        System.out.println("player 2 run: " + p2.run); //6
        System.out.println("team_run in instance var: " + p1.team_Run); //10 -> player1 run
        System.out.println("team_run in instance var: " + p2.team_Run); //6 -> player2 run
        System.out.println("Team run: " + Player.teamRun); //16
    }
}
