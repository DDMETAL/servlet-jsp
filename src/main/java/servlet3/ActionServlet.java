package servlet3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException,IOException{
			System.out.println("ActionServlet's service()");
			/*
			 * 分析请求资源路径,依据分析结果，叼用不同的分支来处理
			 */
			//获得请求资源路径
			String uri=request.getRequestURI();
			System.out.println("uri:"+uri);
			//分析请求资源路径
			String action=uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
			System.out.println("action:"+action);
			//依据分析结果，调用不同的分支来处理
			if("/list".equals(action)) {
				System.out.println("处理list请求");
			}else if("/add".equals(action)) {
				System.out.println("处理add请求");
			}
	}
}
