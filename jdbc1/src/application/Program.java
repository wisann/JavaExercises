package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(
					"SELECT department.Id AS DepartmentId, department.Name AS DepartmentName, seller.Id AS SellerId, seller.Name AS SellerName, seller.Email, seller.BirthDate, seller.BaseSalary FROM department, seller WHERE department.Id = seller.DepartmentId");

			while (rs.next()) {
				System.out.println(rs.getInt("DepartmentId") + ", " + rs.getString("DepartmentName") + ", "
						+ rs.getInt("SellerId") + ", " + rs.getString("SellerName") + ", " + rs.getString("Email")
						+ ", " + rs.getDate("BirthDate") + ", " + rs.getDouble("BaseSalary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DB.closeConnection();
			DB.closeResultSet(rs);
			DB.closeStatement(st);

		}

	}

}
