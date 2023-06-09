import java.util.Random;

class DiceGameApplication {
    
    public DiceGameApplication() {
        Random r = new Random();
        int total = 0;
        int tmp;
        System.out.println("Rolling dice...");
        for (int i = 1; i <= 2; i++) {
            tmp = r.nextInt(6) + 1;
            System.out.printf("Dice %d: %d\n", i, tmp);
            total += tmp;
        }
        System.out.printf("Total value: %d\n", total);
        if(total > 7) System.out.println("You won!");
        else System.out.println("You lost!");
    }

    public static void main(String[] args) {
        new DiceGameApplication();
    }
}