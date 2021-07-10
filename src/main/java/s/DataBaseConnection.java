package s;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

import com.sun.jdi.connect.spi.Connection;

/**
 * Servlet implementation class DataBaseConnection
 */
public class DataBaseConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   
    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
        {
            // Initialize all the information regarding
            // Database Connection
            String dbDriver = "com.mysql.jdbc.Driver";
            String dbURL = "jdbc:mysql:// localhost:3306/";
           
            String dbName = "ams";
            String dbUsername = "Abdulaziz";
            String dbPassword = "Aa251436";
      
            Class.forName(dbDriver);
            Connection con = (Connection) DriverManager.getConnection(dbURL + dbName,
                                                         dbUsername, 
                                                         dbPassword);
            return con;
        }
}
