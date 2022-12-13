
    public class RoomFactory {
        public RoomFactory() {
        }

        public Room getRoom(String roomType) {
            if (roomType.equalsIgnoreCase("CLOSET")) {
                return new Closet();
            } else if (roomType.equalsIgnoreCase("HALLWAY")) {
                return new Hallway();
            } else if (roomType.equalsIgnoreCase("BEDROOM")) {
                return new BedRoom();
            } else if (roomType.equalsIgnoreCase("STOREROOM")) {
                return new StoreRoom();
            } else if (roomType.equalsIgnoreCase("KITCHEN")) {
                return new Kitchen();
            } else if ( roomType.equalsIgnoreCase("BLOCKEDPASSAGE")){
                 return new BlockedPassage();
            } return null;
        }
    }


