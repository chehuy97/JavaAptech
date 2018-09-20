package lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type4Demo {
	public static void main(String[] args) {
		Connection cn = null; // tao ket noi voi database
		Statement st = null; // chay cau lenh sql
		ResultSet rs = null; // chua ket qua tra ve

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// lay ra dia chi Driver
			cn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=QLSV", "sa","huy9101997");

			//String sql = "select *from SinhVien";
			String sql = "insert into SinhVien values ('MS07','Nguyen Van I',10);";
			st = cn.createStatement();
//			rs = st.executeQuery(sql);
//			while (rs.next()) {
//				System.out.printf(" %-5s %-15s %-5s \n", rs.getString(1), rs.getString(2), rs.getString(3));
//			}
			int n = st.executeUpdate(sql);
			if(n>0) {
				System.out.println("insert thanh cong");
			}else {
				System.out.println("insert khong thanh cong");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (cn != null)
					cn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
