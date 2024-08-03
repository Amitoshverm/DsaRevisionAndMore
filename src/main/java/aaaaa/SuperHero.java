package aaaaa;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
public class SuperHero implements Comparable<SuperHero>{

    private String id;
    private String name;
    private int age;

    public SuperHero(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(SuperHero superHero) {
        return this.id.compareTo(superHero.id);
    }

    public static void main(String[] args) {
        SuperHero ironman = new SuperHero("2", "ironman", 35);
        SuperHero batman = new SuperHero("5", "batman", 40);
        SuperHero captain = new SuperHero("3", "captain America", 100);
        SuperHero Thor = new SuperHero("1", "thor", 4000);
        SuperHero superman = new SuperHero("1", "superman", 29);

        List<SuperHero> superHeroes = new ArrayList<>();
        superHeroes.add(ironman);
        superHeroes.add(batman);
        superHeroes.add(captain);
        superHeroes.add(Thor);
        superHeroes.add(superman);

        Collections.sort(superHeroes);
        superHeroes.forEach(superHero -> System.out.println(superHero.toString()));
    }

}

/* story na bht chaos me start hoti h lowen k bare m jo ki choti moti writer hoti h publisher k under kaam krti jiska khud ka
   pen name nahi hota toh hota ye hai ki ek subha vo office jari thi waha uska road cross krte time
 */