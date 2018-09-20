package ss1;

public class HK_E4_StringException extends Exception{
	public HK_E4_StringException(String message) {
		super(message);
	}
}
class AnInteger extends HK_E4_StringException {

	public AnInteger(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class RealNumber extends HK_E4_StringException {

	public RealNumber(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class NotNumber extends HK_E4_StringException{

	public NotNumber(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
