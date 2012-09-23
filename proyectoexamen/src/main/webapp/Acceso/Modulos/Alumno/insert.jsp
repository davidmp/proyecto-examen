<%-- 
    Document   : insert
    Created on : 20-sep-2012, 21:57:49
    Author     : PC
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
        <h1>formulario de insert!</h1>
       
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
                
        <form name="Form Alumno" method="post" action="../../../AlumnoControl">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Insertar Alumno</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Código:</td>
                        <td><input type="text" name="codigo" id="codigo" value="" /></td>
                    </tr>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre" class="mamani" value="" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos:</td>
                        <td><input type="text" name="apellidos" value="" /></td>
                    </tr>
                    <tr>
                        <td>E.A.P:</td>
                        <td><select name="eap">
                                <option value="Sistemas">EAP Sistemas</option>
                                <option value="Civil">EAP Civil</option>
                                <option value="Alimentos">EAP Alimentos</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Sexo:</td>
                        <td>Masculino<input type="radio" name="sexo" value="M" />
                            Femenino<input type="radio" name="sexo" value="F" />
                        </td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Teléfono</td>
                        <td><input type="text" name="telefono" value="" /></td>
                    </tr>
                    <tr>
                        <td>Estado:</td>
                        <td>Activo<input type="radio" name="estado" value="1" checked="" />
                            Desactivo<input type="radio" name="estado" value="0" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"> 
                            <input type="hidden" name="opt" value="2"/>    
                            <input type="submit" value="Guardar" name="guardar" />
                            <input type="button" value="Cancelar" name="cancelar"  />
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>

        </form>
        <a href="../../../index.jsp">Ir al index</a>
        
        
    </body>
</html>
