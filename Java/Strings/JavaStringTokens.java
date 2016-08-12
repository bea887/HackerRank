import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        StringTokenizer tokenizer = new StringTokenizer(s, " !,?.\\_'@");
        System.out.println(tokenizer.countTokens());

        while(tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
