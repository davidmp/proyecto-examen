<%-- 
    Document   : actualizar
    Created on : 21-sep-2012, 13:50:33
    Author     : Narda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/ht
    </head>ml; charset=UTF-8">
        <title>Nanalabus</title>
        <%-- aca tiene que ir todo el reporte --%>   
        <%-- aca tiene que ir todo el reporte --%>   
        <%-- aca tiene que ir todo el reporte --%>   
    <body>
        <%--Aqui estoy creando el formulario.....  --%>
        <h1>Aqui esta formulario de actualizar</h1>
        <form name="actualizar" action="../../../AlumnoControl" method="POST">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="4">Formulario Actualizar Alumno</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Ingrese Codigo para actualizar</td>
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
                        <td>TelÈfono</td>
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
                            <input type="hidden" name="opt" value="6"/>    
                            <input type="submit" value="Actualizar" name="actualizar" />
                            <input type="button" value="Cancelar" name="cancelar"  />
                        </td>
                       
                    </tr>
                   
                </tbody>
            </table>

        </form>
         <a href="../../../index.jsp">Ir al index</a>
        
        
    
    </body>
    
    
    
</html>