package edu.ucam.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class etiqueta extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		
		System.out.println("dentro etiqueta");
		
		try {
			pageContext.getOut().print(pageContext.getRequest().getAttribute("MSG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return super.doStartTag();
	}
	

}
