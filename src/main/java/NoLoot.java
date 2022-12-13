
public class NoLoot implements LootStrategy {
    public NoLoot() {
    }

    public void lootAttempt() {
        System.out.println("There is nothing in the room worth looting!");
    }
}
