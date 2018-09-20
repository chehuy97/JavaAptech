import java.util.Scanner;

public class BaiD {
	
	

	
	public static void TIME(int h, int m, int s)
	{
		++s;
		if(s==60)
		{
			s=0;
			m=m+1;
			if(m==60)
			{
				m=0;
				h=h+1;
				if(h==24)
				{h=0;}
			}
		}
		System.out.println(h+":"+m+":"+s);
	}
	
	
	public static void main(String[] args) {
		int h,m,s;
		Scanner scanner = new Scanner(System.in);
		h=scanner.nextInt();
		m=scanner.nextInt();
		s=scanner.nextInt();
		TIME(h,m,s);
	}
	
	

}