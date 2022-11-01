//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class BinarySearch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter key");
            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
		int i=Search(arr,0,(n-1),k);
		return i;
    }
	int Search(int arr[],int lb,int ub,int k){
		int mid=lb+(ub-lb)/2;
		if(k<arr[mid])
			return Search(arr,lb,(mid-1),k);
		else if(k>arr[mid])
			return Search(arr,(mid+1),ub,k);
		else if(k==arr[mid])
			return mid;
		else
			return -1;
	}
}