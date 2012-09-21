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
           ps=con.prepareStatement("INSERT INTO examen.alumno( codigo, nombre, apellidos, eap, sexo, email, telefono,  estado)  VALUES (?, ?, ?, ?, ?, ?, ?,?);"); 
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
   
   
   public void eliminarAlumno(String codigo){
   
       try {
           getConexionDb();
           ps=con.prepareStatement("delete from examen.alumno where codigo=?");
           ps.setString(1, codigo);
           
           if (ps.executeUpdate()==1) {
               System.out.println("la eliminacion ha sido un exito");
               
           }
       } catch (Exception e) {
       
           
       } finally{
       getCerrarConexion();
       }
       
   
       
   }
   
   public AlumnoTO buscarAlumnoid (String idAlumno) {
   
   AlumnoTO alumno=new AlumnoTO();
       try {
           getConexionDb();
           ps=con.prepareStatement("select * from examen.alumno where id_alumno=?");
           ps.setInt(1, Integer.parseInt(idAlumno));
           rs=ps.executeQuery();
           if (rs.next())  {
               alumno.setId_alumno(rs.getInt("id_alumno"));
               alumno.setCodigo(rs.getString("codigo"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setApellidos(rs.getString("apellidos"));
               alumno.setEap(rs.getString("eap"));
               alumno.setSexo(rs.getString("sexo"));
               alumno.setEmail(rs.getString("email"));
               alumno.setTelefono(rs.getString("telefono"));
               alumno.setEstado(rs.getString("estado"));
           }
       } catch (Exception e) {
       }
       
       return alumno;
   } 
   
   //Mi metodo actualizar alumno................ :D
   public void actualizarAlumno (AlumnoTO to){
   int r=0;
        try {
            getConexionDb();
           ps=con.prepareStatement("UPDATE examen.alumno SET nombre=?, apellidos=?, eap=?, sexo=?, email=?, telefono=?, estado=?WHERE codigo=?;"); 
            
            ps.setString(1, to.getNombre());
            ps.setString(2, to.getApellidos());
            ps.setString(3, to.getEap());
            ps.setString(4, to.getSexo());
            ps.setString(5, to.getEmail());
            ps.setString(6, to.getTelefono());
            ps.setString(7, to.getEstado());
            ps.setString(8, to.getCodigo());
            if (ps.executeUpdate() == 1) {
                r=1;    
                System.out.println("Hecho!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

      
   
   
   
   }
   
    
}
