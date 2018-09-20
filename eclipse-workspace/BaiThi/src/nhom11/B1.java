package nhom11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class B1 extends JFrame{
    //rename path
    String path = "src\\nhom11\\input.txt";
    String logPath = "src\\nhom11\\log.txt";

    ArrayList<Circle> circles;
    ArrayList<String> logs;
    Graphics g;
    JPanel pn;
    JButton btnLoad;
    JTextField txtFilePath;

    public ArrayList<Circle> getDataFromFile(String path) {
        ArrayList<Circle> circles = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            String line = br.readLine();
            while(line != null) {
                String[] split = line.split(",");
                try {
                    int x = Integer.parseInt(split[0]);
                    int y = Integer.parseInt(split[1]);
                    int r = Integer.parseInt(split[2]);
                    Color color = (Color) Color.class.getField(split[3]).get(null); // try parse to color
                    circles.add(new Circle(x, y, r, split[3]));
                } catch(Exception e) {
                    //in loi ra console
                    System.out.println("Error at line [" + line + "]");
                    //ghi ra file log.txt
                    if(logs == null)
                        logs = new ArrayList<>();
                    logs.add(line);
                }
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(logs.size() > 0)
            writeFile(logs, logPath);
        return circles;
    }

    public void writeFile(ArrayList<String> list, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));

            boolean isFirstLine = true;
            for (String str : list) {
                if(!isFirstLine) {
                    bw.newLine();
                }
                isFirstLine = false;
                bw.write(str);
            }
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createLayout(Container contentPane) {
        btnLoad = new JButton("Load");
        txtFilePath = new JTextField();
        pn = new JPanel();
        btnLoad.setBounds(30, 30, 100, 30);
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //load circle to panel and save to db
                try{
                    circles = getDataFromFile(path);
                    for (Circle c : circles) {
                        g = pn.getGraphics();
                        Color color = (Color) Color.class.getField(c.getColor()).get(null);
                        g.setColor(color);
                        g.fillOval(c.getX(),c.getY(),c.getR()*2,c.getR()*2);
                    }
                    saveDataToDB(circles);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        txtFilePath.setBounds(150, 30, 400, 30);
        txtFilePath.setText(path); // test
        pn.setBounds(30,90, 600,400);

        pn.setBackground(Color.GREEN);
        contentPane.add(btnLoad);
        contentPane.add(txtFilePath);
        contentPane.add(pn);
    }

    public void saveDataToDB(ArrayList<Circle> circles) {
        String connectionUrl = "jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=HOCSINH";
        Connection con = null;
        PreparedStatement pst = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl,"sa","huy9101997");
            if(con == null)
                return;

            String sql = "INSERT INTO Circle VALUES(?,?,?,?)";
            pst = con.prepareStatement(sql);
            for(Circle c: circles) {
                pst.setInt(1,c.getX());
                pst.setInt(2,c.getY());
                pst.setInt(3,c.getR());
                pst.setString(4,c.getColor());
                pst.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public B1() {
        setTitle("Final exam");
        setBounds(0, 0, 800,600 );
        createLayout(getContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new B1();
    }

}


