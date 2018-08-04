	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;
	
	public class DiagonalDifference {
	
	    static int diagonalDifference(int[][] arr,int n) {
	        int i,j,k,l,d1=0,d2=0,result=0;
	      
	                for(k=n-1;k>=0;k--){
	                    d1=d1+arr[k][k];
	                }
	                for(k=n-1,l=0;(k>=0&l<n);k--,l++){
	                    d2=d2+arr[l][k];
	                }
	         result=Math.abs(d1-d2);
			return result;
	    }
	
	    private static final Scanner scanner = new Scanner(System.in);
	
	    public static void main(String[] args) throws IOException {
	       
	        int n = scanner.nextInt();
	      
	        int[][] arr = new int[n][n];
	
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	
	        int result = diagonalDifference(arr,n);
	        System.out.println(result);
	
	        scanner.close();
	    }
	}
