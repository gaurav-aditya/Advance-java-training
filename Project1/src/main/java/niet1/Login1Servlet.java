package niet1;
import java.sql.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login1Servlet
 */
@WebServlet("/Login1Servlet")
public class Login1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter out =response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/niet","root","manager");
			String n=request.getParameter("txtName");
			String p=request.getParameter("txtPwd");
			PreparedStatement ps=con.prepareStatement("select name from login where name=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else {
				out.println("<font color=red size=18>Login failed!!<br>");
				out.println("Invalid name or password <a href='login.jsp'>Try again!</a>");
				
			}
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
