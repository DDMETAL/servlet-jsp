package servlet5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Find_AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			boolean flag=false;
			for(int i=0;i<cookies.length;i++) {
				Cookie c=cookies[i];
				if("cart".equals(c.getName())) {
					//找到cookie，显示值
					out.println(c.getValue());
					flag=true;
				}
			}
			//没有找到名为cart的cookie
			if(!flag) {
				Cookie c=new Cookie("cart","123");
				response.addCookie(c);
			}
		}else {
			//没有找到任何cookie
			Cookie c=new Cookie("cart","123");
			response.addCookie(c);
		}
	}

}
