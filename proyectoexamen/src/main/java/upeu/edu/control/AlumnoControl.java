/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.bussines.AlumnoBussines;

/**
 *
 * @author PC
 */
@WebServlet(name = "AlumnoControl", urlPatterns = {"/AlumnoControl"})
public class AlumnoControl extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String opt= request.getParameter("opt");
        AlumnoBussines ab;
        try {
            
          switch(opt){
              // estoy redireccionando a donde quiero que vaya para que muestre mi vista jsp en esta caso ira a insert
                case "I":{
                
                response.sendRedirect("Acceso/Modulos/Alumno/insert.jsp");
                }break; 
                
                // aca insertaremos por el metodo post que recibiremos desde el jsp insert
                // y llamamo al bussienes que en si es que se encarga de insertar
                case "1":
                {
                ab=new AlumnoBussines();
                ab.insertarAlumno(request);
                ab=new AlumnoBussines();
                response.sendRedirect("Acceso/Modulos/Alumno/insert.jsp");
                    
                }break;
                   
          } 
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
