import java.io.*;
import java.util.*;

public class Solution {
    public static void main( String args[] ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(br.readLine());
        for( int i = 0; i < testCases; ++i ) {
            int[] nums = getLine( br.readLine() );
            List<Integer> ans = genAnsList( nums );
            for( int j = 0; j < ans.size(); ++j ) {
                System.out.printf("%d ", ans.get(j));
            }
            System.out.println();
        }
        br.close();
    }

    public static List<Integer> genAnsList( int[] nums ) {
        List<Integer> ans = new ArrayList<Integer>();
        ans.add(nums[0]);
        for( int i = 0; i < nums[2]; ++i ) {
            ans.add( ans.get(i) + (int)(Math.pow(2, i)) * nums[1] );
        }
        ans.remove( 0 );
        return ans;
    }

    public static int[] getLine( String line ) {
        String[] temp = line.split(" ");
        int[] nums = new int[temp.length];
        for( int i = 0; i < nums.length; ++i  ) {
            nums[i] = Integer.parseInt( temp[i] );
        }
        return nums;
    }
}
