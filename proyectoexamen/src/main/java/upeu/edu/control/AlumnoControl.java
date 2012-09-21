/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.edu.bussines.AlumnoBussines;
import upeu.edu.to.AlumnoTO;

/**
 *
 * @author PC
 */
@WebServlet(name = "AlumnoControl", urlPatterns = {"/AlumnoControl"})
public class AlumnoControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int opt =  Integer.parseInt(request.getParameter("opt")); //para que me acepte valor del case enteros int s 
        
        //String opt= request.getParameter("opt");
        
        
        AlumnoBussines ab;
        try {
            
          switch(opt){
              // estoy redireccionando a donde quiero que vaya para que muestre mi vista jsp en esta caso ira a insert
                case 1:{
                // mi case reportar 
                    
                   
                response.sendRedirect("Acceso/Modulos/Alumno/insert.jsp");
                }break; 
                
                // aca insertaremos por el metodo post que recibiremos desde el jsp insert
                // y llamamo al bussienes que en si es que se encarga de insertar
                case 2:
                    
                    // mi case insertar
                {
                ab=new AlumnoBussines();
                ab.insertarAlumno(request);
                ab=new AlumnoBussines();
                response.sendRedirect("Acceso/Modulos/Alumno/insert.jsp");
                    
                }break;
                   
                case 3:{//mi case eliminar
                ab=new AlumnoBussines();
                int idAlum=Integer.parseInt(request.getParameter("codigo"));
                ab.eliminarAlumno(idAlum);
                
                response.sendRedirect("Acceso/Modulos/Alumno/reporte.jsp");
                
                }
                    
                case 4:{
                
                    //recuperar id  
                    
                    ab=new AlumnoBussines();
                    AlumnoTO to=ab.buscarAlumnoid(request.getParameter("idalumno"));
                    request.getSession().setAttribute("listaalumno", to);
                    response.sendRedirect("Acceso/Modulos/Alumno/eliminarxcodigo.jsp");
                    
                    
                }break;    
                     case 5:{
                
                    // Chahuarez implementa el codigo de reportar acaaaaaaaaaaa!!!! attt narda
                    
                         
                   response.sendRedirect("Acceso/Modulos/Alumno/actualizar.jsp");

                    
                }break; 
                         case 6:{
                
                    // Chahuarez implementa el codigo de reportar acaaaaaaaaaaa!!!! attt narda
                    
                   ab= new AlumnoBussines();
                   ab.actualizarAlumno(request);
                   response.sendRedirect("Acceso/Modulos/Alumno/actualizar.jsp");

                    
                }break; 
                    
          } 
        } finally {            
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
