/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-04-10 21:15:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conversores.StringToInt;
import candidatos.Marina;
import candidatos.Fidelis;
import candidatos.Aecio;
import candidatos.Dilma;

public final class urna_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	try {
		String votoStr = request.getParameter("voto");
		votoStr = votoStr == null ? "0" : votoStr;
		
		
		
		int voto = StringToInt.toInt(votoStr);
		switch (voto) {
		case 1:
			Dilma.dilma++;
			application.setAttribute("dilma", Dilma.dilma);
			break;
		case 2:
			Dilma.aecio++;
			application.setAttribute("aecio", Dilma.aecio);
			break;
		case 3:
			Dilma.fidelis++;
			application.setAttribute("fidelis", Dilma.fidelis);
			break;
		case 4:
			Dilma.marina++;
			application.setAttribute("marina", Dilma.marina);
			break;
		}
	} catch (Exception e) {
		
	}

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Urna</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<form>\n");
      out.write("\t\t<button name=\"voto\" value=\"1\">Dilma</button>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<button name=\"voto\" value=\"2\">Aecio</button>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<button name=\"voto\" value=\"3\">Fidelis</button>\n");
      out.write("\t\t<br />\n");
      out.write("\t\t<button name=\"voto\" value=\"4\">Marina</button>\n");
      out.write("\t\t<br />\n");
      out.write("\t</form>\n");
      out.write("\t<a href=\"resultado.jsp\">Resultado</a>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
