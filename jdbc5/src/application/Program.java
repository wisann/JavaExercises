package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegrityException;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("delete from department where id = (?)", Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, 6);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done! id = " + rowsAffected);

		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());

		} finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}
	}
}
