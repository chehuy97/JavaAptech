package ss7;

public class ThiTruong {
	public static void main(String[] args) {
		StringBuilder khohang =  new StringBuilder();
		NhaSX Honda = new NhaSX("Honda",khohang);
		NhaTD TienThu =  new NhaTD("Tien Thu", khohang);
		Honda.start();
		TienThu.start();
	}
}
