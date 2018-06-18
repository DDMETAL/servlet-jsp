package servlet2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SomeServlet extends HttpServlet {
	public SomeServlet() {
		System.out.println("SomeServlet's constructor");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("SomeServlet's init()");
	}
	
	@Override
	public void destroy() {
		System.out.println("SomeServlet's destroy()");
	}

	public void doGet(
			HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException,IOException{
			System.out.println("SomeServlet's service()");
			/*
			 * 通过继承自GenericServlet的getServletConfig方法来获得ServletConfig对象
			 */
			ServletConfig config=getServletConfig();
			//读取初始化参数
			String company=config.getInitParameter("company");
			System.out.println("company:"+company);
	}
}
