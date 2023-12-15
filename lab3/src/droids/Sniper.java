package droids;

import battle.Battle;
import menu.Menu;

import java.util.List;

public class Sniper extends Droid {

    public Sniper(String name,int health,int damage,int shield,int accuracy,int AP) {
        super(name,health,damage);
        this.shield = shield;
        this.accuracy = accuracy;
        this.AP = AP;
    }

    public void shoot(Droid target){

        int recuredAcuracy = (int) (Math.random() * 100);
        if(recuredAcuracy < this.accuracy) {
            target.setHealth(target.getHealth() + (target.getShield() - this.damage));
        }
        };




    public void doUltimate(Droid target) {
        if (this.AP > 0) {
            this.AP -= 1;
            target.setHealth(target.getHealth() + (target.getShield() - (this.damage * 3)));
        }
    }


    public void startDroidMenu(List<Droid> myTeam, List<Droid> enemyTeam){
        System.out.println("Choose option: ");
        System.out.println("1) Shoot");
        System.out.println("2) Increase shield");
        int inp;

        if(this.AP <= 0){
            inp = Menu.getNumberInRange(1,2);

        } else {
            System.out.println("3)Ultimate Hit enemy with 100%chance and deal 3x damage(-1 AP)");
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
                Battle.setMessage(this.name + "  increased its shield");
                break;
            case 3 :
                System.out.println("Choose enemy to shoot ");
                inp = Menu.getNumberInRange(1,enemyTeam.size());
                doUltimate(enemyTeam.get(inp-1));
                Battle.setMessage(this.name + "   performed  ultimate");
                break;
        }
    }
    public String toString(){
        return "Name---->|" + this.name + "|Health---->|" + this.health + "|" + "|Damage---->|"+ this.damage + "|"
                + "Shield---->|"+ this.shield + "|" + "Accuracy---->|"+ this.accuracy + "|" + "AP---->|" + this.AP;
    }
}



