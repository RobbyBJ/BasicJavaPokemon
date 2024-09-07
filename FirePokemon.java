import java.util.Random;

public class FirePokemon extends Pokemon {
    
    // this contructor inherits all the attributes from the parent class Pokemon
    public FirePokemon(String name, String type, int grade, int peStrength, int health, int attack, int defense, int speed, String moveType) {
        super(name, type, grade, peStrength, health, attack, defense, speed, moveType);
    }

    // this method detects the opponents pokemon type and deal extra damage based on it
    public int counterGrass(Pokemon opponent) {
        int damage = 0;

        if (opponent.type.equals("Grass")) {
            Random rand = new Random();
            damage = (int) (((2 * this.attack / opponent.defense) * rand.nextInt(10)) / 10) * 2;
            System.out.println(name + " deals increased damage against Grass-type!");
        }
        return damage;
    }
}
