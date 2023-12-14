package menu;
import droids.*;



public class CreateDroidMenu extends Menu {
    public static void start(){
        loop : while(true){
        System.out.println("0) Close menu");
        System.out.println("Type droid type:");
        System.out.println("1) Stormtrooper");
        System.out.println("2) Healer");
        System.out.println("3) Sniper");
        int inp = getNumber();

        String name;
        int health, damage,shield ,accuracy,AP;
        switch (inp){
            case 0:
                break loop;
            case 1:
                System.out.println("Type droid name:");
                name = getString();
                System.out.println("Type droid heath(0-500):");
                health = getNumberInRange(0,500);
                System.out.println("Type droid damage(0-500):");
                damage = getNumberInRange(0,500);
                System.out.println("Type droid shield(0-500):");
                shield = getNumberInRange(0,500);
                System.out.println("Type droid accuracy(0-100):");
                accuracy = getNumberInRange(0,100);
                System.out.println("Type droid AP{Ability Power}(0-45):");
                AP = getNumberInRange(0,45);
                DroidList.add(new Stormtrooper(name,health,damage,shield,accuracy,AP));
                System.out.println("Stormtrooper added");
                break;
            case 2:
                System.out.println("Type droid name:");
                name = getString();
                System.out.println("Type droid heath(0-500):");
                health = getNumberInRange(0,500);
                System.out.println("Type droid damage(0-500):");
                damage = getNumberInRange(0,500);
                System.out.println("Type droid shield(0-500):");
                shield = getNumberInRange(0,500);
                System.out.println("Type droid accuracy(0-100):");
                accuracy = getNumberInRange(0,100);
                System.out.println("Type droid AP{Ability Power}(0-45):");
                AP = getNumberInRange(0,45);
                DroidList.add(new Healer(name,health,damage,shield,accuracy,AP));
                System.out.println("Healer added");
                break;
            case 3:
                System.out.println("Type droid name:");
                name = getString();
                System.out.println("Type droid heath(0-500):");
                health = getNumberInRange(0,500);
                System.out.println("Type droid damage(0-500):");
                damage = getNumberInRange(0,500);
                System.out.println("Type droid shield(0-500):");
                shield = getNumberInRange(0,500);
                System.out.println("Type droid accuracy(0-100):");
                accuracy = getNumberInRange(0,100);
                System.out.println("Type droid AP{Ability Power}(0-45):");
                AP = getNumberInRange(0,45);
                DroidList.add(new Sniper(name,health,damage,shield,accuracy,AP));
                System.out.println("Sniper added");
                break;
        }
    }
}
}