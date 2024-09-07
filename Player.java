public class Player {

    private Pokemon[] deck;

    // constructor that takes in an array in its parameter
    public Player(Pokemon[] deck) {
        this.deck = deck;
    }

    // getter/setter method for the deck array
    public Pokemon[] getPlayerDeck() {
        return deck;
    }

    public void setPlayerDeck(Pokemon[] deck) {
        this.deck = deck;
    }

    // getter method to get a specific pokemon out of the player's deck
    public void getPlayerCard(Pokemon[] deck, int position) {
        System.out.println(deck[position]);
    }

    // method to display all the pokemons that are in the player's deck
    public void displayDeck() {
        for (Pokemon display : deck) {
            System.out.println(display);
        }
    }
}
