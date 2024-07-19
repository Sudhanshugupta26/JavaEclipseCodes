package servlet6DoGet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myLogin")
public class Myservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		if(email.equals("sudhanshu@gmail.com") && pass.equals("26022004")) {
			System.out.println("SUCCESS");
		}
		else {System.out.println("FAIL");}
		PrintWriter out = resp.getWriter();
		out.print("The email and password is Shown in Above URL");
	}
}
