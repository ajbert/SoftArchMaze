
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory = new ArrayList();

    private static Player uniqueInstance;

    public String getInventory() {
        Iterator var1 = this.inventory.iterator();

        while(var1.hasNext()) {
            String item = (String)var1.next();
            System.out.println(item);
        }

        return "";
    }

    public void addToInventory(String e) {
        this.inventory.add(e);
    }

    public void addToScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return this.score;
    }

    /**
     * Singleton pattern
     */
    public static Player getInstance(){
        if (uniqueInstance == null ){
            uniqueInstance = new Player();
        }
        return uniqueInstance;
    }
}
