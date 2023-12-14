package menu;

import battle.Battle;
import battle.Team;
import droids.Droid;
import droids.DroidList;

import java.util.ArrayList;
import java.util.*;

public class Battle3x3Menu extends Menu{
    public static void start(){
        int inp;
        ArrayList<Droid> droidList = new ArrayList<Droid>(DroidList.getDroidList());
        System.out.println(DroidList.toStr());

        System.out.println("Choose first droid for TEAM1");
        inp = getNumberInRange(1,droidList.size());
        Droid droid1Team1 = droidList.get(inp-1);// droidList.get(0));

        System.out.println("Choose second droid for TEAM1");
        inp = getNumberInRange(1,droidList.size());
        Droid droid2Team1 = droidList.get(inp-1);// droidList.get(0));

        System.out.println("Choose second droid for TEAM1");
        inp = getNumberInRange(1,droidList.size());
        Droid droid3Team1 = droidList.get(inp-1);// droidList.get(0));
        Team team1 = new Team(droid1Team1.clone(),droid2Team1.clone(),droid3Team1.clone());

        System.out.println("Choose first droid for TEAM2");
        inp = getNumberInRange(1,droidList.size());
        Droid droid1Team2 = droidList.get(inp-1);// droidList.get(0));

        System.out.println("Choose second droid for TEAM2");
        inp = getNumberInRange(1,droidList.size());
        Droid droid2Team2 = droidList.get(inp-1);// droidList.get(0));

        System.out.println("Choose second droid for TEAM2");
        inp = getNumberInRange(1,droidList.size());
        Droid droid3Team2 = droidList.get(inp-1);// droidList.get(0));
        Team team2 = new Team(droid1Team1.clone(),droid2Team1.clone(),droid3Team1.clone());

        Battle battle = new Battle(team1, team2);
        battle.start();

    };
}
