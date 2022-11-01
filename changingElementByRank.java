/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
    	int[] a={100, 5, 70, 2};
    	int[] ans=new int[a.length];
    	ans[0]=1;
    	for(int i=1;i<a.length;i++){
    	    if(a[i]<a[i-1]){
    	       for(int j=0;j<i;j++){
    	           ans[j]+=1;
    	       } 
    	       ans[i]=1;
    	    }else{
    	        ans[i]=i+1;
    	    }
    	    
    	}
    	for(int k=0;k<ans.length;k++){
    	    System.out.print(ans[k]+" ");
    	}
	
	}
}