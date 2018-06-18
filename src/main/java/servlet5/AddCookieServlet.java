package servlet5;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		Cookie c=new Cookie("username",URLEncoder.encode("³Â","UTF-8"));
		c.setMaxAge(40);
		Cookie c2=new Cookie("username","");
		c2.setMaxAge(0);
		Cookie c1=new Cookie("city","xi'an");
		response.addCookie(c);
		response.addCookie(c1);
		response.addCookie(c2);
	}

}
