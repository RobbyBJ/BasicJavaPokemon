
public class Pokemon {

    // attributes for a Pokemon
    String name;
    String type;
    int grade;
    int peStrength;

    int health;
    int attack;
    int defense;
    int speed;
    String moveType;
    int totalHealth;

    // constructors
    public Pokemon() { // set default value for the attributes
        name = "none";
        type = "none";
        grade = 1;
        peStrength = 0;
        health = 0;
        attack = 0;
        defense = 0;
        speed = 0;
        moveType = "none";
    }
    
    // constructor for Pokemon Object, 
    public Pokemon(String name, String type, int grade, int peStrength, int health, int attack, int defense, int speed, String moveType) {
        this.name = name;
        this.type = type;
        this.grade = grade;
        this.peStrength = peStrength;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.moveType = moveType;
    }
    
    // setter and getter methods for the attributes
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String t) {
        type = t;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public int getPEstrength() {
        return peStrength;
    }
    
    public void setPEstrength(int peStrength) {
        this.peStrength = peStrength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }

    // This method does calculates how much damage is done to a pokemon's hitpoints by the opponent
    public void takeDamage(String name, int defense, int health, int attack) {
        this.name = name;
        totalHealth = defense + health;
        totalHealth -= attack;
        
        if ( totalHealth < 0) {
            totalHealth = 0;
            System.out.println(name + " has " + totalHealth + " health remaining.");
            System.out.println(name + " has fainted! ");
        }

        else {
            System.out.println(name + " has " + totalHealth + " health remaining.");
        }
    }

    // this getter method returns the value of a pokemon's hitpoints after an attack
    public int getTotalHealth() {
        return totalHealth;
    }
    
    // this method displays the attributes that are set for the pokemons in String form
    public String toString() {
        return String.format(
                "\nName: %s \nType: %s \nGrade: %d \nPEstrength: %d",name, type, grade, peStrength);
    
    }
}

