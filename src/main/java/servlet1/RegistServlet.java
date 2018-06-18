package servlet1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet {
	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException,IOException{
			response.setContentType("text/html;charset=UTF-8");
			String username=request.getParameter("username");
			System.out.println("username:"+username);
			String[] interest=request.getParameterValues("interest");
			if(interest!=null) {
				for(int i=0;i<interest.length;i++) {
					System.out.println("interest:"+interest[i]);
				}
			}
			
	}
}
