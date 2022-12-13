
public class StoreRoom extends Room implements Interactable, Lootable {
   private Boolean haveRing = false;
    private Boolean wasLooted = false;

    public StoreRoom() {
        super("Store Room");
    } {
        lootStrategy = new HasLoot();
    }

    public String getDescription() {
        return !this.haveRing ? "This is a store room with various barrels, boxes, and jars.  \n Gleaming unnaturally in the dimly lit room is a ring on the finger of a child-sized skeleton with enormous feet" : "This is a store room with various barrels, boxes, and jars.  \n In the corner lies a child-sized skeleton with enormous feet";
    }

    public void setSouth(Room south) {
        super.setSouth(south);
    }

    public String loot(Player player) {

        if (wasLooted != true) {
            player.addToScore(30);
            player.addToInventory("Ring of Visibility");
            haveRing = true;
            wasLooted = true;
            setLootStrategy(new AlreadyLooted());
            return "You remove the ring from the finger of the skeleton. It feels warmer that it should be, having been in this cool dank room. \n You look through the other containers in the room and found in the room but find nothing valuable";
        }
        return "You found nothing else to loot";
    }

    public String interact(Player player) {
        player.addToScore(20);
        return "You examine the ring and you swear it's just the right size for your finger. You can hear a faint whisper in a language you don't understand coming from the ring";
    }
}
