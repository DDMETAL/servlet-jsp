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
					//�ҵ�cookie����ʾֵ
					out.println(c.getValue());
					flag=true;
				}
			}
			//û���ҵ���Ϊcart��cookie
			if(!flag) {
				Cookie c=new Cookie("cart","123");
				response.addCookie(c);
			}
		}else {
			//û���ҵ��κ�cookie
			Cookie c=new Cookie("cart","123");
			response.addCookie(c);
		}
	}

}
