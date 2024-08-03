package UdemySetup.Generics;

import java.util.ArrayList;

public class Team <T>{
    private String name;
    int won;
    int lost;

    private ArrayList<T> members = new ArrayList<>();

    public boolean addMembers(T player) {
        if (members.contains(player)) {
            System.out.println(player + " is already in team");
            return false;
        }
        else {
            members.add(player);
            return true;
        }
    }
}
