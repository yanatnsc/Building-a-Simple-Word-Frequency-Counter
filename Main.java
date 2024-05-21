import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        System.out.println("Please enter text to be processed. Type 'exit' to stop: ");
        // Test: "Don't count dont vs DON'T as different" // dont * 3
        // Test: ""

        while(scanner.hasNext()) {
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                break;
            }

            //https://www.geeksforgeeks.org/java-program-to-find-the-occurrence-of-words-in-a-string-using-hashmap/
            String[] words = text.split(" ");

            //https://stackoverflow.com/questions/25904954/ignore-punctuation-marks-in-string
            for (String word : words) {
                word = word.toLowerCase();
                word = word.replaceAll("[^a-zA-Z]", "");

                Integer count = map.getOrDefault(word, 0);
                map.put(word, count + 1);

            }
        }
        scanner.close();
        System.out.println(map);
    }
}