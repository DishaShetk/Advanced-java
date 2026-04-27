package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.ProductDAO;
import com.model.Product;

@WebServlet("/add")
public class AddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Product p = new Product();

            p.setId(Integer.parseInt(request.getParameter("id")));
            p.setName(request.getParameter("name"));
            p.setCategory(request.getParameter("category"));
            p.setPrice(Double.parseDouble(request.getParameter("price")));
            p.setQuantity(Integer.parseInt(request.getParameter("quantity")));

            ProductDAO dao = new ProductDAO();
            dao.addProduct(p);

            response.getWriter().println("Product Added Successfully!");

        } catch (Exception e) {

            response.getWriter().println(e);
        }
    }
}