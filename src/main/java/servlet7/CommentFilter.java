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
	 * ���������dlFilter��������������
	 * FilterChain:��������,��������˸ö����doFilter��������������������µ��ã������ж����󣬲��������á�
	 * ServletRequest��HttpServletRequest�ĸ��ӿ�
	 * ServletResponse��HttpServletResponse�ĸ��ӿ�
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
			out.println("����������");
		}else {
			//����������
			chain.doFilter(arg0, arg1);
		}
		System.out.println("CommentFilter's doFilter() end");
	}
	/**
	 * ʵ�����ܣ�������ִ��init������
	 * ��ִ�и÷���ʱ���ὫFilterConfig��Ϊ����������
	 * ֻ��ִ��һ��
	 */
	public void init(FilterConfig arg0) 
			throws ServletException{
		System.out.println("CommentFilter's init()");
		
		this.config=arg0;
	}
	/**
	 * ��������֮���������������������
	 * ֻ�ᴴ��һ��
	 */
	public CommentFilter() {
		System.out.println("CommentFilter()");
	}
	
}
                                                                                                                                                                                                                                      