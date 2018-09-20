package ss1;

public class TestAge {
	public static void checkAge(int age) throws AgeTooYoung, AgeTooOld {
		if(age < 18) {
			throw new AgeTooYoung(age+" is to young");
		}else if(age > 55) {
			throw new AgeTooOld(age+" is too old");
		}else System.out.println(age+" is OK");
	}
}
