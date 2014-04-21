/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.store.controller;

import com.store.model.Color;
import com.store.model.Producto;
import com.store.model.Talla;
import com.store.model.TipoProducto;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nish
 */
@WebServlet(name = "ListaProductos", urlPatterns = {"/lista_productos.view"})
public class ListaProductos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> productos = new LinkedList();
        productos.add(new Producto(Color.CAFE, Talla.CHICA, 
                TipoProducto.PLAYERA, "Playera Squalo importada", 
                1, 127.32));
        productos.add(new Producto(Color.MORADO, Talla.MEDIANA, 
                TipoProducto.PANTALON, "Pantalon wrangler de mezclilla", 
                2, 200.56));
        productos.add(new Producto(Color.AMARILLO, Talla.GRANDE, 
                TipoProducto.CAMISA, "Camisa de vestir manga ", 
                3, 500.99));
        productos.add(new Producto(Color.AZUL, Talla.EXTRA_GRANDE, 
                TipoProducto.BLUSA, "Blusa informal", 
                4, 30.67));
        
        request.setAttribute("productos", productos);
        RequestDispatcher rd = request.getRequestDispatcher("lista_productos.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
