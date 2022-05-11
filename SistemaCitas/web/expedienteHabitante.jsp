

<%@page import="java.util.Arrays"%>
<%@page import="dominio.Expediente"%>
<%@page import="dominio.Habitante"%>
<%@page import="org.json.JSONObject"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   Habitante habitante = (Habitante) session.getAttribute("habitante");
   Expediente expediente = habitante.getIdExpediente();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Expediente</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <h1 id="titulo">Expediente del habitante</h1>
        <div class="informaicon" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h3>Datos personales</h3>
                <div id="divDaosPersonales">
                    <%
                            out.print(
                                    "<div id=\"divIzquierda\" class=\"caja1\">"
                                    + "<h3>Expediente</h3>"
                                    + "<div id=\"divDaosPersonales\">"
                                    + "<img src=\"data:image/png;base64," + habitante.getDatoBiometrico() + "\" width=\"100\"  height=\"100\" /> <br/>"
                                    + "<label>Nombre: "
                                    + habitante.getNombre()
                                    + "</label><br/><br/>"
                                    + "<label>Direccion: "
                                    + habitante.getDireccion()
                                    + "</label><br/><br/>"
                                    + "<label>Edad: "
                                    + habitante.getEdad()
                                    + "</label><br/><br/>"
                                    + "<label>Imagenes:</label> <br/> <br/>"
                                    + "<img src=\"data:image/png;base64," + expediente.getImagenes() + "\" width=\"200\"  height=\"200\" />"
                                    + "<br/><label>Documentos:</label> <br/> <br/>"
                                    + "<img src=\"data:image/png;base64," + expediente.getDocumento() + "\" width=\"200\"  height=\"200\" />"
                                    + "<br/><label>Informacion general del habitante: "
                                    + expediente.getInformacionGeneral()
                                    + "</label><br/><br/>"
                                    + "</div></div>"
                            );                       
                    %>
                </div>
                <button style="width:550px;" onclick="location.href = 'index.html'">Terminar registro</button>
    </body>
</html>
