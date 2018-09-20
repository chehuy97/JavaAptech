package ss1;

import javax.xml.ws.handler.MessageContext;

public class HK_E4_checkString {

	public static void checkString(String message) throws AnInteger, NotNumber, RealNumber {
		// TODO Auto-generated constructor stub
		int a = 0, b = 0;
		try {
			for (int i = 0; i <= message.length(); i++) {
				if (message.charAt(i) <= 57 && message.charAt(i) >= 48) {
					a += 1;
					int j = i + 1;
					if (message.charAt(j) == 46) {
						b += 1;
					}
				}
				if ((message.charAt(i) <= 90 && message.charAt(i) >= 65)
						|| (message.charAt(i) <= 122 && message.charAt(i) >= 97)) {
					a += 2;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (a == message.length())
			throw new AnInteger(message + " la day so nguyen ");
		else if (a == 2 * message.length())
			System.out.println("day la chuoi ky tu");
		else if ((a == message.length() - 1) && b == 1)
			throw new RealNumber(message+" la so thuc");
		else
			throw new NotNumber(message + " k phai day j het");
	}
}
