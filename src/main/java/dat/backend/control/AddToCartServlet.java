package dat.backend.control;

import dat.backend.model.entities.Bottom;
import dat.backend.model.entities.Cupcake;
import dat.backend.model.entities.ShoppingCart;
import dat.backend.model.entities.Top;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.CupcakeFacade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddToCartServlet", value = "/addtocart")
public class AddToCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

        int topId = Integer.parseInt(request.getParameter("cupcaketop"));
        int bottomId = Integer.parseInt(request.getParameter("cupcakebottom"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ConnectionPool connectionPool = new ConnectionPool();
        Top top = CupcakeFacade.getTopById(topId,connectionPool);
        Bottom bottom = CupcakeFacade.getBottomById(bottomId,connectionPool); //skal også lave datamapper

        Cupcake cupcake = new Cupcake(top, bottom,quantity);

        cart.add(cupcake); //ligger til
        session.setAttribute("cart",cart); //gemmer ny cart efter vi har lagt til
        request.setAttribute("cartsize",cart.getNumberOfCupcakes());
        request.getRequestDispatcher("WEB-INF/welcome.jsp").forward(request, response);

    }
}
