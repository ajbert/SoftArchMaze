
    public class Kitchen extends Room implements Interactable, Lootable {
        private Boolean koboldsAlive = true;
        private Boolean wasLooted = false;

        public Kitchen() {
            super("Kitchen");
        }        {
            lootStrategy = new HasLoot();
        }

        public String getDescription() {
            return this.koboldsAlive ? "This room appears to be a kitchen area with a fire pit, and various pots, pans and cutlery littering the floors and tables. \n Out of the corner of your eye you see three smallish humanoids that look like hairless dogs with lizard like tails.\n You instinctively know these are Kobolds, an evil race of cave dwellers." : "This room appears to be a kitchen area with a fire pit, and various pots, pans and cutlery littering the floors and tables. \n The bodies of three kobolds lie on the floor";
        }

        public String interact(Player player) {
            this.koboldsAlive = false;
            player.addToScore(-50);
            return "The kobolds are stunned by your presence allowing you the advantage. \nUsing your shovel as a weapon you're able to dispatch all three kobolds in quick succession. \nYou tell yourself they'd have attacked you if they could have.  but it doesn't make their doglike yelps any less haunting";
        }

        public String loot(Player player) {
            if (wasLooted != true) {
                player.addToInventory("pickaxe");
                player.addToScore(10);
                setLootStrategy(new AlreadyLooted());
                wasLooted = true;
                return !this.koboldsAlive ? "You search the bodies, finding little of value. However, you take a pickaxe near the door on the east side of the room" : "You grab a pickaxe that was laying against the wall";
            } else if (koboldsAlive != true)
                return "You search the bodies, finding little of value.";
            return "Besides the kobolds, you see nothing else to loot.";
        }

    }


