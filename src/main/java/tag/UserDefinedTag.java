package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UserDefinedTag extends SimpleTagSupport{
	private String msg;
	private int qty;
	
	public UserDefinedTag() {
		System.out.println("UserDefinedTag()");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("setMsg()"+msg);
		this.msg = msg;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		System.out.println("setQty()"+qty);
		this.qty = qty;
	}

	@Override
	public void doTag() throws JspException, IOException {
		System.out.println("doTag()");
		//ͨ���̳���SimpleTagSupport�ṩ�ķ���
		//�����PageContext
		PageContext pctx=(PageContext)getJspContext();
		//PageContext�ṩ�˻������������������ķ���
		JspWriter out=pctx.getOut();
		for(int i=0;i<qty;i++) {
			out.println(msg+"<br/>");
		}
	}
	
}
