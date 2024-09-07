import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class PokemonTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pokemon Objects
        Pokemon Charmander = new Pokemon("Charmander", "Fire", 3, 254, 39,52, 50, 65, "Fire");
        Pokemon Ponyta = new Pokemon("Ponyta", "Fire", 4, 347, 50, 85, 55, 90, "Tail Whip");
        Pokemon Blaziken = new Pokemon("Blaziken", "Fire", 5, 430, 80, 120, 70, 88, "Fire Punch");
        Pokemon Squirtle = new Pokemon("Squirtle", "Water", 4, 314, 44, 48, 65, 43, "Watergun!");
        Pokemon Golduck = new Pokemon("Golduck", "water", 3, 300, 50, 52, 48, 55, "Damp");
        Pokemon Gyarados = new Pokemon("Gyarados", "water", 4, 353, 54, 62, 38, 50, "Hyrdo Pump");
        Pokemon Bulbasaur = new Pokemon("Bulbasaur", "grass", 3, 318, 45, 49, 49, 45, "Overgrow!" );
        Pokemon Leafeon = new Pokemon("Leafeon", "grass", 5, 496, 65, 110, 130, 95, "Leaf Guard" );
        Pokemon Bellsprout = new Pokemon("Bellsprout", "grass", 3, 298, 50, 75, 35, 40, "Chloropyll");
        
        // Array containg all the Pokemon objects
        Pokemon[] pokemonCard = new Pokemon[9];
        pokemonCard[0] = Charmander;
        pokemonCard[1] = Ponyta;
        pokemonCard[2] = Blaziken;
        pokemonCard[3] = Squirtle;
        pokemonCard[4] = Golduck;
        pokemonCard[5] = Gyarados;
        pokemonCard[6] = Bulbasaur;
        pokemonCard[7] = Leafeon;
        pokemonCard[8] = Bellsprout;

        // Player deck array, displays the default cards that the player will have
        Pokemon[] playerCard = new Pokemon[5];
        playerCard[0] = Leafeon;
        playerCard[1] = Golduck;

        int i = 0, menuOption;

        while (i != 1) {
            System.out.println("\n===================================");
            System.out.println("| Welcome to Pokemon Ga-Ole Game! |");
            System.out.println("===================================");
            System.out.println("1. 'Battle and Catch' mode");
            System.out.println("2. Exit");

            System.out.print("Enter Option (1 or 2): ");
            menuOption = input.nextInt();
            System.out.println("");

            if (menuOption == 1) {

                System.out.println("\n=============================");
                System.out.println("| Start 'Battle and Catch'! |");
                System.out.println("=============================");

                // Shuffles the poekmonCard array and randomizes three pokemon objects out for the players to see
                Collections.shuffle(Arrays.asList(pokemonCard));

                int next, select, ball, first, second, choice;
                int loop = 0;
        
                Pokemon pokemon1 = pokemonCard[0];
                Pokemon pokemon2 = pokemonCard[1];
                Pokemon pokemon3 = pokemonCard[2];
            
                System.out.println("\nThree wild pokemons have appeared!\n");
                System.out.println("===============");
                System.out.println("|  Pokemon 1  | \n" + "---------------" + pokemon1);
                System.out.println("===============\n");
                System.out.println("===============");
                System.out.println("|  Pokemon 2  | \n" + "---------------" + pokemon2);
                System.out.println("===============\n");
                System.out.println("===============");
                System.out.println("|  Pokemon 3  | \n" + "---------------" + pokemon3);
                System.out.println("===============\n");

                System.out.print("Enter '0' to go to the next stage: ");
                next = input.nextInt();

                while ( loop != 1) {
                    System.out.println("\n===============");
                    System.out.println("| Catch Time! |");
                    System.out.println("===============");
                    System.out.print("Select which pokemon you would like to catch!(1 - 3): ");
                    select = input.nextInt();

                    if ( select == 1 ) {
                        System.out.println("\n===============");
                        System.out.println("|  Pokemon 1  | \n" + "---------------" + pokemon1);
                        System.out.println("===============\n");
                        playerCard[2] = pokemon1;
                        loop = 1;
                    }

                    else if ( select == 2) {
                        System.out.println("\n===============");
                        System.out.println("|  Pokemon 2  | \n" + "---------------" + pokemon2);
                        System.out.println("===============\n");
                        playerCard[2] = pokemon2;
                        loop = 1;
                    }

                    else if ( select == 3) {
                        System.out.println("\n===============");
                        System.out.println("|  Pokemon 3  | \n" + "---------------" + pokemon3);
                        System.out.println("===============\n");
                        playerCard[2] = pokemon3;
                        loop = 1;
                    }
                    else {
                        System.out.println("\n---------------------------------------");
                        System.out.println("Invalid Pokemon, Please Select Again!");
                        System.out.println("---------------------------------------");
                    }
                }
                
                System.out.print("Enter '4' to catch it! : ");
                ball = input.nextInt();
                
                Pokeball p = new Pokeball(ball);
                p.tryToCatch();
                    

                Pokemon playerPokemon1 = playerCard[0];
                Pokemon playerPokemon2 = playerCard[1];
                Pokemon playerPokemon3 = playerCard[2];

                System.out.print("\nEnter '0' to go to the next stage: ");
                next = input.nextInt();

                System.out.println("\n======================");
                System.out.println("| Depart for battle! |");
                System.out.println("======================");
                
                Collections.shuffle(Arrays.asList(pokemonCard));

                Pokemon opponentPokemon1 = pokemonCard[4];
                Pokemon opponentPokemon2 = pokemonCard[5];
                
                Battle battle = new Battle(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);
                battle.intro(opponentPokemon1, opponentPokemon2);

                System.out.print("\nEnter '0' to continue: ");
                next = input.nextInt();

                System.out.println("\n----------------------------------------------------------------");
                System.out.println("Be prepared for the battle! Send out two pokemons of your own!");
                System.out.println("Here are the pokemons that are in your deck: ");
                System.out.println("--------------------------------------------------------------");

                Player player1 = new Player(playerCard);
                player1.displayDeck();
                
                System.out.print("\nEnter '0' to continue: ");
                next = input.nextInt();

                System.out.println("\nEnter the two pokemons you want to use in this battle ( 1- 3 )");
                System.out.print("\nPokemon1: ");
                first = input.nextInt();

                switch (first) {
                    case 1:
                        player1.getPlayerCard(playerCard, 0);
                        break;
                
                    case 2:
                        player1.getPlayerCard(playerCard, 1);
                        break;

                    case 3:
                        player1.getPlayerCard(playerCard, 2);
                        break;
                }

                System.out.print("\nPokemon2: ");
                second = input.nextInt();

                switch (second) {
                    case 1:
                        player1.getPlayerCard(playerCard, 0);
                        break;
                
                    case 2:
                        player1.getPlayerCard(playerCard, 1);
                        break;

                    case 3:
                        player1.getPlayerCard(playerCard, 2);
                        break;
                }

                System.out.print("\nEnter '0' to go to the next stage: ");
                next = input.nextInt();

                System.out.println("\n=====================");
                System.out.println("| Let's go! Battle! |");
                System.out.println("=====================");
                System.out.println("\nPlayer will start first!\n");

                Battle round = new Battle(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);
                round.playerRound(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);

                System.out.print("\nEnter '0' to continue: ");
                next = input.nextInt();

                System.out.println("\nIt's the opponent's turn!\n");
                round.opponentRound(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);

                System.out.print("\nEnter '0' to continue: ");
                next = input.nextInt();
                
                System.out.println("\nIt's the player's turn\n");
                round.playerRound(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);

                System.out.print("\nEnter '0' to continue: ");
                next = input.nextInt();
                
                System.out.println("\nIt's the opponent's turn\n");
                round.opponentRound(playerPokemon1, playerPokemon2, opponentPokemon1, opponentPokemon2);

                System.out.println("\n==============");
                System.out.println("Catch Pokemon!");
                System.out.println("==============");

                System.out.print("Choose one of the oppnent's pokemon to catch (1-2): ");
                choice = input.nextInt();
                System.out.println("");

                if ( choice == 1 ) {
                    System.out.println("===============");
                    System.out.println("|  Pokemon 1  | \n" + "---------------" + opponentPokemon1);
                    System.out.println("===============\n");
                }

                else if( choice == 2 ) {
                    System.out.println("===============");
                    System.out.println("|  Pokemon 2  | \n" + "---------------" + opponentPokemon2);
                    System.out.println("===============\n");
                }

                System.out.println("\n-----------------------------");
                System.out.println("Select which Poke Ball to use");
                System.out.println("-----------------------------");
                System.out.println("1. Poke Ball");
                System.out.println("2. Great Ball");
                System.out.println("3. Ultra Ball");
                System.out.println("4. Master ball");
                System.out.print("Choose your Poke Ball: ");
                ball = input.nextInt();

                Pokeball c = new Pokeball(ball);
                c.tryToCatch();

                System.out.println("\n----------------------------------------");
                System.out.println("| Thank you for playing Pokemon Ga-Ole |");
                System.out.println("----------------------------------------");
            
            }

            else if (menuOption == 2) {
                System.out.println("----------------------------------------");
                System.out.println("| Thank you for playing Pokemon Ga-Ole |");
                System.out.println("----------------------------------------");
                i = 1;
            }

            else {   
                System.out.println("\n---------------------------------------");
                System.out.println("| Invalid Option, Please Select Again |");
                System.out.println("---------------------------------------");
            }
        }
        input.close();
    }
}

