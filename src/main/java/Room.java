
public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    LootStrategy lootStrategy;
    public abstract String getDescription();

    public Room(String name) {
        this.name = name;
    }

    public void searchRoom(){
        lootStrategy.lootAttempt();
    }

    public void setLootStrategy(LootStrategy ls){lootStrategy = ls;}
    public Room getAdjoiningRoom(char dir) {
        switch (dir) {
            case 'd':
                return this.down;
            case 'e':
                return this.east;
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 't':
            case 'v':
            default:
                return null;
            case 'n':
                return this.north;
            case 's':
                return this.south;
            case 'u':
                return this.up;
            case 'w':
                return this.west;
        }
    }

    public String getExits() {
        String exits = "The exits are: ";
        if (this.north != null) {
            exits = exits + "North ";
        }

        if (this.south != null) {
            exits = exits + "South ";
        }

        if (this.east != null) {
            exits = exits + "East ";
        }

        if (this.west != null) {
            exits = exits + "West ";
        }

        if (this.up != null) {
            exits = exits + "Up ";
        }

        if (this.down != null) {
            exits = exits + "down ";
        }

        return exits;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isValidDirection(char dir) {
        return this.getAdjoiningRoom(dir) != null;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}
