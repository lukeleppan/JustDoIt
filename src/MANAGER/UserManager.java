package MANAGER;

import DATA.DBConnection;
import DATA.User;
import DATA.UserCreds;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

  private DBConnection DBCon = new DBConnection();
  private User user;
  private UserCreds userCreds;

  public boolean CheckForUser(String username) {
    boolean exists = false;

    System.out.println("heyy");

    try {
      ResultSet rs = DBCon.query("SELECT * FROM UserCreds WHERE Username = '" + username + "';");

      System.out.println(rs.toString());

      System.out.println(rs.getString(1));

      if (rs.getString(1).equals(username)) {
        exists = true;
      }
    } catch (SQLException ex) {
      Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
    }

    return exists;
  }

}
