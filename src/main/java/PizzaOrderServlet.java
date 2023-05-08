import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String[] toppings = request.getParameterValues("toppings");
        String size = request.getParameter("size");
        String address = request.getParameter("delivery");

        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + Arrays.toString(toppings));
        System.out.println("Size: " + size);
        System.out.println("Address: " + address);

        request.getRequestDispatcher("/pizza.jsp").forward(request,response);
    }
}