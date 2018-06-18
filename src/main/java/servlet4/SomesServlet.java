package servlet4;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		String username=request.getParameter("username");
		System.out.println("username:"+username);
		
//		response.sendRedirect(request.getContextPath()+"/biz2/sub/redirect.jsp");
		
		request.getRequestDispatcher("biz2/sub/forward.jsp").forward(request, response);
	}

}
