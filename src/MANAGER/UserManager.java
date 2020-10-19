package MANAGER;

import DATA.DBConnection;
import DATA.User;
import DATA.UserCreds;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

  private DBConnection DBCon = new DBConnection();
  private User user;
  private UserCreds userCreds;

  public boolean CheckForUser(String username) {
    boolean exists = false;

    try {
      List<UserCreds> userCredsShareableList = new ArrayList();

      ResultSet rs = DBCon.query("SELECT * FROM tblUserCreds");

      while (rs.next()) {
        UserCreds userCred = new UserCreds(
                rs.getInt("UserCredID"),
                rs.getString("Username"),
                rs.getString("Password")
        );
        userCredsShareableList.add(userCred);
      }

      rs.close();

      for (int i = 0; i < userCredsShareableList.size(); i++) {
        if (userCredsShareableList.get(i).getUsername().equals(username)) {
          exists = true;
        }
      }
    } catch (SQLException ex) {
      Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
    }

    return exists;
  }

  public boolean RegisterUser(User user, UserCreds userCreds) {
    boolean success = false;

    return success;
  }

}
