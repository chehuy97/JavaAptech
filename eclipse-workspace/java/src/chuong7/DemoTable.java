package chuong7;
        import javax.swing.JFrame;
        import javax.swing.JScrollPane;
        import javax.swing.JTable;

public class DemoTable extends JFrame {
    public static void main(String[] args) {
        new DemoTable();
    }
    public DemoTable() {

        String[] titles = new String[]{"STT", "Môn học", "Tác giả", "Tổng số bài viết"};

        Object[][] objects = new Object[][]{
                {1, "JSP & Servlet", "Tùng Dương", 22},
                {2, "Spring Framework", "Tùng Dương", 15},
                {3, "Struts Framework", "Công Minh", 7}};

        JTable table = new JTable(objects, titles);

        this.add(new JScrollPane(table));
        this.setTitle("Kênh Lập Trình - Hướng dẫn lập trình Web");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
