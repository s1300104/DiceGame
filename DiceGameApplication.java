import java.util.Random;
import java.util.Scanner;

class DiceGameApplication {

    public DiceGameApplication() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int tmp;
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Rolling dice...");
        for (int i = 1; i <= 2; i++) {
            tmp = r.nextInt(6) + 1;
            System.out.printf("Dice %d: %d\n", i, tmp);
            total += tmp;
        }
        System.out.printf("Total value: %d\n", total);
    }
    
    public static void main(String[] args) {
        new DiceGameApplication();
    }
}
