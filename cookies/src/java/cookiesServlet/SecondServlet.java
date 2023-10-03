
package cookiesServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SecondServlet  extends HttpServlet {
      public void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie ck1[]=request.getCookies();
        out.println("Welcome " +ck1[0].getValue() );
        out.close();
    }
}
