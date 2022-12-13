
public class Maze {
    Room currentRoom;
    /**
     * singleton pattern
     */
    Player player = Player.getInstance();
    Boolean isFinished = false;

    public Maze() {
        Closet closet = new Closet();
        Hallway hallway = new Hallway();
        StoreRoom storeRoom = new StoreRoom();
        BedRoom bedRoom = new BedRoom();
        Kitchen kitchen = new Kitchen();
        BlockedPassage blockedPassage = new BlockedPassage();
        this.player.addToInventory("Shovel");
        this.currentRoom = closet;
        closet.setEast(hallway);
        hallway.setWest(closet);
        hallway.setNorth(storeRoom);
        hallway.setSouth(bedRoom);
        hallway.setEast(kitchen);
        storeRoom.setSouth(hallway);
        bedRoom.setNorth(hallway);
        kitchen.setWest(hallway);
        kitchen.setEast(blockedPassage);
        blockedPassage.setWest(kitchen);
    }

    public String exitCurrentRoom() {
        return this.currentRoom instanceof Exitable ? ((Exitable)this.currentRoom).exit(this.player) : "Room is not an exit";
    }

    public String interactWithCurrentRoom() {
        return this.currentRoom instanceof Interactable ? ((Interactable)this.currentRoom).interact(this.player) : "There's nothing to interact with here";
    }

    public String lootCurrentRoom() {
        return this.currentRoom instanceof Lootable ? ((Lootable)this.currentRoom).loot(this.player) :  " " ;
    }

    public Boolean move(char dir) {
        if (this.currentRoom.isValidDirection(dir)) {
            switch (dir) {
                case 'd':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('d');
                    break;
                case 'e':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('e');
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
                    break;
                case 'n':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('n');
                    break;
                case 's':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('s');
                    break;
                case 'u':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('u');
                    break;
                case 'w':
                    this.currentRoom = this.currentRoom.getAdjoiningRoom('w');
            }

            return true;
        } else {
            return false;
        }
    }

    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public Boolean isFinished() {
        return this.isFinished;
    }

    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }
}
