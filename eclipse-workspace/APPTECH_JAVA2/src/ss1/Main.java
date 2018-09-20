package ss1;

public class Main {
	public static void main(String[] args) {
		int age=396;
		try {
			TestAge.checkAge(age);
		} catch (AgeTooYoung | AgeTooOld e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of main");
	}
}
