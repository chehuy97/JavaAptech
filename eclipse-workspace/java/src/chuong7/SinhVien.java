package chuong7;

public class SinhVien {
    private String MaSo;
    private String HoTen;
    private String NgaySinh;
    private String DiaChi;
    private String GioiTinh;

    public SinhVien(String maSo, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        MaSo = maSo;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        GioiTinh = gioiTinh;
    }

    public SinhVien() {
    }

    public String getMaSo() {
        return MaSo;
    }

    public void setMaSo(String maSo) {
        MaSo = maSo;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }
}
