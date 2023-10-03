
package cookiesServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
      
        
        response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String str = request.getParameter("un");
    
   
    out.println("You are Welcome " + str);
 
    Cookie ck = new Cookie("n",str); //set cookies
    response.addCookie(ck);
    out.println("<form action = 'second'  method = 'Post'>");
    out.println("<input type= 'submit' value = 'Insert'>");
    out.println("</form");
    
    
    
    }
}
