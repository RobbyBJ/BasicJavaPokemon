public class Battle {
    
    private Pokemon playerPokemon1;
    private Pokemon playerPokemon2;
    private Pokemon opponentPokemon1;
    private Pokemon opponentPokemon2;

    // contructor that take in the two pokemons from the player and two pokmeons from the opponent
    public Battle(Pokemon playerPokemon1, Pokemon playerPokemon2, Pokemon opponentPokemon1, Pokemon opponentPokemon2) {
        this.playerPokemon1 = playerPokemon1;
        this.playerPokemon2 = playerPokemon2;
        this.opponentPokemon1 = opponentPokemon1;
        this.opponentPokemon2 = opponentPokemon2;

    }
    
    // this method prints out an introduction to the battle section of the program
    public void intro(Pokemon opponentPokemon1, Pokemon opponentPokemon2) {
        System.out.println("\nThe opponet has sent out his two wild pokemons!\n");
        
        System.out.println("===============");
        System.out.println("|  Pokemon 1  | \n" + "---------------" + opponentPokemon1);
        System.out.println("===============\n");
        
        System.out.println("===============");
        System.out.println("|  Pokemon 2  | \n" + "---------------" + opponentPokemon2);
        System.out.println("===============\n");

    }

    // this method determines how the player can win or lose, and shows the health and damage for their pokemon
    public void playerRound(Pokemon playerPokemon1, Pokemon playerPokemon2, Pokemon opponentPokemon1, Pokemon opponentpPokemon2) {
            
        if (playerPokemon1.getTotalHealth() >= 0 && opponentPokemon1.getTotalHealth() >= 0) {
            System.out.println(playerPokemon1.getName() + " attacks " + opponentPokemon1.getName() + " with " + playerPokemon1.getMoveType() + " for " + playerPokemon1.getAttack() + " damage! ");
            opponentPokemon1.takeDamage(opponentPokemon1.getName(), opponentPokemon1.getDefense(), opponentPokemon1.getHealth(), playerPokemon1.getAttack());
        }

        else if (playerPokemon1.getTotalHealth() <= 0 && opponentPokemon1.getTotalHealth() >= 0) {
            System.out.println(playerPokemon2.getName() + " attacks " + opponentPokemon1.getName() + " with " + playerPokemon2.getMoveType() + " for " + playerPokemon2.getAttack() + " damage! ");
            opponentPokemon1.takeDamage(opponentPokemon1.getName(), opponentPokemon1.getDefense(), opponentPokemon1.getHealth(), playerPokemon2.getAttack());
        }

        else if (playerPokemon1.getTotalHealth() >= 0 && opponentPokemon1.getTotalHealth() <= 0) {
            System.out.println(playerPokemon1.getName() + " attacks " + opponentPokemon2.getName() + " with " + playerPokemon1.getMoveType() + " for " + playerPokemon1.getAttack() + " damage! ");
            opponentPokemon2.takeDamage(opponentPokemon2.getName(), opponentPokemon2.getDefense(), opponentPokemon2.getHealth(), playerPokemon1.getAttack());
        }

        else if (playerPokemon1.getTotalHealth() <= 0 && opponentPokemon1.getTotalHealth() <= 0) {
            System.out.println(playerPokemon2.getName() + " attacks " + opponentPokemon2.getName() + " with " + playerPokemon2.getMoveType() + " for " + playerPokemon2.getAttack() + " damage! ");
            opponentPokemon2.takeDamage(opponentPokemon2.getName(), opponentPokemon2.getDefense(), opponentPokemon2.getHealth(), playerPokemon2.getAttack());
        }

        else if (playerPokemon2.getTotalHealth() <= 0 && opponentpPokemon2.getTotalHealth() >= 0 ) {
            System.out.println("You Have Lost! Opponent Has Won");
        }

        else if (playerPokemon2.getTotalHealth() > 0 && opponentpPokemon2.getTotalHealth() <= 0) {
            System.out.println("You Have Won! Opponent Has Lost");
        }
    }

    
    // this method determines how the player can win or lose, and shows the health and damage for their pokemon
    public void opponentRound(Pokemon playerPokemon1, Pokemon playerPokemon2, Pokemon opponentPokemon1, Pokemon opponenetPokemon2) {
     
        if(opponentPokemon1.getTotalHealth() >= 0 && playerPokemon1.getTotalHealth() >= 0) {
            System.out.println(opponentPokemon1.getName() + " attacks " + playerPokemon1.getName() + " with " + opponentPokemon1.getMoveType() + " for " + opponentPokemon1.getAttack() + " damage! ");
            playerPokemon1.takeDamage(playerPokemon1.getName(), playerPokemon1.getDefense(),playerPokemon1.getHealth(), opponentPokemon1.getAttack());
        }

        else if(opponentPokemon1.getTotalHealth() <= 0 && playerPokemon1.getTotalHealth() >= 0) {
            System.out.println(opponentPokemon2.getName() + " attacks " + playerPokemon1.getName() + " with " + opponentPokemon2.getMoveType()+ " for " + opponentPokemon2.getAttack() + " damage! ");
            playerPokemon1.takeDamage(playerPokemon1.getName(), playerPokemon1.getDefense(),playerPokemon1.getHealth(), opponentPokemon2.getAttack());
        }

        else if(opponentPokemon1.getTotalHealth() >= 0 && playerPokemon1.getTotalHealth() <= 0) {
            System.out.println(opponentPokemon1.getName() + " attacks " + playerPokemon2.getName() + " with " + opponentPokemon1.getMoveType()+ " for " + opponentPokemon1.getAttack() + " damage! ");
            playerPokemon2.takeDamage(playerPokemon2.getName(), playerPokemon2.getDefense(),playerPokemon2.getHealth(), opponentPokemon1.getAttack());
        }

        else if (opponentPokemon1.getTotalHealth() <= 0 && playerPokemon1.getTotalHealth() <= 0) {
            System.out.println(opponentPokemon2.getName() + " attacks " + playerPokemon2.getName() + " with " + opponentPokemon2.getMoveType()+ " for " + opponentPokemon2.getAttack() + " damage! ");
            playerPokemon2.takeDamage(playerPokemon2.getName(), playerPokemon2.getDefense(),playerPokemon2.getHealth(), opponentPokemon2.getAttack());
        }

        else if(opponentPokemon2.getTotalHealth() <= 0 && playerPokemon2.getTotalHealth() >= 0) {
            System.out.println("Opponent Has Lost! You Have Won!");
        }

        else if(opponentPokemon2.getTotalHealth() >= 0 && playerPokemon2.getTotalHealth() <= 0) {
           System.out.println("You Have lost! Opponent has Won!");
        }
    }
}



