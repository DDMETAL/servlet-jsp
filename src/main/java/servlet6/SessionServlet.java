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
		//���session����
		HttpSession session=request.getSession();
		//������������֮��������ʱ��
	//	session.setMaxInactiveInterval(30);
		String sessionId=session.getId();
		System.out.println("sessionId:"+sessionId);
		Integer count=(Integer)session.getAttribute("count");
		if(count==null) {
			//��һ�η���
			count=1;
		}else {
			//���ǵ�һ�η���
			count++;
		}
		session.setAttribute("count", count);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("��"+count+"����");
		//ɾ��session
	//	session.invalidate();
	}
}
