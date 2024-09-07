import java.util.Random;

public class GrassPokemon extends Pokemon {

    // this contructor inherits all the attributes from the parent class Pokemon
    public GrassPokemon(String name, String type, int grade, int peStrength, int health, int attack, int defense, int speed, String moveType) {
        super(name, type, grade, peStrength, health, attack, defense, speed, moveType);
    }

    // this method detects the opponents pokemon type and deal extra damage based on it
    public int counterWater(Pokemon opponent) {
        int damage = 0;
        if (opponent.type.equals("Water")) {
            Random rand = new Random();
            damage = (int) (((2 * this.attack / opponent.defense) * rand.nextInt(10)) / 10) * 2;
            System.out.println(name + " deals increased damage against Water-type!");
        }
        return damage;
    }
}