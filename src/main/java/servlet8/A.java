package servlet8;
/**
 * Servlet������
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
		
		//����GenericServlet�ṩ��getServletContext�������������
		ServletContext sctx=getServletContext();
		sctx.setAttribute("username", "dmetal");
		//��ȡȫ�ֳ�ʼ������
		String company=sctx.getInitParameter("company");
		System.out.println("company:"+company);
	}

}
