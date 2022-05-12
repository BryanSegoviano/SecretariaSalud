

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
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <img src="img/banner.png" alt="secretariasalud" width="1200">
        <h1 id="titulo">Expediente del habitante</h1>
        <div class="informacion" id="divInfo">

            <div id="divIzquierda" class="caja1">
                <h2>Datos personales</h2>
                <div id="divDaosPersonales">
                    <%
                        out.print(
                                "<div id=\"divIzquierda\" class=\"caja1\">"
                                + "<h2>Expediente</h2>"
                                + "<div id=\"divDaosPersonales\"><br/>"
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
                <br/>
                <button onclick="location.href = 'index.html'">Terminar registro</button>
            </div>

        </div>    
        <img src="img/bannerabajo.png" alt="gobiernomex" width="1200">  
    </body>
</html>
