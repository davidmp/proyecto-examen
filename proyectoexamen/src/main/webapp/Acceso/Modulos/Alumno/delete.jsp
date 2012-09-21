<%-- 
    Document   : reporte
    Created on : 21-sep-2012, 12:37:59
    Author     : joseoz1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        form name="actualizar" action="../../../AlumnoControl" method="POST">
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
        
    </body>
</html>
