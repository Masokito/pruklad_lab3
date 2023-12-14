package battle;
import java.util.ArrayList;
import java.util.List;
import droids.*;


public class Team {
   private List<Droid> teamList = new ArrayList<>();


    public Team (Droid droid) {
        teamList.add(droid);
    }

    public Team (Droid droid1,Droid droid2,Droid droid3) {
        teamList.add(droid1);
        teamList.add(droid2);
        teamList.add(droid3);
    }


   public void addToList (Droid droid) {
       teamList.add(droid);
   }

   public boolean isAlive(){
        for(Droid droid: teamList){
            if(droid.getHealth() <= 0){
                return false;
            }
        }
        return true;
   }





    public List<Droid> getTeamList () {
        return teamList;
    }
    public String toString () {
        String str = "";
        int i = 0;
        for(Droid droid : teamList){
            i++;
            str += "\n" + i +")  " + droid.toString();
        }
        return str;
    }

}
