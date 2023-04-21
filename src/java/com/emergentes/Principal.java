/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String nombre = (request.getParameter("nomnbre") == null)? "SIN DATO": request.getParameter("nombre");
        
        String auxi = (request.getParameter("edad")!= null)? request.getParameter("edad"): "0";
        int edad = Integer.parseInt(auxi);
        // Desde la URL o desde un enlace 
      
        // Especificando el tipo de respuesta del servlet
      response.setContentType("text/html;charset=UTF-8");
      // Definiendo la variable para escribir el contenido de la respuesta
      PrintWriter out = response.getWriter();
      
      out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Principal</title>");            
            out.println("</head>");
            
            out.println("<body>");
            out.println("<h1>Hola "+nombre+", bienvenido al curso </h1>");
            if (edad >0){
            out.println("<h1>Tienes: "+edad+", años de edad</h1>");
            }
            out.println("</body>");
            out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // Desde un formulario 
    }
}
