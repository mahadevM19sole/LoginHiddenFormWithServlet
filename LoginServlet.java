import java.io.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet
{
  public void service(HttpServletRequest req,HttpServletResponse res)
  {
    try
    {
      String s1=req.getParameter("uname");
      String s2=req.getParameter("pwd");
      PrintWriter pw=res.getWriter();
      pw.println("<html><body bgcolor=black text=red><center>");
      if(s1.equals("abc") && s2.equals("xyz"))
      {
        pw.println("Welcome "+s1);
      }
      else
      {
        pw.println("Invalid username and password");
     }
      pw.println("</center></body></html>");
   }
     catch(Exception e)
      {
        System.out.println(e);
      }
  }
}