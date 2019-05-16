import java.util.Scanner;

public class Task6_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKGS = Double.parseDouble(scanner.nextLine());
        double safridKGS = Double.parseDouble(scanner.nextLine());
        int midiKGS = Integer.parseInt(scanner.nextLine());
        double palamudPrice = skumriqPrice + skumriqPrice * 0.6;
        double safridPrice = cacaPrice + cacaPrice * 0.8;
        double midiPrice = midiKGS * 7.50;
        double palamudTotal = palamudKGS * palamudPrice;
        double safridTotal = safridKGS * safridPrice;
        double totalCost = midiPrice + palamudTotal + safridTotal;
        System.out.printf("%.2f", totalCost);


    }
}
