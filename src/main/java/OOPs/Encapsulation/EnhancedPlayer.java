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
        if(health <= 0) {
            this.health = 1;
        } else if (health >= 100) {
            this.health = 100;
        } else {
            this.health =health;
        }
        this.weapon = weapon;
    }
    public void healthAfterAttack(int damage) {
        health -= damage;
    }
    public int remainingHealth() {
        return health;
    }

    public void restoreHealth(int foundHealth) {
        health += foundHealth;
        if (health > 100){
            health = 100;
        }
    }

}
