package niet;

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

/**
 * Servlet implementation class Register2
 */
@WebServlet("/Register2")
public class Register2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Firstname=request.getParameter("fname");
		String Lastname=request.getParameter("lname");
		String Email=request.getParameter("email");
		String Phone=request.getParameter("phone");
		String Address=request.getParameter("address");
		String Pin=request.getParameter("pin");
		String Department=request.getParameter("department");
		String Position=request.getParameter("position");
		String Uname=request.getParameter("uname");
		String Password=request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/niet","root","manager");
			PreparedStatement ps=con.prepareStatement("insert into register1 values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, Firstname);
			ps.setString(2, Lastname);
			ps.setString(3, Email);
			ps.setString(4, Phone);
			ps.setString(5, Address);
			ps.setString(6, Pin);
			ps.setString(7, Department);
			ps.setString(8, Position);
			ps.setString(9, Uname);
			ps.setString(10, Password);
			int i=ps.executeUpdate();
			if(i>0) {
				out.print("you are successfully registered");
				out.print("Success<a href='Login1.jsp'> Login</a>");
			}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
