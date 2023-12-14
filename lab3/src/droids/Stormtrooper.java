package droids;

import battle.Battle;
import menu.Menu;

import java.util.List;

public class Stormtrooper extends Droid {
    public Stormtrooper(String name,int health,int damage,int shield,int accuracy,int AP) {
        super(name,health,damage);
        this.shield = shield;
        this.accuracy = accuracy;
        this.AP = AP;
    }

    public void shoot(Droid target){
        target.SetHealth(target.getHealth() + (target.getShield() - this.damage));
    };

    public void increaseShield(){
        this.shield += 5;
    };

    public void doUltimate(List<Droid> enemies){
        for(Droid enemy:enemies){
            shoot(enemy);
        }
    }
    public void startDroidMenu(List<Droid> myTeam, List<Droid> enemyTeam){
        System.out.println("Choose option: ");
        System.out.println("1) Shoot");
        System.out.println("2) Increase shield");
        //System.out.println("3) Ultimate Stormtrooper attack(-1 AP), shoot all at one turn");
        int inp;

        if(this.AP <= 0){
            inp = Menu.getNumberInRange(1,2);

        } else {
            System.out.println("3) Ultimate Stormtrooper attack(-1 AP), shoot all at one turn");
            inp = Menu.getNumberInRange(1,3);
        }
        switch (inp){
            case 1 :
                System.out.println("Choose enemy to shoot ");
                inp = Menu.getNumberInRange(1,enemyTeam.size());
                shoot(enemyTeam.get(inp-1));
                Battle.setMessage(this.name + "   shoot");
                break;
            case 2 :
                increaseShield();
                Battle.setMessage(this.name + "   increased its shield");
                break;
            case 3 :
                doUltimate(enemyTeam);
                Battle.setMessage(this.name + "  performed  ultimate");
                break;
        }



    }
    public String toString(){
        return "Name---->|" + this.name + "|Health---->|" + this.health + "|" + "|Damage---->|"+ this.damage + "|"
                + "Shield---->|"+ this.shield + "|" + "Accuracy---->|"+ this.accuracy + "|" + "AP---->|" + this.AP;
    }
}