package OOPs.Encapsulation;

public class EnhancedPlayer {

    // here fields are encapsulated as private and will be passed as arguments in constructor
    private String playerName;
    private int health;
    private String weapon;

    public EnhancedPlayer(String playerName) {
        this(playerName, 100, "sword");
    }

    public EnhancedPlayer(String playerName, int health, String weapon) {
        this.playerName = playerName;
        this.health = health;
        this.weapon = weapon;
    }
}
