/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.dao;

import upeu.edu.to.AlumnoTO;
import upeu.edu.util.DBConn;

public class AlumnoDAO extends DBConn{
    
   public int insertarAlumno(AlumnoTO to) {
        int r=0;
        try {
            getConexionDb();
           ps=con.prepareStatement("insert into "
                   +"alumno(codigo, nombre, apellidos, eap, sexo, email, telefono, estado) "
                   + "values (?, ?, ?, ?, ?, ?, ?, ?)"); 
            ps.setString(1, to.getCodigo());
            ps.setString(2, to.getNombre());
            ps.setString(3, to.getApellidos());
            ps.setString(4, to.getEap());
            ps.setString(5, to.getSexo());
            ps.setString(6, to.getEmail());
            ps.setString(7, to.getTelefono());
            ps.setString(8, to.getEstado());

            if (ps.executeUpdate() == 1) {
                r=1;    
                System.out.println("Insertado!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return r;
    }  
    
}
