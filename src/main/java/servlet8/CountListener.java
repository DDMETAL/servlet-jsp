package servlet8;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class CountListener implements HttpSessionListener{
	/**
	 * session创建之后，会调用sessionCreated方法
	 */
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("sessionCreated");
		//先获得ServletContext
		HttpSession session=arg0.getSession();
		ServletContext sctx=session.getServletContext();
		//将人数绑定到上下文
		Integer count=(Integer)sctx.getAttribute("count");
		if(count==null) {
			count=1;
		}else {
			count++;
		}
		sctx.setAttribute("count", count);
	}
	/**
	 * session被销毁后，会调用sessionDestroyed方法
	 */
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("sessionDestroyed");
		ServletContext sctx=arg0.getSession().getServletContext();
		Integer count=(Integer)sctx.getAttribute("count");
		count--;
		sctx.setAttribute("count", count);
		
	}

}
