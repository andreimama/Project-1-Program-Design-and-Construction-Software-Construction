package justanothertuesday;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Saving saver = new Saving();
        GameSaver gameSaver = new GameSaver(saver);
        int desc = 0;
        int choice = 0;
        System.out.println("WELCOME TO JUST ANOTHER TUESDAY !\nWould you like start a new game(1) or load a saved game(2)");
        mainDude main = new mainDude("", 0, 0);
        Medic medic = new Medic();
        Stealth stealth = new Stealth();
        Tank tank = new Tank();
        SubBoss subBoss = new SubBoss("", 0);

        try {
            int menu = scan.nextInt();
            if (menu == 1) {
                desc = 1;
            } else if (menu == 2) {
                //*******************Here we implement another class to retrieve the saved game and catch the story up to where they were last time**********************//
            }
        } catch (InputMismatchException e) {
        }
        switch (desc) {
            case 1:
                String hold = "";
                System.out.println("Mysterious voice: wake up...wake up...WAKE UP !");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("We need to get out of here !\n What's Your name ?");
                while (true) {
                    hold = scan.nextLine().trim();
                    if (hold.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println("Please enter a valid name: ");
                    }
                }

                main.setName(hold);
                try {
                    System.out.println("Mysterious person: Cmon " + main.getName() + " We need to get to a... Oh no look out !");
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Infront of you approaching fast is some sort of half human, half alien.\nThere is a gun on the table next to you.\nWhat do you do?");
                System.out.println("(1) Grab gun\n(2) Hide behind the mysterious person\nYou have 5 seconds before the monster attacks!");
                choice = 0;
                while (true) {
                    try {
                        if (scan.hasNextInt()) {
                            choice = scan.nextInt();
                            if (choice > 0 && choice <= 2) {
                                break;
                            } else {
                                System.out.println("Please enter a valid choice: ");
                            }
                        }

                    } catch (InputMismatchException e) {
                    }
                }
                switch (choice) {
                    case 1:
                        System.out.println("You shoot the monster and it drops to the floor.\nYou check and the gun still has 2 bullets left");
                        main.powerUp(50);
                        main.getsWeapon(Boolean.TRUE, 2);
                        gameSaver.saveGameState(desc, main, medic, stealth, tank);
                        desc = 2;
                        break;
                    case 2:
                        medic.takesDamage(50);
                        gameSaver.saveGameState(desc, main, medic, stealth, tank);
                        desc = 3;
                }

            case 2:
                try {
                Thread.sleep(1500);
                System.out.println("Mysterious voice: That was close, come with me I'm a doctor I can get you the help you need !");
                System.out.println("\n\nThe mysterious person explains that you have been asleep for 20 years and in that time the world was overrun with a parasitic\nalien species from one of Jupiter's moons.");
                Thread.sleep(2000);
                System.out.println("\nMysterious voice: My name is Cherry by the way. I'm taking you to the FBI HeadQuarters where Angelo, the head can explain more...");
                Thread.sleep(2000);
                System.out.println(tank.getName() + ": Mumbling to himself over a map...Ah Cherry, I see you've brought a guest !");
                Thread.sleep(2000);
                System.out.println(medic.getName() + ": This is " + main.getName() + ", I found him in the 69th quadrant he seems handy with a gun.\nHe might be of some use.");
                //********************************************Needs a decision********************************************//
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            case 3:
                try{
                System.out.println("You go to hide behind the mysterious person\nLuckily the stranger handles the beast...\nBut got injured in doing so...");
                System.out.println("\n\nThe mysterious person explains that you have been asleep for 20 years and in that time the world was overrun with a parasitic\nalien species from one of Jupiter's moons.");
                Thread.sleep(2000);
                System.out.println("\nMysterious voice: My name is Cherry by the way. I'm taking you to the FBI HeadQuarters where Angelo, the head can explain more...");
                Thread.sleep(2000);
                System.out.println(tank.getName() + ": Mumbling to himself over a map...Ah Cherry, I see you've brought a guest !");
                Thread.sleep(2000);
                System.out.println(medic.getName() + ": This is " + main.getName() + ", I found him in the 69th quadrant he seems handy with a gun.\nHe might be of some use.");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
}
