package OOPs.Encapsulation;

public class Player {
    public String playerName;
    public int health;
    public String weapon;

    public int remainingHealth() {
        return health;
    }
    public void loseHealth(int damage) {
        health -= damage;
    }

}
