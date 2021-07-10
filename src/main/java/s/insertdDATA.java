package s;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class insertdDATA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
HttpServletResponse response, Connection Assigned)
		throws ServletException, IOException
	{
		
		String SubjectInfo=request.getParameter("SubjectInfo");
		String AssignedClass=request.getParameter("AssignedClass");
		String AssignedTeacher=request.getParameter("AssignedTeacher");
		
		String TeacherName=request.getParameter("TeacherName");
		String TeachersId=request.getParameter("TeachersId");
		String AssignedSubject=request.getParameter("AssignedSubject");
		
		String ClassNumber=request.getParameter("ClassNumber");
		String ClassDate=request.getParameter("ClassDate");
		String ClassTime=request.getParameter("ClassTime");
		
		String StudentName=request.getParameter("StudentName");
		String StudentId=request.getParameter("StudentId");
		
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		try {

			
			com.sun.jdi.connect.spi.Connection con = DataBaseConnection.initializeDatabase();

		   Class.forName("com.mysql.jdbc.Driver");
		   
		   Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","Abdulaziz", "Aa251436");
			
		   Assigned.prepareStatement("insert into subject vlaues(?, ?, ?)");

			String sql = null;
			
			PreparedStatement st = con1.prepareStatement(sql);
		
			st.setString(1, SubjectInfo); 
			
			st.setString(2, AssignedClass);
			
			st.setString(3, AssignedTeacher);
			
			st.executeUpdate();

			st.close();
			con1.close();

		
			out.println("Successfully Inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
try {

			
	com.sun.jdi.connect.spi.Connection con = DataBaseConnection.initializeDatabase();

	   Class.forName("com.mysql.jdbc.Driver");
	   
	   Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","Abdulaziz", "Aa251436");
		
	   Assigned.prepareStatement("insert into Classes vlaues(?, ?, ?, ?, ?)");

		String sql = null;
		
		PreparedStatement st = con1.prepareStatement(sql);
	
		st.setString(1, ClassNumber); 
		
		st.setString(2, AssignedSubject);
		
		st.setString(3, AssignedTeacher);
		
		st.setString(4, ClassDate);
		
		st.setString(5, ClassTime);
		
		st.executeUpdate();

		st.close();
		con1.close();

	
		out.println("Successfully Inserted");
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}

try {

	
	com.sun.jdi.connect.spi.Connection con = DataBaseConnection.initializeDatabase();

	   Class.forName("com.mysql.jdbc.Driver");
	   
	   Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams","Abdulaziz", "Aa251436");
		
	   Assigned.prepareStatement("insert into Classes vlaues(?, ?, ?)");

		String sql = null;
		
		PreparedStatement st = con1.prepareStatement(sql);
	
		st.setString(1, StudentName); 
		
		st.setString(2, StudentId);
		
		st.setString(3, AssignedClass);
		
	
		st.executeUpdate();

		st.close();
		con1.close();

	
		out.println("Successfully Inserted");
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}


}

	
}



