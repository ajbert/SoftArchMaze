import java.util.Scanner;

public class Prologue {
    public Prologue() {
    }

    public void getPrologue(Scanner input) throws InterruptedException {
        System.out.println("You have been conscripted into the Imperial Army! After a several day journey you have reached a small keep on the borderlands of the frontier. \n Despite its small size the keep is buzzing with activity, a far cry from the farming hamlet you grew up in. \n You've barely had time to take your things to your barracks, when you are summoned to receive you duty assignment.");
        Thread.sleep(3000L);
        System.out.println("You stand before a wizened old man, you recognize as the master of the keep. He looks you over before he begins to speak.");
        Thread.sleep(3000L);
        System.out.println("What is your name, conscript?");
        input.nextLine();
        Thread.sleep(2000L);
        System.out.println("Yes, of course it is, and what do you hope to be in our glorious army?");
        input.nextLine();
        Thread.sleep(2000L);
        System.out.println("How interesting, I've never heard that before.");
        Thread.sleep(2000L);
        System.out.println("Well I have a task especially for you that will help you towards your goals");
        Thread.sleep(2000L);
        System.out.println("We have need of a new latrine, and you have the look of someone handy with a shovel \n \n \n ");
        System.out.println("The hot sun is shining down as you begin to dig the hole. You're clearly disappointed that you're stuck digging a hole, \nbut at least it beats shoveling manure like you'd be doing at home.  ");
        Thread.sleep(1000L);
        System.out.println("Dig");
        Thread.sleep(1000L);
        System.out.println("Dig");
        Thread.sleep(1000L);
        System.out.println("Dig");
        Thread.sleep(1000L);
        System.out.println("After several hours of digging, your mind wanders to escape the boredom, and you don't notice when your shovel breaks through the ceiling of cave!\n You fall through the hole landing on the hard cave floor!");
    }
}
