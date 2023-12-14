package menu;

import droids.DroidList;
import replay.Replay;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu extends Menu{
    public static void start() {
        while (true) {
            int inp;
            System.out.println(" ------------------------------------------------------------------");
            System.out.println("                           Welcome to DROID WARS                 ");
            System.out.println("0)Exit program");
            System.out.println("1)Create droid");
            System.out.println("2)Show droids");
            System.out.println("3)Start 1x1 battle");
            System.out.println("4)Start 3x3 battle");
            System.out.println("5)Save last battle");
            System.out.println("6)Watch replay from file");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("Type number: ");

                inp = getNumber();
                switch (inp) {
                    case 0:
                        System.exit(0);
                    case 1:
                        CreateDroidMenu.start();
                        break;
                    case 2:
                        System.out.println(DroidList.toStr());
                        break;
                    case 3:
                        Battle1x1Menu.start();
                        System.out.println("1x1");
                        break;
                    case 4:
                        Battle3x3Menu.start();
                        System.out.println("1x1");
                        break;
                    case 5:
                        Replay.saveToFile();
                        break;
                    case 6:
                        Replay.watchReplayFromFile();
                        break;
                    default:
                        if (inp > 7 || inp <= 0) {
                            System.out.println("incorrect num");
                        }
                }
            }
        }

    }

