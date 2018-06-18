package servlet7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommentFilter implements Filter{
	private FilterConfig config;
	public void destroy() {
		
	}
	/**
	 * 容器会调用dlFilter方法来处理请求
	 * FilterChain:过滤器链,如果调用了该对象的doFilter方法，则容器会继续向下调用，否则中断请求，不再向后调用。
	 * ServletRequest是HttpServletRequest的父接口
	 * ServletResponse是HttpServletResponse的父接口
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CommentFilter's doFilter() begin");
		HttpServletRequest request=(HttpServletRequest)arg0;
		HttpServletResponse response=(HttpServletResponse)arg1;
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String content=request.getParameter("content");
		String illegalStr=config.getInitParameter("illegalStr");
		if(content.indexOf(illegalStr)!=-1) {
			out.println("含有敏感字");
		}else {
			//继续向后调用
			chain.doFilter(arg0, arg1);
		}
		System.out.println("CommentFilter's doFilter() end");
	}
	/**
	 * 实例化周，会立即执行init方法。
	 * 在执行该方法时，会将FilterConfig作为参数传进来
	 * 只会执行一次
	 */
	public void init(FilterConfig arg0) 
			throws ServletException{
		System.out.println("CommentFilter's init()");
		
		this.config=arg0;
	}
	/**
	 * 容器启动之后会立即创建过滤器对象。
	 * 只会创建一个
	 */
	public CommentFilter() {
		System.out.println("CommentFilter()");
	}
	
}
                                                                                                                                                                                                                                      