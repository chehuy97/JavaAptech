package Exercise;

import java.util.Scanner;

public class bai11 {
	public static void main(String[] args) {
		System.out.println("nhap 1 so: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(kiemtrasnt(a) == 0) {
			System.out.println("day k phai so nguyen to");
		}
		if(kiemtrasnt(a) == 1)
		{
			System.out.println("day la so nguyen to");
		}
		
	}
	public static int kiemtrasnt(int soA) 
		{
		    if (soA < 2)    
		        return 0;
		    
		    for (int i = 2; i <= Math.sqrt(soA); i ++)
		    {
		        if (soA%i==0)
		        {
		            return 0;
		        }
		    }
		    return 1;
	
	}

}
