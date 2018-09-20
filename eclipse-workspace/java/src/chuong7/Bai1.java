package chuong7;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTextFieldUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.ArrayList;

public class Bai1 extends JFrame {
    public static void main(String[] args) {
        new Bai1();
    }

    Object[][] objects;
    JRadioButton rdMaSo;
    JRadioButton rdHoTen;
    JRadioButton rdNgaySinh;
    JRadioButton rdDiaChi;
    JRadioButton rdGioiTinh;
    ButtonGroup group;
    JTextField txtND;
    String[]  titles = new String[]{"maso", "hoten", "ngaysinh", "diachi", "gioitinh"};
    JTable table;
    public Bai1() {
        setSize(680, 500);
        setLayout(null);
        setTitle("Quáº£n LÃ½ tÃ¬m kiáº¿m: ");
        setDefaultCloseOperation(3);

        JLabel lb = new JLabel("Nháº­p ná»™i dung:");
        lb.setBounds(50, 20, 100, 30);
        add(lb);
        txtND = new JTextField();
        txtND.setBounds(160, 20, 200, 30);
        txtND.setUI(new JTextFieldHintUI("Nháº­p thÃ´ng tin tÃ¬m kiáº¿m", Color.gray));
        add(txtND);

        JButton btnTimKiem = new JButton("TÃ¬m kiáº¿m");
        btnTimKiem.setBounds(370, 20, 90, 30);
        add(btnTimKiem);
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(470, 20, 70, 30);
        add(btnReset);
        JButton btnExit = new JButton("ThoÃ¡t");
        btnExit.setBounds(550, 20, 70, 30);
        add(btnExit);

        JLabel lbTK = new JLabel("TÃ¬m kiáº¿m theo:");
        lbTK.setBounds(70, 70, 100, 30);
        add(lbTK);

        group = new ButtonGroup();
        rdMaSo = new JRadioButton("MÃ£ Sá»‘");
        rdMaSo.setBounds(180, 70, 80, 30);
        rdHoTen = new JRadioButton("Há»� TÃªn");
        rdHoTen.setBounds(270, 70, 80, 30);
        rdNgaySinh = new JRadioButton("NgÃ y Sinh");
        rdNgaySinh.setBounds(360, 70, 100, 30);
        rdDiaChi = new JRadioButton("Ä�á»‹a Chá»‰");
        rdDiaChi.setBounds(470, 70, 80, 30);
        rdGioiTinh = new JRadioButton("Giá»›i TÃ­nh");
        rdGioiTinh.setBounds(560, 70, 80, 30);
        rdMaSo.setSelected(true);
        group.add(rdMaSo);
        group.add(rdHoTen);
        group.add(rdNgaySinh);
        group.add(rdDiaChi);
        group.add(rdGioiTinh);
        add(rdMaSo);
        add(rdHoTen);
        add(rdNgaySinh);
        add(rdDiaChi);
        add(rdGioiTinh);
        ketNoiDuLieu();
        btnTimKiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TimKiem();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtND.setText("");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         table = new JTable(objects, titles);
        table.setBounds(50, 120, 580, 200);
        this.add(table, "South");
        setVisible(true);
    }

    ArrayList<SinhVien> listSV;
    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=SinhVien;";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    private void ketNoiDuLieu() {

        listSV = new ArrayList<>();
        String SQL = "SELECT * FROM HOCSINH";
        QueryDataBase(SQL);

    }

    private void TimKiem() {
        if (rdMaSo.isSelected()) {
            TimKiemMaSo();
        }
        if (rdHoTen.isSelected()) {
            TimKiemHoTen();
        }
        if (rdDiaChi.isSelected()) {
            TimKiemDiaChi();
        }
        if (rdNgaySinh.isSelected()) {
            TimKiemNgaySinh();
        }
        if (rdGioiTinh.isSelected()) {
            TimKiemGioiTinh();
        }
    }

    private void QueryDataBase(String sql) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl,"sa","huy9101997");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String MaSo = rs.getString("MaSo");
                String HoTen = rs.getString("HoTen");
                String NgaySinh = rs.getString("NgaySinh");
                String DiaChi = rs.getString("DiaChi");
                String GioiTinh = rs.getString("GioiTinh");
                System.out.println("MaSo=" + MaSo + " " + HoTen + " " + NgaySinh + " " + DiaChi + " " + GioiTinh);
                listSV.add(new SinhVien(MaSo, HoTen, NgaySinh, DiaChi, GioiTinh));
            }
        objects=null;
            objects = new Object[listSV.size()][5];
            int i = 0;
            for (SinhVien sv : listSV) {
                objects[i][0] = sv.getMaSo();
                objects[i][1] = sv.getHoTen();
                objects[i][2] = sv.getNgaySinh();
                objects[i][3] = sv.getDiaChi();
                objects[i][4] = sv.getGioiTinh();
                i++;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("lá»—i");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("lá»—i");
        }

    }

    private void TimKiemMaSo() {
        String MaSo = txtND.getText();
        String SQL = "SELECT * FROM ThÃ´ngTin WHERE MaSo='" + MaSo + "'";
        QueryDataBase(SQL);
    }

    private void TimKiemNgaySinh() {
        String NgaySinh = txtND.getText();
        String SQL = "SELECT * FROM ThÃ´ngTin WHERE NgaySinh='" + NgaySinh + "'";
        QueryDataBase(SQL);
    }

    private void TimKiemDiaChi() {
        String DiaChi = txtND.getText();
        String SQL = "SELECT * FROM ThÃ´ngTin WHERE DiaChi='" + DiaChi + "'";
        QueryDataBase(SQL);
    }

    private void TimKiemGioiTinh() {
        String GioiTinh = txtND.getText();
        String SQL = "SELECT * FROM ThÃ´ngTin WHERE GioiTinh='" + GioiTinh + "'";
        QueryDataBase(SQL);
    }

    private void TimKiemHoTen() {
        String HoTen = txtND.getText();
        String SQL = "SELECT * FROM ThÃ´ngTin WHERE HoTen='" + HoTen + "'";
        QueryDataBase(SQL);
    }
}
