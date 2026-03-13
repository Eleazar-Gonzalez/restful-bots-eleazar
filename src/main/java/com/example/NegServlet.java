package com.example;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");

        try {
            int n = Integer.parseInt(req.getParameter("n"));
            int result = -n;

            String json = "{ \"operation\": \"neg\", \"n\": " + n + ", \"result\": " + result + " }";
            resp.getWriter().write(json);

        } catch (Exception e) {
            resp.getWriter().write("{ \"error\": \"Invalid or missing parameters\" }");
        }
    }
}
