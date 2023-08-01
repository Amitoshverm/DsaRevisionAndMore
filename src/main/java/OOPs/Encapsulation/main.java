package OOPs.Encapsulation;

public class main {
    public static void main(String[] args) {
        Player player = new Player();
        player.playerName = "Amitosh";
        player.health = 100;
        player.weapon = "Sword";
        //this is very bad way of initialising the values very time using . to enter

        player.loseHealth(20);
        System.out.println(player.playerName+" was hit and remaining health is "+ player.remainingHealth());
        System.out.println("Weapon of the "+player.playerName+" is "+player.weapon);
    }
}
