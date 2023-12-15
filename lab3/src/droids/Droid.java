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
    public int getAP(){return this.AP;}
    public void setHealth(int health){this.health = health;}
    public void setDamage(int damage){this.damage = damage;}
    public void setAccuracy(int accuracy){this.accuracy = accuracy;}
    public void setShield(int shield){this.shield = shield;}
    public void setAP(int AP){this.AP = AP;}

    public String toString(){
        return "Name---->|" + this.name + "|Health---->|" + this.health + "|";
    }

    public void re(){};
    public void heal(){};
    public void shoot(){};
    public void startDroidMenu(List<Droid> myTeam, List<Droid> enemyTeam){}

    public void increaseShield(){
        this.shield += 1;
    };

    };




