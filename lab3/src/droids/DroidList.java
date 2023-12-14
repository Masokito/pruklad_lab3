package droids;
import java.util.ArrayList;


public class DroidList {
    static ArrayList<Droid> droidList = new ArrayList<>();
    public static void add(Droid droid){
        droidList.add(droid);
    }

    public static void createDefaultDroids(){
        Stormtrooper droid1 = new Stormtrooper("DefaultStormtrooper1",213,32,2,80,3);
        Stormtrooper droid2 = new Stormtrooper("DefaultStormtrooper2",200,21,3,45,2);
        Stormtrooper droid3 = new Stormtrooper("DefaultStormtrooper2",140,42,3,95,2);
        Healer droid4 = new Healer("DefaultHealer1",140,42,3,95,2);
        Healer droid5 = new Healer("DefaultHealer2",122,22,4,90,23);
        Sniper droid6 = new Sniper("DefaultSniper1",100,25,7,90,3);
        Sniper droid7 = new Sniper("DefaultSniper2",122,22,4,90,23);

        droidList.add(droid1);droidList.add(droid2);droidList.add(droid3);
        droidList.add(droid4);droidList.add(droid5);
        droidList.add(droid6);droidList.add(droid7);
    }

    public static ArrayList<Droid> getDroidList (){
        return  droidList;
    }


    static public String toStr(){
        String str = "";
        int i = 0;
        for(Droid droid : droidList){
            i++;
            str += "\n" +i +")  " + droid.toString();
        }
        return str;
    }

}
