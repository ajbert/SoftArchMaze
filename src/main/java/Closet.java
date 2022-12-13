public class Closet extends Room {
    public Closet() {
        super("Closet");
    }{
        lootStrategy = new NoLoot();
    }

    public String getDescription() {
        return "The room is small and dark with the only light coming from the hole you fell through. The hole is too high up for you to be able to climb out";
    }

    public void setEast(Room east) {
        super.setEast(east);
    }
}
