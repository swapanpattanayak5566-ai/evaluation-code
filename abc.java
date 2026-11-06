
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace(" ", "");

        int[] freq = new int[65536];

    
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

    
        System.out.println("Character frequencies:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == i) {
                System.out.println(ch + " = " + freq[ch]);
            }
        }

        
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] == 1) {
                System.out.println(
                    "First non-repeating character: " + ch
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
