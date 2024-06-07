import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class Time1 extends HttpServlet {


    public void serviceRequest(HttpServletRequest request,
                                HttpServletResponse response)
                                throws ServletException, java.io.IOException
    {
        // Jaki jest preferowany język klienta?
        Locale locale = request.getLocale();


        // Ustalenie typu i kodowania odpowiedzi
        // Musi być ustalone przed uzyskaniem strumienia wyjściowego
        response.setContentType("text/html; charset=UTF-8");

        // Pobranie strumienia wyjściowego
        // z zapewnieniem własciwego kodowania
        // czasami wystarcza samo: PrintWriter out = response.getWriter()

        PrintWriter out = new PrintWriter(
                new OutputStreamWriter(response.getOutputStream(), "UTF-8"),
                true);



        out.println("<h2>" + "Pierwszy" + "<br>" + "Servlet" + "<br>" );
        out.println(getDate(locale) + "</h2>");
        out.close();
    }
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, java.io.IOException
    {
        serviceRequest(request,response);
    }


    private String getDate(Locale loc) {
        Date data = new Date();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.MEDIUM,
                loc);
        return df.format(data);
    }


}