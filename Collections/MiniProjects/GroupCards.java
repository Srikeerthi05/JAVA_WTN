import java.util.*;
class Card {
    char symbol;
    int number;

    // Constructor to initialize card details
    Card(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    }
public class GroupCards{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, List<Card>> cardMap = new HashMap<>();

        System.out.print("Enter Number of Cards: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter card " + i + ": ");
            String input = sc.nextLine();

            if (input.length() < 2) {
                System.out.println("Invalid card. Try again.");
                i--; // repeat the same count
                continue;
            }

            char symbol = input.charAt(0);
            int number = Integer.parseInt(input.substring(1));

            Card c = new Card(symbol, number);

            // Add card to the corresponding symbol group
            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(c);
        }

        // Sort and display
        List<Character> symbols = new ArrayList<>(cardMap.keySet());
        Collections.sort(symbols);

        System.out.println("Distinct Symbols are :");
        for (char sym : symbols) {
            System.out.print(sym + " ");
        }
        System.out.println();

        for (char sym : symbols) {
            List<Card> cards = cardMap.get(sym);
            System.out.println("Cards in " + sym + " Symbol");

            int sum = 0;
            for (Card card : cards) {
                System.out.println(card.symbol + " " + card.number);
                sum += card.number;
            }

            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}
