<%-- 
    Document   : reporte
    Created on : 21-sep-2012, 12:37:59
    Author     : joseoz1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="upeu.edu.to.AlumnoTO" %>
<%@page language="java" import="java.util.List" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Actualizar!</h1>
<%-- aca tiene que ir todo el reporte --%>        
 <%-- aca tiene que ir todo el reporte --%>  
 <%-- aca tiene que ir todo el reporte --%>   
      
 
 
         <table border="1">
            <thead>
                <tr><%-- //filaaa--%>
                    <th colspan="5" style="color: brown; background-color: bisque">Reporte de Alumnos</th><%-- TH columnaa cuando estamos en HEAD--%>
                  
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>#</td><%--TD columna cuando estamos en cuerpo BODY--%>
                    <td>Codigo</td>
                    <td>Nombre</td>
                    <td>Apellidos</td>
                    <td>Telefono</td>
                 
                </tr>
               <% 
              List<AlumnoTO> lista=null;
              lista=(List<AlumnoTO>)request.getSession().getAttribute("listaAlumno");
              int i=0;
              if(lista!=null){
              for(AlumnoTO to: lista){//este for no acepta nulos
                %> 
                <tr>
                    <td><%=++i%></td>
                    <td><%=to.getCodigo()%></td>
                    <td><%=to.getNombre()%></td>
                    <td><% out.print(to.getApellidos());%></td>
                    <td><% out.print(to.getTelefono()); %></td>
                  
                </tr>
                <% }
                }  %>

            </tbody>
        </table>
          
 
 <form name="actualizar" action="../../../AlumnoControl" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Actualizar Alumno</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Ingrese Codigo para borrar</td>
                        <td><input type="text" name="codigo" id="codigo" value="" /></td>
                    </tr>
                        
                    <tr>
                        <td colspan="2"> 
                            <input type="hidden" name="opt" value="4"/>    
                            <input type="submit" value="Borrar" name="actualizar" />
                            <input type="button" value="Cancelar" name="cancelar"  />
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>

        </form>
       <a href="../../../index.jsp">Ir al index</a>
        
    </body>
</html>
