package servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
		throws ServletException, IOException {
		//获得session对象
		HttpSession session=request.getSession();
		//设置两次请求之间的最大间隔时间
	//	session.setMaxInactiveInterval(30);
		String sessionId=session.getId();
		System.out.println("sessionId:"+sessionId);
		Integer count=(Integer)session.getAttribute("count");
		if(count==null) {
			//第一次访问
			count=1;
		}else {
			//不是第一次访问
			count++;
		}
		session.setAttribute("count", count);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("第"+count+"访问");
		//删除session
	//	session.invalidate();
	}
}
