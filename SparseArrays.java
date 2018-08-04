import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SparseArrays {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int count[]=new int[queries.length];
        for(int k=0;k<queries.length;k++)
            count[k]=0;
        int n=strings.length;
        for(int i=0;i<queries.length;i++){
         String temp=queries[i];
         for(int j=0;j<n;j++) {
             if(temp.equals(strings[j]))
                 count[i]++;
         }    
    }
        return count;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
   
        int stringsCount = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.nextLine();

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
          System.out.print(res[i]);

            if (i != res.length - 1) {
               System.out.println();
            }
        }
        scanner.close();
    }
}
