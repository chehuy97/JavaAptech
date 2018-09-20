package ss8;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTML;

import org.omg.CORBA.PUBLIC_MEMBER;

public class BT6 {
	public static void main(String[] args) {
		HocSinh hocsinh = new HocSinh();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		hocsinh.nhapTenHocSinh(n);
		hocsinh.nhapTuoiHocSinh(n);
		hocsinh.xuatThongTinHocSinh();
	}
}


class HocSinh{
	private String hs;
	private int t;
	private ArrayList mArrayList2;
	private ArrayList<String> mArrayList;
	public void nhapTenHocSinh(int n) {
		Scanner scanner =  new Scanner(System.in);
		mArrayList = new ArrayList<>();
		for(int i=0;i<n;i++) {
		hs = scanner.nextLine();
		mArrayList.add(hs);
		}
		
	}
	public void nhapTuoiHocSinh(int n){
		Scanner scanner2 = new Scanner(System.in);
		mArrayList2 = new ArrayList<>();
		for(int i=0;i<n;i++) {
			t= scanner2.nextInt();
			mArrayList2.add(t);
		}
		
	}
	public void xuatThongTinHocSinh() {
		HocSinh HS = new HocSinh();
		for(int i=0;i<mArrayList.size();i++) {
			System.out.println("Ten: "+mArrayList.get(i)+" Tuoi: "+mArrayList2.get(i));
		}
	}
	
	}
	
