package examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Simple Hello servlet.
 */

public final class Hello extends HttpServlet {


    /**
     * Respond to a GET request for the content produced by
     * this servlet.
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are producing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
      throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();        
        if(shouldGenerate(request.getParameter("Key")))
        writer.println(getOutput(request.getParameter("Key")));
                       else
        writer.println(getOutput("Other Names Given"));
                      
    }
    
    public boolean shouldGenerate(String l_value)
     {
        if(l_value=="Kathir")
            return true;
         else
             return false;
     
     }
    public String getOutput(String l_input)
    {
        StringBuffer l_strBuffer=new StringBuffer("<html><head><title>Sample Application Servlet Page</title></head>");
        l_strBuffer.append("<body bgcolor=white>");

        l_strBuffer.append("<table border=\"0\" cellpadding=\"10\">");
        l_strBuffer.append("<tr>");
        l_strBuffer.append("<td>");
        l_strBuffer.append("<img src=\"images/springsource.png\">");
        l_strBuffer.append("</td>");
        l_strBuffer.append("<td>");
        l_strBuffer.append("<h1>Sample Application Servlet</h1>");
        l_strBuffer.append("</td>");
        l_strBuffer.append("</tr>");
        l_strBuffer.append("</table>");

        l_strBuffer.append("This is the output of a servlet that is part of");
        l_strBuffer.append("the Hello, World application. Prakash Servlet change");
        l_strBuffer.append(" This is input").append(l_input);

        l_strBuffer.append("</body>");
        l_strBuffer.append("</html>");
        return l_strBuffer.toString();
    }
} 
