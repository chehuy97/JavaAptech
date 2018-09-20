package ss5_homework;

public class Student {
	private String ten;
	private String lop;
	private int diem;
	public Student(String ten, String lop, int diem) {
		super();
		this.ten = ten;
		this.lop = lop;
		this.diem = diem;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
//	public String getDiem() {
//		return diem;
//	}
//	public void setDiem(String diem) {
//		this.diem = diem;
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return "Student [ten=" + ten + ", lop=" + lop + ", diem=" + diem + "]";
	}
	

}
	