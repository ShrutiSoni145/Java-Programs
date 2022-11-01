

import java.io.*;
import java.util.*;

public class reveseGroups {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        
        //while testcases exist
        while(t-->0){
            
            String inputLine1[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            
            ArrayList<Integer> arr = new ArrayList<>();            
            String inputLine2[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr.add(Integer.parseInt(inputLine2[i]));
            }
            
            Solution obj = new Solution();
            obj.reverseInGroups(arr, n, k);
            
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr.get(i) + " ");
            }
            System.out.println(str);
        }
    }
}

class Solution {
        void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

            int l=0;
            int r=java.lang.Math.min(n,k);
            while(l<n){
            List<Integer> ll=arr.subList(l,(r-1));
            Collections.reverse(ll);
            l+=k;
            r=java.lang.Math.min(n,r+k);
            
        }
      
         
    }
}
