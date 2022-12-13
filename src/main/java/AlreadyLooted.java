
public class AlreadyLooted implements LootStrategy {
    public AlreadyLooted() {
    }

    public void lootAttempt() {
        System.out.println("This room was already looted!");
    }
}
