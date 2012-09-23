/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.bussines;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import upeu.edu.dao.AlumnoDAO;
import upeu.edu.to.AlumnoTO;


public class AlumnoBussines {
    
    public AlumnoDAO dao;
  
    //creamos el metdo insert apoyandonos en el insert que previa mente se creo en el dao 
     public void insertarAlumno(HttpServletRequest r){
        AlumnoTO to = new AlumnoTO();
        dao = new AlumnoDAO();        
        to.setCodigo(r.getParameter("codigo")==null?"":r.getParameter("codigo"));
        to.setNombre(r.getParameter("nombre")==null?"":r.getParameter("nombre"));
        to.setApellidos(r.getParameter("apellidos")==null?"":r.getParameter("apellidos"));
        to.setEap(r.getParameter("eap")==null?"":r.getParameter("eap"));
        to.setSexo(r.getParameter("sexo")==null?"":r.getParameter("sexo"));
        to.setEmail(r.getParameter("email")==null?"":r.getParameter("email"));
        to.setTelefono(r.getParameter("telefono")==null?"":r.getParameter("telefono"));
        to.setEstado(r.getParameter("estado")==null?"":r.getParameter("estado"));
        dao.insertarAlumno(to);        
    }
     
     public void eliminarAlumno(HttpServletRequest r){
     
     dao=new AlumnoDAO();
     String codigo_captura=r.getParameter("codigo")==null?"":r.getParameter("codigo");
     dao.eliminarAlumno(codigo_captura);
     
     
     }
     
      public List reportarAlumno(){    
        dao=new AlumnoDAO();
        return  dao.reporteAlumno();
    }

     public AlumnoTO buscarAlumnoid (String id){
     
     dao=new AlumnoDAO();
     return dao.buscarAlumnoid(id);
     
     }
     public void actualizarAlumno(HttpServletRequest r){
      AlumnoTO to = new AlumnoTO();
        dao = new AlumnoDAO();        
        to.setCodigo(r.getParameter("codigo")==null?"":r.getParameter("codigo"));
        to.setNombre(r.getParameter("nombre")==null?"":r.getParameter("nombre"));
        to.setApellidos(r.getParameter("apellidos")==null?"":r.getParameter("apellidos"));
        to.setEap(r.getParameter("eap")==null?"":r.getParameter("eap"));
        to.setSexo(r.getParameter("sexo")==null?"":r.getParameter("sexo"));
        to.setEmail(r.getParameter("email")==null?"":r.getParameter("email"));
        to.setTelefono(r.getParameter("telefono")==null?"":r.getParameter("telefono"));
        to.setEstado(r.getParameter("estado")==null?"":r.getParameter("estado"));
        dao.actualizarAlumno(to);
         
     
     
     
     }
}

