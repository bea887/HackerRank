import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isAnagram(String str_1, String str_2) {
        boolean result = false;
        str_1 = str_1.toLowerCase();
        str_2 = str_2.toLowerCase();
        char[] str_1_array = str_1.toCharArray();
        char[] str_2_array = str_2.toCharArray();
        Arrays.sort(str_1_array);
        Arrays.sort(str_2_array);
        if (Arrays.equals(str_1_array, str_2_array)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
