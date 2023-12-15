package droids;

import battle.Battle;
import menu.Menu;

import java.util.List;

public class Healer extends Droid {

    int healRate = 10;

    public Healer(String name,int health,int damage,int shield,int accuracy,int AP) {
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





    public void heal(Droid ally){
        ally.setHealth(ally.getHealth() + this.healRate);
    }

    public void doUltimate(List<Droid> myTeam){
        if (this.AP > 0) {
            this.AP -= 1;
            for(Droid ally:myTeam){
             heal(ally);
        }
    }
    }


    public void startDroidMenu(List<Droid> myTeam, List<Droid> enemyTeam){
        System.out.println("Choose option: ");
        System.out.println("1) Shoot");
        System.out.println("2) Increase shield");
        System.out.println("3) Heal an ally or yourself ");
        int inp;

        if(this.AP <= 0){
            inp = Menu.getNumberInRange(1,3);

        } else {
            System.out.println("4) Ultimate Healer heal(-1 AP), heal everyone in team");
            inp = Menu.getNumberInRange(1,4);
        }
        switch (inp){
            case 1 :
                System.out.println("Choose enemy to shoot ");
                inp = Menu.getNumberInRange(1,enemyTeam.size());
                shoot(enemyTeam.get(inp-1));
                Battle.setMessage(this.name + "  shoot");
                break;
            case 2 :
                increaseShield();
                Battle.setMessage(this.name + "  increased its shield");
                break;
            case 3 :
                System.out.println("Choose ally to heal ");
                inp = Menu.getNumberInRange(1,myTeam.size());
                Droid ally = myTeam.get(inp-1);
                heal(ally);
                Battle.setMessage(this.name + "  healed" + ally.getName());
                break;
            case 4 :
                inp = Menu.getNumberInRange(1,myTeam.size());
                doUltimate(myTeam);
                Battle.setMessage(this.name + "  performed  ultimate");
                break;
        }

    }
    public String toString(){
        return "Name---->|" + this.name + "|Health---->|" + this.health + "|" + "|Damage---->|"+ this.damage + "|"
                + "Shield---->|"+ this.shield + "|" + "Accuracy---->|"+ this.accuracy + "|" + "AP---->|" + this.AP + "|HealRate---->|" +this.healRate;
    }
}
