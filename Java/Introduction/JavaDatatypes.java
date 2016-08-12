import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {
    public static void main( String args[] ) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            int testCases = Integer.parseInt( br.readLine() );

            for( int i = 0; i < testCases; ++i ) {
                String num = br.readLine();
                List<String> ans = dtypes(num);
                if( ans.isEmpty() ) {
                    System.out.printf("%s can't be fitted anywhere.\n", num);
                }
                else {
                    System.out.printf("%s can be fitted in:\n", num);
                    for( int k = 0; k < ans.size(); ++k ) {
                        System.out.printf("* %s\n", ans.get(k));
                    }
                }
            }

        } catch( Exception e ) {
            e.printStackTrace();
        } finally {
            try {
                if( br != null ) {
                    br.close();
                }
            } catch( IOException e ) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> dtypes( String snum ) {
        int bitCount = (new BigInteger(snum)).bitLength() + 1;
        int startIndex = 0;
        for( int i = data_types.size()-1; i >= 0; --i ) {
            if( bitCount > data_length.get(i) ) {
                startIndex = i+1;
                break;
            }
        }
        return data_types.subList(startIndex, data_types.size());
    }

    public static List<String> data_types = new ArrayList<String>(){{
        add("byte");
        add("short");
        add("int");
        add("long");
    }};

    public static List<Integer> data_length = new ArrayList<Integer>(){{
        add( 8);
        add(16);
        add(32);
        add(64);
    }};
}
