package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
		throws ServletException,IOException{
		//��ȡ�������ֵ
		String name=request.getParameter("name");
		//���÷��������ص���������
		response.setContentType("text/html");
		//���һ�������
		PrintWriter out=response.getWriter();
		//������ݣ����͸��������
		out.println("<h1>Hello  "+name+"</<h1>");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String dateStr=sdf.format(date);
		out.println("<h3>"+dateStr+"</h3>");
		out.close();
		
	}
}
