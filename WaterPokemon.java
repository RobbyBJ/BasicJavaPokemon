import java.util.Random;

public class WaterPokemon extends Pokemon{
    
    // this contructor inherits all the attributes from the parent class Pokemon
    public WaterPokemon(String name, String type, int grade, int peStrength, int health, int attack, int defense, int speed, String moveType) {
        super(name, type, grade, peStrength, health, attack, defense, speed, moveType);

    }

    // this method detects the opponents pokemon type and deal extra damage based on it
    public int counterFire(Pokemon opponent) {
        
        int damage = 0;
        
        if (opponent.type.equals("Fire")) {
            Random rand = new Random();
            damage = (int) (((2 * this.attack / opponent.defense) * rand.nextInt(10)) / 10) * 2;
            System.out.println(name + " deals increased damage against Fire-type!");
        }
        return damage;
    }
}
