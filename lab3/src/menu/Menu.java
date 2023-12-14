package menu;

import java.util.Scanner;


public class Menu {
    static int getNumber() {
            int inp;
            String name;
            Scanner scanner = new Scanner(System.in);
            try {
                inp = scanner.nextInt();
                return inp;
            } catch (Exception e) {
                System.out.println("Incorrect input");
                return -1;
    }
    }

    static  String getString(){
        String inp;
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();
        return inp;
    }


    public static int getNumberInRange(int min,int max) {
        int inp;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                inp = scanner.nextInt();
                if(inp < min || inp > max){
                    System.out.println("Incorrect input please type number in range1");
                    continue;
                }
                return inp;
            } catch (Exception e) {
                System.out.println("Incorrect input");
                return -1;
            }

        }
    }
}