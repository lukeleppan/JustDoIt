package DATA;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

  private Connection conn;
  Statement stmt;

  public DBConnection() {

    try {
      String dbURL = "jdbc:ucanaccess://JustDoItDatabase.accdb";
      conn = DriverManager.getConnection(dbURL, "", "");
      stmt = conn.createStatement();

    } catch (SQLException ex) {
      Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);

    }

  }

  public ResultSet query(String sql) throws SQLException {
    ResultSet result = stmt.executeQuery(sql);
    return result;

  }

  public int update(String sql) throws SQLException {
    Statement stmt = conn.createStatement();
    int done = stmt.executeUpdate(sql);
    return done;

  }

  public int updateReturnID(String sql) throws Exception {
    Statement stmt = conn.createStatement();
    int id = -1;
    stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
    ResultSet result = stmt.getGeneratedKeys();
    if (result.next()) {
      id = result.getInt(sql);

    }
    return id;
  }

}
