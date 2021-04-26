import javax.servlet.*;
import java.io.*;
public class TestServlet extends GenericServlet
{
public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
{
String fn = req.getParameter("text1").trim();
String sn = req.getParameter("text2").trim();
String ch = req.getParameter("r1").trim();
int n1 = Integer.parseInt(fn);
int n2 = Integer.parseInt(sn);
int choice = Integer.parseInt(ch);
int rs=0;




	switch(choice)
	{
	case 1 : rs = n1 + n2; break;
	case 2 : rs = n1 - n2; break;
	case 3 : rs = n1 * n2; break;
	case 4 : rs = n1 / n2; break;
	case 5 : rs = n1 % n2; break;
	}
	res.setContentType("text/html");
PrintWriter pw = res.getWriter();
pw.println("<html><center><h1>Result</h1><hr><br><br>");
pw.println("Result is : " + rs + "<br>");
pw.println("</center><a href=index.html>Main Page...</a></html>");
	pw.close();
	}
}