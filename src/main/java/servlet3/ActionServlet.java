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
			 * ����������Դ·��,���ݷ�����������ò�ͬ�ķ�֧������
			 */
			//���������Դ·��
			String uri=request.getRequestURI();
			System.out.println("uri:"+uri);
			//����������Դ·��
			String action=uri.substring(uri.lastIndexOf("/"),uri.lastIndexOf("."));
			System.out.println("action:"+action);
			//���ݷ�����������ò�ͬ�ķ�֧������
			if("/list".equals(action)) {
				System.out.println("����list����");
			}else if("/add".equals(action)) {
				System.out.println("����add����");
			}
	}
}
