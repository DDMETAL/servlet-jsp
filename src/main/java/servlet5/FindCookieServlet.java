package servlet5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FindCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		//读取浏览器发送过来的所有cookie
		Cookie[] cookies=request.getCookies();
		//有可能返回null
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				Cookie c=cookies[i];
				String name=c.getName();
				String value=URLDecoder.decode(c.getValue(),"UTF-8");
				out.println("name:"+name+" "+"value:"+value+"<br/>");
			}
		}else {
			//没有找到任何cookie
			out.println("没有找到任何cookie");
		}
	}

}
