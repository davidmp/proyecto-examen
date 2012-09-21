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
        
        
        <form name="delete" action="reporte.jsp" method="POST">
        
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>codigo</td>
                        <td> <input type="text" name="codigo" value="" /></td>
                    </tr>
                    <tr>
                        <td> </td>
                        <td><input type="hidden" name="opt" value="1"/>    
                            <input type="submit" value="Guardar" name="guardar" />
                            <input type="button" value="Cancelar" name="cancelar"  /></td> 
                        
                        
                        
                        
                        
                    </tr>
                </tbody>
            </table>

        
        </form>
        
    </body>
</html>
