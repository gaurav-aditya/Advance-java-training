package niet;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=request.getParameter("t1");
		String pwd=request.getParameter("t2");
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		if(n.equals("niet") && pwd.equals("secret"))
		{
			response.sendRedirect("Success.jsp");
		}
		else {
			System.out.println("Sorry ! user or password is invalid ..try again");
			RequestDispatcher rd=request.getRequestDispatcher("Student.jsp");
			rd.include(request, response);
		}
		
	}

}
