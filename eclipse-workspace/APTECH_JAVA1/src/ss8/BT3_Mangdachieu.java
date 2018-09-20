package ss8;

import java.util.Scanner;

public class BT3_Mangdachieu {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] mArray = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mArray[i][j]=scanner.nextInt();
			}
		}
		int d=1;
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
//				if(d%(n)==0) {
//				System.out.println(mArray[i][j]+" ");
				/*}else*/ System.out.print(mArray[i][j]+" ");
//				d++;
			}
			System.out.println();
		}
		
	}
}
