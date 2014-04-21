<%@page import="com.store.model.Producto"%>
<%@page import="java.util.List"%>
<%-- 
    Document   : lista_productos
    Created on : 12-abr-2014, 9:52:19
    Author     : Nish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Develop Store: Listado de productos</title>
    </head>
    <body>
        <table cellpading="5" cellspacing="0" width="800" border="0">
            <tbody>
                <tr bgcolor="#3882c7" align="center" valign="center" height="20">
                    <td>
                        <h2><font color="white">Develop Store: Inicio</h2>
                    </td>
                </tr>
            </tbody>
        </table>
        <h2>Lista de productos:</h2>
        <table id="table" width="800" border="1">
            <thead>
                <tr>
                    <th>No.</th>
                    <th>Descripcion</th>
                    <th>Tipo</th>
                    <th>Color</th>
                    <th>Talla</th>
                    <th>Precio</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Producto> productos = (List<Producto>) request.getAttribute("productos");
                    int i=0;
                    for (Producto producto:productos) {
                        i++;
                %>
                <tr id="td">
                    <td><%=i%></td>
                    <td><%=producto.getDescripcion() %></td>
                    <td><%=producto.getTipoProducto() %></td>
                    <td><%=producto.getColor()%></td>
                    <td><%=producto.getTalla() %></td>
                    <td><%=producto.getPrecio()%></td>
                </tr>
                <% }%>
            </tbody>
        </table>

    </body>
</html>
