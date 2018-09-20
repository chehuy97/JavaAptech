package ss1;

public class AgeException extends Exception{
	public AgeException(String message) {
		super();
	}
}
	class AgeTooYoung extends AgeException{

		public AgeTooYoung(String message) {
			super(message);
		}
		
	}
	class AgeTooOld extends AgeException{

		public AgeTooOld(String message) {
			super(message);
		}
		
	}
