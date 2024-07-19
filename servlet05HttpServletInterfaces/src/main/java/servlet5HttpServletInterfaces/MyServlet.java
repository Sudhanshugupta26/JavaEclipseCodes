package servlet5HttpServletInterfaces;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/nameEmail")
public class MyServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name") ;
		String email = req.getParameter("email") ;
		
		System.out.println(name);
		System.out.println(email);
		
		PrintWriter out = resp.getWriter();
		out.println("NAME : "+name);
		out.println("EMAIL : "+email);
		
	}
}
