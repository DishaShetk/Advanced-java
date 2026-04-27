package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Product;

public class ProductDAO {

    Connection con;

    public ProductDAO() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/productdb",
            "root",
            "password"
        );
    }

    public void addProduct(Product p) throws Exception {

        PreparedStatement ps =
        con.prepareStatement(
        "insert into Products values(?,?,?,?,?)");

        ps.setInt(1, p.getId());
        ps.setString(2, p.getName());
        ps.setString(3, p.getCategory());
        ps.setDouble(4, p.getPrice());
        ps.setInt(5, p.getQuantity());

        ps.executeUpdate();
    }
}