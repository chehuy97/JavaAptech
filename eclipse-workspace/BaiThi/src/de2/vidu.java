package de2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class vidu {
	public static void main(String[] args) {
			try {
				Date date =  new SimpleDateFormat("dd/MM/yyyy").parse("5/5/1997");
				System.out.println(date.toString());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("sai dinh dang ngay sinh");
			}
	}
}
