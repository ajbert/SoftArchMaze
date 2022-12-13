
public class Hallway extends Room {
    public Hallway() {
        super("Hallway");
    }{
        lootStrategy = new NoLoot();
    }

    public String getDescription() {
        return "This clearly is a hallway of sorts with rooms in all four directions";
    }

    public void setNorth(Room north) {
        super.setNorth(north);
    }

    public void setSouth(Room south) {
        super.setSouth(south);
    }

    public void setEast(Room east) {
        super.setEast(east);
    }

    public void setWest(Room west) {
        super.setWest(west);
    }
}
