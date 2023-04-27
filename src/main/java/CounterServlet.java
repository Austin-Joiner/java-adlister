import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {

    private static int count = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String reset = request.getParameter("reset");
        if (reset != null && reset.equalsIgnoreCase("true")) {
            count = -1;
            out.println("<p>The count has been reset.</p>");
        }
            count++;
            out.println("<h3>Count: " + count + "</h3>");
        }
    }

