import java.util.Scanner;

public class LeftRotation {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        String[] nd = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        
        for(int i=0;i<d;i++) {
        	int temp;
        	temp=a[0];
        	for(int j=0;j<n-1;j++) {
        		a[j]=a[j+1];
        	}
        	a[n-1]=temp;
        }
        
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        scanner.close();
    }
}
