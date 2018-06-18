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
		//��ȡ��������͹���������cookie
		Cookie[] cookies=request.getCookies();
		//�п��ܷ���null
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				Cookie c=cookies[i];
				String name=c.getName();
				String value=URLDecoder.decode(c.getValue(),"UTF-8");
				out.println("name:"+name+" "+"value:"+value+"<br/>");
			}
		}else {
			//û���ҵ��κ�cookie
			out.println("û���ҵ��κ�cookie");
		}
	}

}
