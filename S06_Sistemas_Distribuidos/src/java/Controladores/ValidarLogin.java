/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controladores;


import Entidades.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author danie
 */
public class ValidarLogin extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ValidarLogin</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ValidarLogin at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
        
        Conexion.Conexion conBD = new Conexion.Conexion();
        Connection conn = conBD.Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        
        String usuario=request.getParameter("txtUsuario");
        String contraseña=request.getParameter("contra");


        try {
            String sql = "SELECT * FROM t_usuario WHERE IdUsuario=? AND Passwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            
           
            rs = ps.executeQuery();

            // Si encuentra una fila existente en la BD 
            if (rs.next()) {
                // Aquí puedes redirigir a otra página
                // Por ejemplo, supongamos que quieres redirigir a "pagina_siguiente.jsp"
                
                Usuario nuser=new Usuario(usuario,contraseña);
                HttpSession session = request.getSession();
                session.setAttribute("user", nuser);
                request.getRequestDispatcher("MenuPrincipal.jsp").forward(request, response);
                
                
                
                //response.sendRedirect("MenuPrincipal.jsp");
            } else {
                response.sendRedirect("Login.jsp");
            }


        } catch (SQLException ex) {
            System.out.println("Error de SQL..." + ex.getMessage());
        } finally{
            conBD.Discconet();
        }
        
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
