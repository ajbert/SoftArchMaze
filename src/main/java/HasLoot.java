
public class HasLoot implements LootStrategy {
    public HasLoot() {
    }

    public void lootAttempt() {
        System.out.println("This room has items to loot");
    }
}
