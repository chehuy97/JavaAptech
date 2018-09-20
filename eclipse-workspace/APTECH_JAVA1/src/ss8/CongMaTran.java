package ss8;

import java.util.Scanner;

public class CongMaTran {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] matrix1 =new int[m][n];
		int[][] matrix2 =new int[m][n];
		int[][] matrix3 = new int[m][n];
		System.out.println("nhap phan tu ma tran 1");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("nhap phan tu ma tran 2");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}

		System.out.println("cong ma tran");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}
}

