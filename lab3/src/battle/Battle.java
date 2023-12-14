package battle;

import java.util.ArrayList;
import java.util.List;
import droids.*;

public class Battle {


    static List<String> frames = new ArrayList<>();
    String frame;
    static String message = "";
    Team team1,team2;
    //static int teamsSize = 3;

    public static List<String> getFrames(){
        return frames;
    }



    void printFrame(String frame){
        System.out.println(frame);
    }

    String generateFrame(){
        String str = "Team1 team:\n"+
                      team1.toString()+
                      "\nTeam2 team:\n"+
                      team2.toString()+
                      "\n" + message;
        return str;
    }




    public Battle(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
       // this.teamsSize = team1.getTeamList().size();
        System.out.println("Battle has begun");
    }

    static public void setMessage(String str){
        message = str;
    }

    public void start() {
        List<Droid>team1List = team1.getTeamList();
        List<Droid>team2List = team2.getTeamList();
        while(true) {
            team1List.removeIf(n -> (n.getHealth() <= 0));
            team2List.removeIf(n -> (n.getHealth() <= 0));

            if(team1List.size() == 0){
                System.out.println("TEAM 2 WINS CONGRATULATIONS");
                break;
            }

            if(team2List.size() == 0){
                System.out.println("TEAM 1 WINS CONGRATULATIONS");
                break;
            }

            for(Droid droid: team1.getTeamList()){
                this.frame = generateFrame();
                printFrame(frame);
                this.frames.add(this.frame);
                droid.startDroidMenu(team1List,team2List);
        }
            for(Droid droid: team2.getTeamList()){
                this.frame = generateFrame();
                printFrame(frame);
                this.frames.add(this.frame);
                droid.startDroidMenu(team2List,team1List);
    }
}
    }
}

