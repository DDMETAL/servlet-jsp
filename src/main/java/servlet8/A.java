package servlet8;
/**
 * Servlet上下文
 */
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(
			HttpServletRequest request,
			HttpServletResponse response) 
		throws ServletException, IOException {
		
		//调用GenericServlet提供的getServletContext方法获得上下文
		ServletContext sctx=getServletContext();
		sctx.setAttribute("username", "dmetal");
		//读取全局初始化参数
		String company=sctx.getInitParameter("company");
		System.out.println("company:"+company);
	}

}
