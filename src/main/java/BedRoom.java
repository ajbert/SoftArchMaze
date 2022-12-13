
public class BedRoom extends Room implements Interactable {
    public BedRoom() {
        super("Bedroom");
    } {
        lootStrategy = new NoLoot();

    }

    public String getDescription() {
        return "This appears to be a bedroom, of sorts. There are three rudimentary beds made up of straw and fabric";
    }

    public String interact(Player player) {
        player.addToScore(-10);
        return "You try each of the beds. The first has too much straw, making it too hard. The second has too much fabric, making it too soft. \n The third bed seems to have just the right mixture of straw and fabric, making it surprisingly comfortable. \n You feel like you could drift off to sleep when a large centipede crawls out of the straw, giving you a terrible fright!";
    }
}
