public class Pokeball {
    
    private int pokeball;

    public Pokeball(int pokeball) {
        this.pokeball = pokeball;
    }

    private double getCatchRate() {
        switch (pokeball) {
            case 1:
                return 0.25; // 25% catch rate
            case 2:
                return 0.5; // 50% catch rate
            case 3:
                return 0.75; // 75% catch rate
            case 4:
                return 1.0; // 100% catch rate
            default:
                System.out.println("Invalid pokeball type.");
                return 0.0;
        }
     }

    public boolean tryToCatch() {
        double catchRate = getCatchRate();
        double randomValue = Math.random(); // Random value between 0 and 1

        // Check if the catch attempt is successful
        if (randomValue < catchRate) {
            System.out.println();
            System.out.println("Congratulations! You caught the pokemon!");
            return true;
        }

        else {
            System.out.println("\nOh no! The pokemon broke free! Better Luck Next Time :(");
            return false;
        }
    }

    
}