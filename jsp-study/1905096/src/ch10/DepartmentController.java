package ch10;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DepartmentController")
public class DepartmentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        String path = "";

        if (type == null || type.equals("select")) {
            path = "./ch07/ex07-01.jsp";
        } else if (type.equals("insert")) {
            path = "./ch07/ex07-02.jsp";
        } else if (type.equals("update")) {
            path = "./ch07/ex07-03.jsp";
        } else {
            path = "./ch07/ex07-04.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
