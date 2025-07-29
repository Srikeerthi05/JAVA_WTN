import java.util.*;

public class Card {
    char symbol;
    int number;
    static ArrayList<Card> cards = new ArrayList<>();
    static HashSet<Character> symbols = new HashSet<>();

    public static void collectCards() {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (symbols.size() < 4) {
            System.out.print("Enter a card: ");
            String input = sc.nextLine();

            if (input.length() < 2) continue;

            Card c = new Card();
            c.symbol = input.charAt(0);
            c.number = Integer.parseInt(input.substring(1));

            cards.add(c);
            symbols.add(c.symbol);
            count++;
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are:");
        LinkedHashMap<Character, Card> map = new LinkedHashMap<>();
        for (Card c : cards) {
            if (!map.containsKey(c.symbol)) {
                map.put(c.symbol, c);
            }
        }
        ArrayList<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for (char key : keys) {
            Card c = map.get(key);
            System.out.println(c.symbol + " " + c.number);
        }

        sc.close();
    }

    public static void main(String[] args) {
        Card.collectCards(); 
    }
}
