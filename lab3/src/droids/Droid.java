package droids;

import java.util.List;

public class Droid implements Cloneable{
    public Droid clone()  {
        try{
        Droid drClone = (Droid) super.clone();
        return drClone;
            }catch (Exception e){
            Droid fr = new Droid("tf",87,3);
            return fr;
        }

        }


    public String name;
    int damage = 100, health = 100, accuracy = 100,shield = 0;
    int AP = 0; //Ability points
    public Droid(String name,int health,int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    public String getName(){return this.name;}
    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public int getAccuracy(){return this.accuracy;}
    public int getShield(){return this.shield;}
    public void SetHealth(int health){this.health = health;}
    public void SetDamage(int damage){this.health = damage;}

    public String toString(){
        return "Name---->|" + this.name + "|Health---->|" + this.health + "|";
    }

    public void re(){};
    public void heal(){};
    public void shoot(){};
    public void startDroidMenu(List<Droid> myTeam, List<Droid> enemyTeam){}

    };




