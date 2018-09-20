package ss7;

public class SoNguyenTo {
//	private int n;
//	SoNguyenTo(int n) {
//		int tem=0;
//		int m= (int)Math.sqrt(n);
//		if(n<2) System.out.println("day k la so nguyen to");
//		for(int i=2;i<=m;i++) {
//			if(n%i == 0) tem+=0;
//			else if(n%i !=0) tem+=1;
//		}
//		if(tem==0) System.out.println("day k la so nguyen to");
//		if(tem!=1) System.out.println("day la so nguyen to");
//	}
	
	public void checkPrime(int n) {
		boolean isPrime = true;
		if(n<2) isPrime = false;
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				isPrime = false;
			}
		}
	if(isPrime==true) System.out.println("day la so nguyen to");	
	if(isPrime==false) System.out.println("day k la so nguyen to");	
	}
	
	 int kiemtrasnt(int n) 
	{
	    if (n < 2)    
	        return 0;
	    double S = Math.sqrt(n);
	    for (int i = 2; i <= S; i ++)
	    {
	        if (n%i==0)
	        {
	            return 0;
	        }
	    }
	    return 1;

}
}
