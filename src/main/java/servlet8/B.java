package servlet8;
/**
 * Servlet…œœ¬Œƒ
 */
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class B extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		
		ServletContext sc=getServletContext();
		String username=(String)sc.getAttribute("username");
		System.out.println("username:"+username);
	}

}
