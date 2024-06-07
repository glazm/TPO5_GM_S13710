import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class PrepareResultServlet extends HttpServlet {
    private ServletContext context;

    public void init(){
        context = getServletContext();
    }

    public void serviceRequest(HttpServletRequest request,
                               HttpServletResponse response)
            throws ServletException, java.io.IOException
    {
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();

        response.setContentType("text/html; charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<center><h2>Aplikacja WEB</center></h2><hr>");
        out.println("<form method=\"post\">");
        out.println("Rodzaj samochodu<br>");
        out.println("<input type=\"text\" size=\"30\" name=\"rodzaj\"><br>");
        out.println("<br><input type=\"submit\" value=\"Wyszukaj\">");
        out.println("</form>");

        out.println("<table cellpadding=\"3\" border=\"1\"><tr><th>Nazwa</th>");
        out.println("<th>Rocznik</th>");
        out.println("<th>Pochodzenie</th></tr>");
        out.println("<tr><td>Dane1</td>");
        out.println("<td>Dane1</td>");
        out.println("<td>Dane1</td></tr>");
        out.println("<tr><td>Dane1</td>");
        out.println("<td>Dane1</td>");
        out.println("<td>Dane1</td></tr>");
        out.println("</table>");

    }

    public void doGet(HttpServletRequest request,
                               HttpServletResponse response)
            throws ServletException, java.io.IOException
    {
        serviceRequest(request,response);
    }
    public void doPost(HttpServletRequest request,
                               HttpServletResponse response)
            throws ServletException, java.io.IOException
    {
        serviceRequest(request,response);
    }
}
