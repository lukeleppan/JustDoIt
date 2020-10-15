package MANAGER;

import DATA.DBConnection;
import DATA.User;
import DATA.UserCreds;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager {

	private DBConnection objDBCon;
	private User user;
	private UserCreds userCreds;

	public boolean CheckForUser(String username) {
		boolean exists = false;

		try {
			ResultSet rs = objDBCon.query("SELECT * FROM UserCreds WHERE Username = '" + username + "'");

			if (rs.getString(1).equals(username)) {
				exists = true;
			}
		} catch (SQLException ex) {
			Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
		}

		return exists;
	}

}
